package com.zzz.demo.springfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述:
 *
 * @author 002864
 * @created 2018/11/29 17:07
 * @since v1.0.0
 */
@FeignClient(value = "SERVICE-WEB")
public interface HelloService {

	@RequestMapping("/web_test")
	String sayHello();

}
