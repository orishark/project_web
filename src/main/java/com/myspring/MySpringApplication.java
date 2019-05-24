package com.myspring;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@MapperScan(value= {"com.myspring.dao"})
public class MySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
		
		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		
		Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mybatis-mapper/*.xml");
		sessionFactoryBean.setMapperLocations(res);
		
		return sessionFactoryBean.getObject();
	}
	
	@Bean
	public SqlSessionTemplate sqlSession(SqlSessionFactory factory) {
		return new SqlSessionTemplate(factory);
	}

}
