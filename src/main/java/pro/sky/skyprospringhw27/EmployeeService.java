package pro.sky.skyprospringhw27;

import java.util.Collection;


public interface EmployeeService {
    public Employee addEmployee(String firstName, String lastName);
    public Employee removeEmployee(String firstName, String lastName);
    public Employee findEmployee(String firstName, String lastName);
    public Collection<Employee> showAllEmployees();
}