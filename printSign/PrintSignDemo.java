/* 
 * 
 * Create a program that simulates a sign at the entrance of Mesozoic Eden.
 * The sign is simulated by printing output to the console.
 * The sign should display a welcome message, the opening and closing hours, and a short safety message.
 * 
 */

package printSign;

public class PrintSignDemo {
    public static void main(String... args) {
        String name = "Peter";
        String position = "park manager";

        String openingHours = "08:00";
        String closingHours = "20:00";

        String[] messages = {
                "Welcome to Mesozoic Eden:",
                "My name is " + name + " and I am a " + position + " in Mesozoic Eden.",
                "Our working hours: from " + openingHours + " to " + closingHours,
                "",
                "Be safe ;-)" };

        PrintSign sign = new PrintSign(messages, 2);

        System.out.println(sign.getSignString());
    }
}
