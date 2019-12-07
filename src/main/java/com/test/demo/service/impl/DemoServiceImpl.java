package com.test.demo.service.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.test.demo.service.DemoService;

/**
 * 
 * @date 2019年6月5日
 * @author lihui
 */
@com.alibaba.dubbo.config.annotation.Service
@Component
public class DemoServiceImpl implements DemoService {

	@Override
	public String sayHello(String name) {
		System.out.println("---生成者接受参数：" + name);
		String r = "This time is :" + new Date() + ",content:" + name;
		System.out.println("---返回参数：" + r);
		return r;
	}

}
