package HBUtil;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Bill;
import com.model.Department;
import com.model.Doctor;
import com.model.Patient; 
import com.model.Resceptionist;
import com.model.Room;
import com.model.Staff;

public class HBUtils {
	public static SessionFactory sf = new Configuration()
			.setProperties(p1())
			.addAnnotatedClass(Doctor.class)
			.addAnnotatedClass(Patient.class)
			.addAnnotatedClass(Bill.class)
			.addAnnotatedClass(Room.class)
			.addAnnotatedClass(Resceptionist.class)
			.addAnnotatedClass(Department.class)
			.addAnnotatedClass(Staff.class)
			
			.buildSessionFactory();
	public static Properties p1()
	{
		Properties p = new Properties();
		p.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		p.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/hospital");
		p.setProperty("hibernate.connection.username", "root");
		p.setProperty("hibernate.connection.password", "Swapnil@123");
		
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.format_sql", "true");
		return p;
	}
}

