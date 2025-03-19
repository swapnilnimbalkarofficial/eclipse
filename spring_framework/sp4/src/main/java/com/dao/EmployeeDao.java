package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.model.Employee;

public class EmployeeDao {
    
    private JdbcTemplate j;
    public void setJ(JdbcTemplate j) {
        this.j = j;
    }

    public int insertEmployee(Employee e) {
        String sql = "insert into Employee(name, designation, company, salary) values (?, ?, ?, ?)";
        return j.update(sql, new Object[] {e.getName(),e.getDesignation(),e.getCompany(),e.getSalary()});
    }
}
