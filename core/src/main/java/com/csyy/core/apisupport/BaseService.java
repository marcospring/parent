package com.csyy.core.apisupport;

import com.csyy.core.datasource.param.CustomSQL;
import com.csyy.core.datasource.param.Param;
import com.csyy.core.exception.BusinessException;
import com.csyy.core.obj.Pagination;

public interface BaseService {

	/**
	 * 查询列表数据，带分页功能
	 * 
	 * @param clazz
	 * @param param
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	<T> Pagination<T> queryClassPagination(Class<T> clazz, Param param,
			int pageNo, int pageSize) throws BusinessException;

	/**
	 * 根据自定义where条件sql分页查询
	 * 
	 * @param clazz
	 * @param whereSQL
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws BusinessException
	 */
	public <T> Pagination<T> queryClassPagination(Class<T> clazz,
			CustomSQL whereSQL, int pageNo, int pageSize)
			throws BusinessException;

	/**
	 * 查询列表数据，带分页功能查询列表数据，带分页功能
	 * 
	 * @param clazz
	 * @param listElementId
	 *            列表查询元素ID
	 * @param countElementId
	 *            列表个数查询元素ID
	 * @param param
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws BusinessException
	 *             Pagination<S>
	 *
	 */
	<T> Pagination<T> queryClassPagination(Class<T> clazz,
			String listElementId, String countElementId, Param param,
			int pageNo, int pageSize) throws BusinessException;
}
