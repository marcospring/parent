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
     * @param listElementId  列表查询元素ID
     * @param countElementId 列表个数查询元素ID
     * @param param
     * @param pageNo
     * @param pageSize
     * @return
     * @throws BusinessException Pagination<S>
     */
    <T> Pagination<T> queryClassPagination(Class<T> clazz,
                                           String listElementId, String countElementId, Param param,
                                           int pageNo, int pageSize) throws BusinessException;

    /**
     * 根据ID查询单独对象，如果为空抛出CommonException(exceptionKey)
     * @param clazz
     * @param id
     * @param exceptionKey
     * @param <T>
     * @return
     */
    <T> T id(Class<T> clazz, int id, String exceptionKey);

    /**
     * 根据ID查询单独对象,如果为空返回null
     * @param clazz
     * @param id
     * @param <T>
     * @return
     */
    <T> T id(Class<T> clazz, int id);

    /**
     * 根据uuid查询单独对象，如果为空返回null
     * @param clazz
     * @param uuid
     * @param <T>
     * @return
     */
    <T> T uuid(Class<T> clazz, String uuid);

    /**
     * 根据uuid查询单独对象，如果为空抛出CommonException(exceptionKey)
     * @param clazz
     * @param uuid
     * @param exceptionKey
     * @param <T>
     * @return
     */
    <T> T uuid(Class<T> clazz, String uuid, String exceptionKey);
}
