/**
 * 竞赛
 */
package com.zkhy.contest.web.base.dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import com.zkhy.contest.web.base.dao.interfaces.BaseMongoDao;
import com.zkhy.contest.web.dao.mongo.QuestionBankRecord;
import com.zkhy.contest.web.dao.mongo.exam.Exam;
import com.zkhy.contest.web.dao.mongo.question.MultipleChoiceQuestion;
import com.zkhy.contest.web.dao.mongo.question.ProgramQuestion;
import com.zkhy.contest.web.dao.mongo.question.SingleChoiceQuestion;

/**
  * 概要：BaseDao实现
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public class BaseMongoDaoImpl implements BaseMongoDao {
	
	/**
	 * 日志对象
	 */
	private static Log logger = LogFactory.getLog(BaseMongoDaoImpl.class);
	
	/**
	 * 数据库操作模板对象
	 */
	protected MongoTemplate mongoTemplate;

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.base.Loggable#getLogger()
	 */
	public Log getLogger() {
		return logger;
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.base.dao.interfaces.BaseDao#getMongoTemplate()
	 */
	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	/**
	 * @param operator the operator to set
	 */
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.base.dao.interfaces.BaseDao#insert(com.zkhy.qb.web.dao.mongo.QuestionBankRecord)
	 */
	public void insert(QuestionBankRecord entity) {
		logger.info("Insert an entity" + entity);
		this.mongoTemplate.insert(entity, entity.collectionName());
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.base.dao.interfaces.BaseDao#findById(java.lang.String, java.lang.Class)
	 */
	public <T> T findById(String id, Class<T> entityClass) {
		logger.info("Find by id: " + id);
		return this.mongoTemplate.findById(id, entityClass,classNameToCollection(entityClass));
	}

	/* (non-Javadoc)
	 * @see com.zkhy.qb.web.base.dao.interfaces.BaseDao#updateByEntity(com.zkhy.qb.web.dao.mongo.QuestionBankRecord)
	 */
	public void updateByEntity(QuestionBankRecord entity) {
		logger.info("Update by id: " + entity.getId());
		this.mongoTemplate.save(entity, entity.collectionName());
	}
	
	public <T> List<T> find(Query query, Class<T> entityClass) {
		
		return this.mongoTemplate.find(query, entityClass, classNameToCollection(entityClass));
	}
	
	/**
	 * 根据类获取对应的数据库集合名称
	 * @param entityClass
	 * @return 数据库集合名称
	 */
	protected <T> String classNameToCollection(Class<T> entityClass) {
		if(entityClass == Exam.class) {
			return Exam.COLLECTION_NAME;
		}
		else if(entityClass == SingleChoiceQuestion.class) {
			return SingleChoiceQuestion.COLLECTION_NAME;
		}
		else if(entityClass == MultipleChoiceQuestion.class) {
			return MultipleChoiceQuestion.COLLECTION_NAME;
		}
		else if(entityClass == ProgramQuestion.class) {
			return ProgramQuestion.COLLECTION_NAME;
		}
		
		return null;
	}

}
