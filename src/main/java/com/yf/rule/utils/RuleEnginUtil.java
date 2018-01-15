package com.yf.rule.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.math.RandomUtils;

import com.bstek.urule.Utils;
import com.bstek.urule.runtime.BatchSession;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;

public class RuleEnginUtil {

	public static KnowledgeSession getRuleSession(String name) throws Exception{
		KnowledgeService service= (KnowledgeService)Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        KnowledgePackage packege = service.getKnowledge(name);
        KnowledgeSession sesson = KnowledgeSessionFactory.newKnowledgeSession(packege);
        return sesson;
	}
	
	public static KnowledgeSession getFlowSession(String name) throws Exception{
		KnowledgeService service= (KnowledgeService)Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        KnowledgePackage packege = service.getKnowledge(name);
        KnowledgeSession sesson = KnowledgeSessionFactory.newKnowledgeSession(packege);
        return sesson;
	}
	
	public static BatchSession getRuleBatchSession(String name) throws Exception{
		KnowledgeService service= (KnowledgeService)Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        KnowledgePackage packege = service.getKnowledge(name);
        BatchSession sesson = KnowledgeSessionFactory.newBatchSession(packege);
        return sesson;
	}
	
	public static BatchSession getFlowBatchSession(String name) throws Exception{
		KnowledgeService service= (KnowledgeService)Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        KnowledgePackage packege = service.getKnowledge(name);
        BatchSession sesson = KnowledgeSessionFactory.newBatchSession(packege);
        return sesson;
	}
	
	public static String getDefaultName(String name, String defName){
		if(name == null || name.isEmpty()){
			return defName;
		}
		return name;
	}
	
 	public static Map<String, Object> getDemoParams(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("jdScore", 0);
		map.put("hasJdScore", false);
		map.put("supplierBranch", 0);
		map.put("comScore", 0);
		map.put("jxlScore", 0);
		map.put("jxlBranch", 0);
		map.put("ruleResult", 0);
		
		return map;
	}
	
	public static String getDemoJob(){
		List<String> jobs = new ArrayList<String>();
    	jobs.add("学生");
    	jobs.add("警察");
    	jobs.add("老师");
    	jobs.add("IT");
    	jobs.add("个体户");
    	
    	int index = RandomUtils.nextInt(4);
    	return jobs.get(index);
	}
}
