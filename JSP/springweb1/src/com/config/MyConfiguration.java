package com.config;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackage = { "com.controller", "com.dao", "com.service" })
@PropertySource(value = { "classpath:application.properties" })
@EnableTransactionManagement
public class MyConfiguration {
	@Autowired
	private Environment e;

	public LocalSessionFactoryBean l1(){
		LocalSessionFactoryBean l = new LocalSessionFactoryBean();
		l.setDataSource(d1());
		l.setHibernateProperties(p1());
		l.setPackagesToScan("com.model");
		return l;
	}

	private DriverManagerDataSource d1() {
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName(e.getRequiredProperty("a"));
		d.setUrl(e.getRequiredProperty("b"));
		d.setUsername(e.getRequiredProperty("c"));
		d.setPassword(e.getRequiredProperty("d"));
		return d;
	}

	private Properties p1() {
		Properties p = new Properties();
		p.setProperty("hibernate.dialect", e.getRequiredProperty("e"));
		p.setProperty("hibernate.hbm2ddl.auto", e.getRequiredProperty("f"));
		p.setProperty("hibernate.show_sql", e.getRequiredProperty("g"));
		p.setProperty("hibernate.format_sql", e.getRequiredProperty("h"));
		return p;
	}

	@Bean
	public HibernateTransactionManager h1() {
		return new HibernateTransactionManager(l1().getObject());
	}

}
