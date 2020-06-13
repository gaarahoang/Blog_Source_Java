package com.longlvq.configs;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMVCApplication implements WebApplicationInitializer {

	public void onStartup(ServletContext servletCxt) throws ServletException {
		 AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
	        ac.register(WebMVCConfig.class);
	        ac.setServletContext(servletCxt);
	        ac.refresh();

	        // Create and register the DispatcherServlet
	        DispatcherServlet servlet = new DispatcherServlet(ac);
	        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
	        registration.setLoadOnStartup(1);
	        registration.addMapping("/");
	}
	
}
