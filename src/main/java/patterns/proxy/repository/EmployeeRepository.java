package patterns.proxy.repository;

import patterns.proxy.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private final List<Employee> employees;

    protected EmployeeRepository() {
        this.employees = new ArrayList<>(
                List.of(
                        new Employee("Pobitra"),
                        new Employee("Chayanika"),
                        new Employee("Kumari")
                )
        );
    }

    protected boolean createEmployee(Employee employee) {
        return employees.add(employee);
    }

    protected Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    protected List<Employee> getEmployees() {
        return employees;
    }

    protected void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }
}
