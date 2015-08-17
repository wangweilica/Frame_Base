/**
 * 题库
 */
package com.zkhy.contest.web.dao.mongo;

import java.util.ArrayList;

/**
 * 概要：可标记的记录
 * @author yachen
 * @version 1.0.0 2014-3-29
 */
public abstract class Taggable extends QuestionBankRecord{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7717082198567853559L;
	/**
	 * 标签
	 */
	protected ArrayList<String> tags;

	/**
	 * @return the tags
	 */
	public ArrayList<String> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

}
