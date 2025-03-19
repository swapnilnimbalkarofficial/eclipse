package com.cofig;

import java.util.Properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class MyConfiguration {

	public LocalSessionFactoryBean l1() {

		LocalSessionFactoryBean l = new LocalSessionFactoryBean();
		l.setDataSource(null);
		l.setHibernateProperties(null);
		l.setPackagesToScan("com.model");

		return l;

	}

	private DriverManagerDataSource d1() {
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName(null);
		d.setUrl(null);
		d.setUsername(null);
		d.setPassword(null);

		return d1();
	}

	private Properties p1() {
		Properties p = new Properties();
		p.setProperty("hibernate.Dialect", null);
		p.setProperty("hibernate.hbm2ddl.auto", null);
		p.setProperty("hibernate.show_sql", null);
		p.setProperty("hibernate.format_sql", null);

		return p;

	}

}
