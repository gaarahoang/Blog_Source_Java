package com.longlvq.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@ComponentScan("edu.vinaenter.*")
@EnableWebMvc
public class WebMVCConfig implements WebMvcConfigurer{
	

	/*
	@Bean
	public InternalResourceViewResolver viewResolver () {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	@Bean
	public MultipartResolver multipartResolver () {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		return resolver;
		
	}
	*/
	@Bean(name = "viewResolver")
    public ViewResolver getViewResolver() {
        UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
 
        // TilesView 3
        viewResolver.setViewClass(TilesView.class);
        return viewResolver;
    }
    @Bean(name = "tilesConfigurer")
    public TilesConfigurer getTilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
 
        // TilesView 3
        tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/springmvc/tiles.xml","/WEB-INF/springmvc/tiles-anews.xml"});
        tilesConfigurer.setCheckRefresh(true);
 
        return tilesConfigurer;
    }
    @Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("resources/**").addResourceLocations("/WEB-INF/resources/");
    	
    	
	}
}
