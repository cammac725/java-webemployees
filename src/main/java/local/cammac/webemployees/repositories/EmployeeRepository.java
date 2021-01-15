package local.cammac.webemployees.repositories;

import local.cammac.webemployees.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
