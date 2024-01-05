import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDirectory {
    private Set<Employee> employees;

    public EmployeeDirectory(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Employee> searchByExperience(int experience) {
        return employees.stream().filter(e -> e.experience() == experience).collect(Collectors.toSet());
    }

    public Set<String> searchPhoneNumberByName(String name) {
        return employees.stream().filter(e -> e.name().equals(name)).map(Employee::phoneNumber).collect(Collectors.toSet());
    }

    public Set<Employee> searchByServiceNumber(int serviceNumber) {
        return employees.stream().filter(e -> e.serviceNumber() == serviceNumber).collect(Collectors.toSet());
    }

    public void addEmployee(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Employee cannot be null!");
        }
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "EmployeeDirectory{" +
                "employees=" + employees +
                '}';
    }
}
