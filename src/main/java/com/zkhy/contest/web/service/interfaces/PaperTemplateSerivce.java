package com.zkhy.contest.web.service.interfaces;

import java.util.List;

import com.zkhy.contest.web.dao.model.PaperTemplate;

/**
  * 概要：模版Service
  * @author wangwei
  * @version:1.0.0  2014年10月30日
  */
public interface PaperTemplateSerivce {
	
	List<PaperTemplate> getTemplates(long companyId);
}
