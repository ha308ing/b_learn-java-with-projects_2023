/* 
 * 
 * Create a program that simulates a sign at the entrance of Mesozoic Eden.
 * The sign is simulated by printing output to the console.
 * The sign should display a welcome message, the opening and closing hours, and a short safety message.
 * 
 */

package printSign;

import Employee.Employee;
import Park.Park;

public class PrintSignDemo {
    public static void main(String... args) {
        Employee employee = new Employee("Peter", "park manager");

        Park park = new Park("Mesozoic Eden", "08:00", "20:00", 2400, 75);

        String[] messages = {
                "Welcome to " + park.getName() + "!",
                "My name is " + employee.getName() + " and I am a " + employee.getRole() + " in " + park.getName()
                        + ".",
                "Our working hours: from " + park.getOpeningHours() + " till " + park.getClosingHours(),
                "",
                "Be safe ;-)" };

        PrintSign sign = new PrintSign(messages, 2);

        System.out.println(sign.getSignString());
    }
}
