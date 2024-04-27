package Employee;

import Person.Person;

public class Employee extends Person {

    private String role;

    public Employee(String name, String role) {
        super(name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
