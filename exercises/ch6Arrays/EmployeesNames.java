// an array of park employee names and print out the names
// using an enhanced for loop

package exercises.ch6Arrays;

import Employee.Employee;

public class EmployeesNames {
    public static void main(String... args) {

        Employee employee0 = new Employee("peter", "manager");
        Employee employee1 = new Employee("helen", "guide");
        Employee employee2 = new Employee("jack", "security");
        Employee employee3 = new Employee("paul", "feeder");
        Employee employee4 = new Employee("tiana", "guide");

        Employee[] employees = { employee0, employee1, employee2, employee3, employee4 };

        int employeesCount = employees.length;

        String[] names = new String[employeesCount];

        for (int i = 0; i < employeesCount; i++) {
            names[i] = employees[i].getName();
        }

        System.out.println("Employees:");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
