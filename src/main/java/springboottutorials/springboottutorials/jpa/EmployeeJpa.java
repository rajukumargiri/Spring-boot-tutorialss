package springboottutorials.springboottutorials.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboottutorials.springboottutorials.entity.Employee;

@Repository
public interface EmployeeJpa extends JpaRepository<Employee, Long> {
}
