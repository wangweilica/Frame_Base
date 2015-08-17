/**
 * 竞赛
 */
package com.zkhy.contest.web.util;

/**
  * 概要：题目类型
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public enum QuestionType {
	
	/**
	 * 单选题
	 */
	SINGLE_CHOICE,
	
	/**
	 * 多选题
	 */
	MULTIPLE_CHIOCE,
	
	/**
	 * 编程题
	 */
	PROGRAM;
	
	/**
	 * 将String类型的type转为QuestionType
	 * @param type
	 * @return QuestionType
	 */
	public static QuestionType convertType(String type) {
		for (QuestionType qt : QuestionType.values()) {
			String typeNum = String.valueOf(qt.ordinal());
			if (typeNum.equals(type) || qt.toString().equalsIgnoreCase(type)) {
				return qt;
			}
		}
		return null;
	}
	

}
