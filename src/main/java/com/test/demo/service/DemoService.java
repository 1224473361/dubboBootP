package com.test.demo.service;

import java.util.Map;

import com.emotte.kernel.base.msg.dto.AjaxDTO;

/**
 * 
 * @date 2019年6月5日
 * @author lihui
 */
public interface DemoService {

	String sayHello(String name);

	AjaxDTO doDeal(Map<String, Object> m, String func);
}
