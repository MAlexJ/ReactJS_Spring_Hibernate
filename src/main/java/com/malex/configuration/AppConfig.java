package com.malex.configuration;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@ComponentScan(basePackages = "com.malex")
public class AppConfig {

	private final static String ENCODING = "utf-8";
	private final static long MAX_UPLOAD_SIZE = 20971520;
	private final static int MAX_IN_MEMORY_SIZE = 1048576;

	private final static String DB_PROPERTIES = "db.properties";
	private final static String HIBERNATE_PROPERTIES = "hibernate.properties";
	private final static String DBCP_PROPERTIES = "dbcp.properties";

	@Bean
	public PropertyPlaceholderConfigurer propertyConfigurer() {
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();

		ClassPathResource dataSource = new ClassPathResource(DB_PROPERTIES);
		ClassPathResource hibernate = new ClassPathResource(HIBERNATE_PROPERTIES);
		ClassPathResource dbcp = new ClassPathResource(DBCP_PROPERTIES);

		configurer.setLocations(dataSource, hibernate, dbcp);
		return configurer;
	}

	@Bean
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();

		resolver.setDefaultEncoding(ENCODING);
		resolver.setMaxUploadSize(MAX_UPLOAD_SIZE);
		resolver.setMaxInMemorySize(MAX_IN_MEMORY_SIZE);

		return resolver;
	}

	@Bean
	public Mapper beanMapper() {
		return new DozerBeanMapper();
	}

}