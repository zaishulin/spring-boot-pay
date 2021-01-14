package com.pay;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * 启动类(启动的时候一定要配置好支付宝、微信以及银联相关参数)
 * 创建者 小柒2012
 * 创建时间 2017年7月27日
 * ============商业版============
 * 一个更强大通用的支付管理后台：https://pay.cloudbed.vip
 * 演示账号：pay 密码：123456
 * ============小柒2012============
 */
@EnableDubbo(scanBasePackages  = "com.pay.modules")
@SpringBootApplication
public class Application {

    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
        LOGGER.info("支付项目启动");
	}
}