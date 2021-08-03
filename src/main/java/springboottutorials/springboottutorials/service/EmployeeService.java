package springboottutorials.springboottutorials.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springboottutorials.springboottutorials.entity.Employee;
import springboottutorials.springboottutorials.jpa.EmployeeJpa;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeJpa employeeJpa;

    public Employee saveEmployee(Employee employee)
    {
        employeeJpa.save(employee);
        return employee;

    }

    public Employee getEmployee(long id) {

        return employeeJpa.getById(id);
    }

    public Employee updateEmployee(long id, Employee employee) {
        Employee emp=employeeJpa.findById(id).orElse(null);
        emp.setCompany(employee.getCompany());
        return employeeJpa.save(emp);

    }

    public void deleteEmployee(long id) {
        employeeJpa.deleteById(id);
    }
}
