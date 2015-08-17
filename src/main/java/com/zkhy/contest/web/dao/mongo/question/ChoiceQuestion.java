/**
 * 题库
 */
package com.zkhy.contest.web.dao.mongo.question;

import java.util.Arrays;

/**
 * 概要：选择题
 * @author yachen
 * @version 1.0.0 2014-2-16
 */
public abstract class ChoiceQuestion extends Question {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7805233952793748114L;

	/**
	 * 最大选项的数量
	 */
	public static final int MAX_OPTION_NUM = 10;
	
	/**
	 * 选项
	 */
	protected String[] options;

	/**
	 * 选择题的选项有效
	 * @return
	 */
	protected boolean hasValidOptions() {
		//至少应当有两个选项才能称之为选择题
		if(options == null || options.length<2) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * @return the options
	 */
	public String[] getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(String[] options) {
		
		//如果选项超过最大数量限制，截断之
		if(options.length > MAX_OPTION_NUM) {
			this.options = Arrays.copyOf(options, MAX_OPTION_NUM);
			return;
		}
		
		this.options = options;
	}

}
