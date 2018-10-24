package com.xjldtc.familycloud.assembly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
	    HibernateJpaAutoConfiguration.class})
public class FamilyCloudApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(FamilyCloudApplication.class);
	
	public static void main(String[] args) throws Exception {
		
	}
}
