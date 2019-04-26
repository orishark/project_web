package com.myspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class WebMvcConfig {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	@Bean
    public TilesConfigurer tilesConfigurer(){
        final TilesConfigurer configurer = new TilesConfigurer();
        configurer.setDefinitions("/WEB-INF/tiles/*.xml");
        configurer.setCheckRefresh(true);
        return configurer;
    }
     
    @Bean
    public UrlBasedViewResolver tilesViewResolver(){
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setViewClass(TilesView.class);
        resolver.setOrder(0);
        return resolver;
    }
}
