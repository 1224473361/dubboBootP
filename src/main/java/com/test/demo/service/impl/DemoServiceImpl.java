package com.test.demo.service.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.emotte.kernel.base.msg.dto.AjaxDTO;
import com.test.demo.service.DemoService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @date 2019年6月5日
 * @author lihui
 */
@com.alibaba.dubbo.config.annotation.Service
@Component
@Slf4j
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		System.out.println("---生成者接受参数：" + name);
		String r = "This time is :" + new Date() + ",content:" + name;
		System.out.println("---返回参数：" + r);
		return r;
	}

	@Override
	public AjaxDTO doDeal(Map<String, Object> m, String func) {
		log.info("参数：{}",m);
		log.info("方法：{}",func);
		AjaxDTO ajax = new AjaxDTO();
		ajax.setStatus(AjaxDTO.SUCCESS);
		ajax.setMsg(func);
		return ajax;
	}

}
