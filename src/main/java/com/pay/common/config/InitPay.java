package com.pay.common.config;

import com.alipay.demo.trade.config.Configs;
import com.pay.modules.unionpay.util.SDKConfig;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
/**
 * 启动加载支付宝、微信以及银联相关参数配置
 * 创建者 小柒2012
 * 创建时间 2018年5月15日
 */
@Component
public class InitPay implements ApplicationRunner{
	
	@Override
    public void run(ApplicationArguments var){
		//初始化 支付宝-银联相关参数,涉及机密,此文件不会提交,请自行配置相关参数并加载
		Configs.init("zfbinfo.properties");//支付宝
		SDKConfig.getConfig().loadPropertiesFromSrc();//银联
    }
}