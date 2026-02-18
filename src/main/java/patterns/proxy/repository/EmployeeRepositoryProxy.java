package patterns.proxy.repository;

import patterns.proxy.Employee;

import java.util.List;

public class EmployeeRepositoryProxy {
    private final EmployeeRepository employeeRepository;

    public EmployeeRepositoryProxy() {
        this.employeeRepository = new EmployeeRepository();
    }

    public List<Employee> findAll() {
        System.out.println("findAll call executed");
        return employeeRepository.getEmployees();
    }

    public void deleteEmployee(List<String> roles, Employee employee) {
        if(roles.contains("admin")) {
            System.out.println("deleteEmployee admin executed");
            employeeRepository.deleteEmployee(employee);
        } else {
            System.out.println("deleteEmployee execution failed due to access rights");
        }
    }
}
