/**
 * 竞赛
 */
package com.zkhy.contest.web.util;

/**
  * 概要：记录状态
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public enum RecordStatus {

	/**
	 * 有效
	 */
	VALID,

	/**
	 * 无效
	 */
	INVALID,

	/**
	 * 已删除
	 */
	DELETED;

	/**
	 * 将String类型的status转为RecordStatus
	 * @param status
	 * @return RecordStatus
	 */
	public static RecordStatus convertStatus(String status) {
		for (RecordStatus rs : RecordStatus.values()) {
			String statusNum = String.valueOf(rs.ordinal());
			if (statusNum.equals(status) || rs.toString().equalsIgnoreCase(status)) {
				return rs;
			}
		}
		return VALID;
	}

}
