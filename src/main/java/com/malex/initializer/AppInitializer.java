package com.malex.initializer;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {

	private final static String MAPPING_URL = "/";
	private final static String SERVLET_NAME = "DispatcherServlet";
	private final static String FILTER_NAME = "springSecurityFilterChain";
	private final static String TARGET_BEAN_NAME = "springSecurityFilterChain";
	private final static String URL_PATTERNS = "/*";

	private final static String CONFIG_LOCATION = "com.malex.configuration";

	private final static String LOCATION = "";
	private final static long MAX_FILE_SIZE = 2000000;
	private final static long MAX_REQUEST_SIZE = 10000000;
	private final static int FILE_SIZE_THRESHOLD = 0;

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		WebApplicationContext context = getContext();

		servletContext
				  .addListener(new ContextLoaderListener(context));

		servletContext
				  .addFilter(FILTER_NAME,
							 new DelegatingFilterProxy(TARGET_BEAN_NAME))
				  .addMappingForUrlPatterns(null, false, URL_PATTERNS);

		ServletRegistration.Dynamic dispatcher = servletContext
				  .addServlet(SERVLET_NAME, new DispatcherServlet(context));
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping(MAPPING_URL);
		dispatcher.setMultipartConfig(getMultiPartConfigElement());
	}

	private AnnotationConfigWebApplicationContext getContext() {
		AnnotationConfigWebApplicationContext context
				  = new AnnotationConfigWebApplicationContext();
		context.setConfigLocation(CONFIG_LOCATION);
		return context;
	}

	private MultipartConfigElement getMultiPartConfigElement() {
		return new MultipartConfigElement(LOCATION,
				  MAX_FILE_SIZE,
				  MAX_REQUEST_SIZE,
				  FILE_SIZE_THRESHOLD);
	}

}