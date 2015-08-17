package com.zkhy.contest.web.base.dao.interfaces;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.zkhy.contest.web.base.Loggable;
import com.zkhy.contest.web.dao.mongo.QuestionBankRecord;

/**
  * 概要：mongodb Dao 基类
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public interface BaseMongoDao extends Loggable {
	
	/**
	 * 获取mongoDB操作模板
	 * @return mongoDB模板
	 */
	public MongoTemplate getMongoTemplate();
	
	/**
	 * 创建新实例
	 * @param entity
	 */
	public void insert(QuestionBankRecord entity);
	
	/**
	 * 根据Id获取实例
	 * @param id ObjectId
	 * @param entityClass 实例名称
	 * @return 实例
	 */
	public <T> T findById(String id, Class<T> entityClass);
	
	/**
	 * 根据根据实例更新
	 * @param entity
	 * @param entityClass 实例名称
	 */
	public void updateByEntity(QuestionBankRecord entity);
	
	/**
	 * 查询
	 * @param query
	 * @param entityClass
	 * @return
	 */
	public <T> List<T> find(Query query,Class<T> entityClass);
	
}
