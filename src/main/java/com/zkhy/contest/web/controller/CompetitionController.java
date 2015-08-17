package com.zkhy.contest.web.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zkhy.contest.web.base.controller.BaseController;
import com.zkhy.contest.web.controller.vo.CompetitionVo;
import com.zkhy.contest.web.dao.model.User;
import com.zkhy.contest.web.service.interfaces.CompetitionSerivce;
import com.zkhy.contest.web.util.PageInfo;

@Controller
@RequestMapping("/competition")
public class CompetitionController extends BaseController{  
      
	 @Autowired
	 private CompetitionSerivce competitionSerivce;
	 
	@RequestMapping("/add")
    public ModelAndView add(@ModelAttribute("form") CompetitionVo vo) {  
		ModelAndView mv = new ModelAndView();  
		
        competitionSerivce.addCompetition(vo);
        
        mv.addObject("vo", vo); 
        mv.setViewName("redirect:/list");  
        
        return mv;  
    }  
	
	@ResponseBody
	@RequestMapping("/update")
    public List<Object> update(@ModelAttribute("form") CompetitionVo vo) {  
        List<Object> list = new ArrayList<Object>();
        User user = new User();
        user.setName("王伟");
        user.setIdNumber("34012300000000");
        list.add(user);
        return list;  
    }  
	
	@RequestMapping("/list")
    public ModelAndView list(@RequestParam("orgId") Long orgId) {  
        ModelAndView mv = new ModelAndView();  
        pageSize = 2;
        List<CompetitionVo> list = null;
        int recordNum = competitionSerivce.getCompetitionsTotal(orgId);
        if(recordNum > 0){
        	list = competitionSerivce.getCompetitions(orgId, (pageIndex - 1) * pageSize, pageSize);
        	pageInfo = new PageInfo(list, recordNum, pageIndex, pageSize);
        }
        mv.addObject("list", list); 
        mv.addObject("pageInfo", pageInfo); 
        mv.setViewName("org/competition_list");  
        
        return mv;  
    }
}  