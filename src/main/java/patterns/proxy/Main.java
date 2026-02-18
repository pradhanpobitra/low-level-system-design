package patterns.proxy;


import patterns.proxy.repository.EmployeeRepositoryProxy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRepositoryProxy proxy = new EmployeeRepositoryProxy();
        List<Employee> employees = proxy.findAll();
        System.out.println(employees);
        proxy.deleteEmployee(List.of("user"), employees.get(0));
        proxy.deleteEmployee(List.of("admin"), employees.get(0));
    }
}
