package com.csyy.core.apisupport.impl;

import java.util.List;

import javax.annotation.Resource;

import com.csyy.core.exception.CommonException;
import org.springframework.stereotype.Service;

import com.csyy.core.apisupport.BaseService;
import com.csyy.core.constant.Constants;
import com.csyy.core.datasource.api.CacheReadAndWriteDataSessionFactory;
import com.csyy.core.datasource.param.CustomSQL;
import com.csyy.core.datasource.param.ESQLOperator;
import com.csyy.core.datasource.param.Param;
import com.csyy.core.datasource.param.ParamBuilder;
import com.csyy.core.datasource.param.SQLCreator;
import com.csyy.core.exception.BusinessException;
import com.csyy.core.obj.Pagination;

@Service
public class BaseServiceImpl implements BaseService {

	@Resource
	protected CacheReadAndWriteDataSessionFactory factory;

	@Override
	public <T> Pagination<T> queryClassPagination(Class<T> clazz, Param param,
			int pageNo, int pageSize) throws BusinessException {
		if (param == null)
			param = ParamBuilder.getInstance().getParam();
		param.add(ParamBuilder.nv(Constants.SQLConstants.PAGE_NO, pageNo));
		// 如果每页显示的数据为0时，不需要进行分析
		if (pageSize > 0) {
			param.add(ParamBuilder.nv(Constants.SQLConstants.PAGE_SIZE,
					pageSize));
		}

		long count = 0L;
		List<T> list = factory.getReadDataSession().queryListResult(clazz,
				param);
		// 如果list为空则没有必须再查询总条数
		if (list != null && list.size() > 0) {
			count = factory.getReadDataSession().queryListResultCount(clazz,
					param);
		}
		Pagination<T> pageResult = new Pagination<>(list, pageNo, pageSize);
		// 如果总条数为零则不需要设置初始化数值
		if (count > 0L) {
			pageResult.setRecordsTotal(count);
		}
		return pageResult;
	}

	@Override
	public <T> Pagination<T> queryClassPagination(Class<T> clazz,
			CustomSQL whereSQL, int pageNo, int pageSize)
			throws BusinessException {
		if (whereSQL == null)
			whereSQL = SQLCreator.where();
		long count = 0L;
		Pagination<T> pageResult = null;
		// 如果每页显示的数据为0时，不需要进行分页
		if (pageSize > 0) {
			count = factory.getReadDataSession().queryListResultCountByWhere(
					clazz, whereSQL);
			whereSQL.operator(ESQLOperator.LIMIT).v((pageNo - 1) * pageSize)
					.operator(ESQLOperator.COMMA).v(pageSize);

			List<T> list = factory.getReadDataSession().queryListResultByWhere(
					clazz, whereSQL);
			pageResult = new Pagination<>(list, pageNo, pageSize);
			// 如果总条数为零则不需要设置初始化数值
			if (count > 0L) {
				pageResult.setRecordsTotal(count);
			}
		}
		return pageResult;
	}

	@Override
	public <T> Pagination<T> queryClassPagination(Class<T> clazz,
			String listElementId, String countElementId, Param param,
			int pageNo, int pageSize) throws BusinessException {
		param.add(ParamBuilder.nv(Constants.SQLConstants.PAGE_NO, pageNo));
		// 如果每页显示的数据为0时，不需要进行分析
		if (pageSize > 0) {
			param.add(ParamBuilder.nv(Constants.SQLConstants.PAGE_SIZE,
					pageSize));
		}

		long count = 0L;
		List<T> list = factory.getReadDataSession()
				.queryVOListByCustomElementName(clazz, listElementId, param);
		// 如果list为空则没有必须再查询总条数
		if (list != null && list.size() > 0) {
			count = factory.getReadDataSession()
					.querySingleVOByCustomElementName(Long.class,
							countElementId, param);
		}
		Pagination<T> pageResult = new Pagination<T>(list, pageNo, pageSize);
		// 如果总条数为零则不需要设置初始化数值
		if (count > 0L) {
			pageResult.setRecordsTotal(count);
		}
		return pageResult;
	}

	public <T> T id(Class<T> clazz, int id, String exceptionKey) {
		T t;
		if ((t = this.id(clazz, id)) == null)
			throw new CommonException(exceptionKey);
		return t;
	}

	public <T> T id(Class<T> clazz, int id) {
		return this.factory.getCacheReadDataSession().querySingleResultById(clazz, id);
	}

	public <T> T uuid(Class<T> clazz, String uuid) {
		return this.factory.getCacheReadDataSession().querySingleResultByUUID(clazz, uuid);
	}

	public <T> T uuid(Class<T> clazz, String uuid, String exceptionKey) {
		T t;
		if ((t = this.uuid(clazz, uuid)) == null)
			throw new CommonException(exceptionKey);
		return t;

	}
}
