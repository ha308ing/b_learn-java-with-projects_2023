package Tasks;

import java.time.LocalTime;

import Employee.Employee;

public class TasksDemo {
    public static void main(String... args) {

        Tasks tasks = new Tasks();

        Employee peter = new Employee("Peter", "feeder");
        Employee marina = new Employee("Meter", "guide");
        Employee roman = new Employee("Roman", "security");

        Task taskFeed = new Task(TaskTypes.FEEDING, peter, LocalTime.now());
        Task taskGuide = new Task(TaskTypes.TOUR_GUIDING, marina, LocalTime.now());
        Task taskSecurity = new Task(TaskTypes.SECURITY, roman, LocalTime.now());

        tasks.addTask(taskFeed, taskGuide, taskSecurity);

        tasks.printTasks();

        tasks.assignTask();

        tasks.printTasks();

    }
}
