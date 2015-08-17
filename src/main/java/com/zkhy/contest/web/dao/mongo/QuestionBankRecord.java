/**
 * 竞赛
 */
package com.zkhy.contest.web.dao.mongo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.zkhy.contest.web.util.RecordStatus;

/**
  * 概要：题库记录基类
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public abstract class QuestionBankRecord implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5801135963953439451L;

	/**
	 * ID
	 */
	@Id
	protected String id;
	
	/**
	 * 创建时间
	 */
	protected Date createTime;
	
	/**
	 * 最后一次更新时间
	 */
	protected Date lastUpdateTime;
	
	/**
	 * 记录状态
	 */
	protected RecordStatus status;
	
	/**
	 * 获取对应的数据库集合名称
	 * @return 数据库集合名称
	 */
	abstract public String collectionName();

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the lastUpdateTime
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	/**
	 * @param lastUpdateTime the lastUpdateTime to set
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	/**
	 * @return the status
	 */
	public RecordStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(RecordStatus status) {
		this.status = status;
	}
	
}
