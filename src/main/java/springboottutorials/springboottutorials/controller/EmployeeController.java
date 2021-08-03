package springboottutorials.springboottutorials.controller;


import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import springboottutorials.springboottutorials.entity.Employee;
import springboottutorials.springboottutorials.service.EmployeeService;

@RestController
public class EmployeeController {

     @Autowired
     private EmployeeService employeeService;

    @RequestMapping(value = "/getEmployee/{id}",method = RequestMethod.GET)
    public String getEmployee(@PathVariable long id)
    {
        return employeeService.getEmployee(id).toString();

    }

     @RequestMapping(value = "/saveEmployee",method = RequestMethod.POST)
     public Employee saveEmployee(@RequestBody Employee employee)
     {
         employeeService.saveEmployee(employee);
         return employee;
     }

    @RequestMapping(value = "/updateEmployee/{id}",method = RequestMethod.PUT)
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee)
    {
       return employeeService.updateEmployee(id,employee);

    }

    @RequestMapping(value = "/deleteEmployee/{id}",method = RequestMethod.DELETE)
    public String deleteEmploye(@PathVariable long id)
    {
        employeeService.deleteEmployee(id);
        return "Employee of id :"+id+" successfully deleted";
    }


}
