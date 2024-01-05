import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employees = new EmployeeDirectory(new HashSet<>(Arrays.asList(
                new Employee(1, "+375291232323", "Alex", 2),
                new Employee(2, "+375291232343", "Ivan", 1),
                new Employee(3, "+375291232354", "Andrey", 4),
                new Employee(4, "+375291232392", "Egor", 4),
                new Employee(5, "+375291232324", "Alex", 1)
        )));
        System.out.println(employees.searchByExperience(4));
        System.out.println(employees.searchPhoneNumberByName("Alex"));
        System.out.println(employees.searchByServiceNumber(1));
        employees.addEmployee( new Employee(15, "+375291232323", "Alex", 2));
        System.out.println(employees);
    }
}
