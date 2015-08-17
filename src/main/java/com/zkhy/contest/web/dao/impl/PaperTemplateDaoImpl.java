package com.zkhy.contest.web.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zkhy.contest.web.dao.interfaces.PaperTemplateDao;
import com.zkhy.contest.web.dao.mapper.PaperTemplateMapper;
import com.zkhy.contest.web.dao.model.PaperTemplate;
import com.zkhy.contest.web.dao.model.PaperTemplateExample;
import com.zkhy.contest.web.dao.model.PaperTemplateExample.Criteria;

@Repository
public class PaperTemplateDaoImpl implements PaperTemplateDao {

	@Autowired
	private PaperTemplateMapper paperTemplateMapper;
	
	public List<PaperTemplate> find(long companyId) {
		PaperTemplateExample example = new PaperTemplateExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompanyIdEqualTo(companyId);
		
		return paperTemplateMapper.selectByExample(example);
	}
}
