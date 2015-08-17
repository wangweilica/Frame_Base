/**
 * 
 */
package com.zkhy.contest.web.service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkhy.contest.web.dao.interfaces.PaperTemplateDao;
import com.zkhy.contest.web.dao.model.PaperTemplate;
import com.zkhy.contest.web.service.interfaces.PaperTemplateSerivce;

/**
 * 概要：
 * @author wangwei
 * @version:1.0.0  2014年10月30日
 */
@Service("templateService")
public class PaperTemplateServiceImpl implements PaperTemplateSerivce{
	
	@Autowired
	private PaperTemplateDao paperTemplateDao;
	
	public List<PaperTemplate> getTemplates(long companyId) {
		return paperTemplateDao.find(companyId);
	}

}
