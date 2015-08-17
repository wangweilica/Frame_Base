package com.zkhy.contest.web.base.dao.interfaces;

/**
  * 概要：Dao 基类
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public interface BaseDao<T> {

	/**
	 * 获取最大id
	 * @return
	 */
	long maxRecordId();

	/**
	 * 生成id
	 * @return
	 */
	long extractNewRecordId();
	
	/**
	 * 根据id查找记录
	 * @return
	 */
	T query(long id);
	
	/**
	 * 插入竞赛记录
	 * @param entity
	 * @return
	 */
	long insert(T record);

}
