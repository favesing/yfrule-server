package com.bstek.urule.runtime.builtinaction;

import com.bstek.urule.model.library.action.annotation.ActionBean;
import com.bstek.urule.model.library.action.annotation.ActionMethod;
import com.bstek.urule.model.library.action.annotation.ActionMethodParameter;

@ActionBean(name="自定义数学函数2")
public class CustomMathAction {
	@ActionMethod(name="取模")
    @ActionMethodParameter(names={"目标数字", "取模数"})
	public Integer mod(Integer a, Integer b){
		return a % b; 
	}
}