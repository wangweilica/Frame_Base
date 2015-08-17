/**
 * 码道云竞赛
 */
package com.zkhy.contest.web.base.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.zkhy.contest.web.util.PageConstants;
import com.zkhy.contest.web.util.PageInfo;

public class BaseController {  
    
	public  Logger logger = LoggerFactory.getLogger(getClass());
	
	/**
     * 用于保存分页查询数据
     */
    protected PageInfo pageInfo; 
    /**
     * 用于标识当前请求的数据页数，从1开始
     */
	protected Integer pageIndex = 1; 
	/**
	 * 分页数据默认大小 10
	 */
	protected Integer pageSize = PageConstants.PAGE_SIZE; 
	
	@InitBinder
	protected void initBinder(WebDataBinder binder, HttpServletRequest  request) {
		String pi = request.getParameter("pageIndex");
		String pp = request.getParameter("pageSize");
		this.pageIndex = pi!=null?Integer.valueOf(pi):this.pageIndex;
		this.pageSize = pp!=null?Integer.valueOf(pp):this.pageSize;

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}
    
    //获取session
	public HttpSession getSession() {
		return ((ServletRequestAttributes) RequestContextHolder
				.getRequestAttributes()).getRequest().getSession();
	}

	/**
	 * @return the pageInfo
	 */
	public PageInfo getPageInfo() {
		return pageInfo;
	}

	/**
	 * @param pageInfo the pageInfo to set
	 */
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	/**
	 * @return the pageIndex
	 */
	public Integer getPageIndex() {
		return pageIndex;
	}

	/**
	 * @param pageIndex the pageIndex to set
	 */
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}  