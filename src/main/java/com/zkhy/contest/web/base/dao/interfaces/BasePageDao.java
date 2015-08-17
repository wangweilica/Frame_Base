package com.zkhy.contest.web.base.dao.interfaces;

import java.util.List;

/**
  * 概要：Dao 基类
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public interface BasePageDao<T> extends BaseDao<T>{

	/**
	 * 查找分页列表
	 * @return
	 */
	List<T> query(T entity, int pageIndex, int pageSize);
	
	/**
	 * 获取记录总数
	 * @param entity
	 * @return
	 */
	int count(T entity);

}
