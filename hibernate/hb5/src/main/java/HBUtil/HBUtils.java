package HBUtil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Gift;
import com.model.Laptop;
import com.model.Student;

public class HBUtils {
	
	public static SessionFactory sf = new Configuration()
			.setProperties(p1())
			.addAnnotatedClass(Student.class)
			.addAnnotatedClass(Laptop.class)
			.addAnnotatedClass(Gift.class)
			.buildSessionFactory();
	public static Properties p1()
	{  
		Properties p = new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/jap73");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "Swapnil@123");
										
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "false");
		p.setProperty("hibernate.format_sql", "true");
		p.setProperty("hibernate.cache.use_second.level_cache", "true");
		p.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.ehcache.internal.EhcacheRegionFactory");
		p.setProperty("hibernate.cache.use_query_cache","true");
		return p;
	}
		
}
