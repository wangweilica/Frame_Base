/**
 * 竞赛
 */
package com.zkhy.contest.web.base;

import org.apache.commons.logging.Log;

/**
  * 概要：日志可记录的接口
  * @author wangwei
  * @version:1.0.0  2014年11月3日
  */
public interface Loggable{

	/**
	 * 获取commons-logging日志对象
	 * @return 日志对象
	 */
	public Log getLogger();
}
