package com.yf.rule.builtinaction;

import com.bstek.urule.model.library.action.annotation.ActionBean;
import com.bstek.urule.model.library.action.annotation.ActionMethod;
import com.bstek.urule.model.library.action.annotation.ActionMethodParameter;
import com.bstek.urule.runtime.builtinaction.MathAction;

@ActionBean(name="自定义数学函数")
public class CustomMathAction{
	@ActionMethod(name="取模")
    @ActionMethodParameter(names={"目标数字", "取模数"})
	public Integer mod(Integer a, Integer b){
		return a % b; 
	}
	
	@ActionMethod(name="睡眠")
    @ActionMethodParameter(names={"名称", "睡眠毫秒时间"})
	public String exec(String name, Long sleep) throws InterruptedException{
		Thread.sleep(sleep);
		return name + "=" + sleep;
	}
}