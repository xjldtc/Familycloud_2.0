package com.xjldtc.familycloud.assembly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

import com.xjldtc.familycloud.restful.FamilyCloudRestfulApplication;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
public class FamilyCloudApplication {

	private static final Logger logger = LoggerFactory.getLogger(FamilyCloudApplication.class);

	public static void main(String[] args) throws Exception {
		System.setProperty("spring.devtools.restart.enabled","true");
		/**
		 * 公共模块加载
		 */
		ConfigurableApplicationContext commonContext = new SpringApplicationBuilder(FamilyCloudApplication.class)
				.web(WebApplicationType.NONE).run(args);
		//commonContext.addApplicationListener(new ApplicationPidFileWriter());
		logger.info(commonContext.getId() + " isActive: " + commonContext.isActive());

		/**
		 * restful 模块加载
		 */
		if (commonContext.getEnvironment().containsProperty("restful")) {
			ConfigurableApplicationContext configContext = 
					new SpringApplicationBuilder(FamilyCloudRestfulApplication.class).parent(commonContext).run(args);
			logger.info(configContext.getId() + " isActive: " + configContext.isActive());
		}
	}
}
