package com.zkhy.contest.web.dao.interfaces;

import java.util.List;

import com.zkhy.contest.web.dao.model.PaperTemplate;


public interface PaperTemplateDao {
	
	/**
	 * 根据公司id查找列表
	 * @return
	 */
	List<PaperTemplate> find(long companyId);
}
