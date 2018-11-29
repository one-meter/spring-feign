package com.zzz.demo.springfeign.controller;

import com.netflix.discovery.converters.Auto;
import com.zzz.demo.springfeign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/29 17:07
 * @since v1.0.0
 */
@RestController
public class TestController {

	@Resource
	private HelloService helloService;

	@RequestMapping("/hi")
	public String hello(){
		return helloService.sayHello();
	}

}
