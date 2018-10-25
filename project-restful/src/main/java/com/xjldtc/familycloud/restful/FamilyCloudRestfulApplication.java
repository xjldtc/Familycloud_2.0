package com.xjldtc.familycloud.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xjldtc.familycloud.biz.BizConfig;
import com.xjldtc.framework.common.CommonConfig;

/**
 * restful 应用服务 入口点
 * @author xjldtc
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = { CommonConfig.class,BizConfig.class, FamilyCloudRestfulApplication.class })
public class FamilyCloudRestfulApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(FamilyCloudRestfulApplication.class, args);
		/**
		 * 监控暂时不实现
		 */
		//context.addApplicationListener(new ApplicationPidFileWriter());// 创建监听PID文件application.pid
		//context.addApplicationListener(new EmbeddedServerPortFileWriter());// 监听PID
	}
}
