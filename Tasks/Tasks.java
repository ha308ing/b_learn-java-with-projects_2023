package Tasks;

import java.util.ArrayDeque;
import java.util.Formatter;
import java.util.Queue;

public class Tasks {

    private Queue<Task> tasks;

    Tasks() {
        tasks = new ArrayDeque<Task>();
    }

    public Queue<Task> getTasks() {
        return tasks;
    }

    public Queue<Task> addTask(Task... task) {
        for (Task t : task) {
            tasks.add(t);
        }
        return tasks;
    }

    public Queue<Task> assignTask() {
        tasks.remove();
        return tasks;
    }

    public Task getTask() {
        return tasks.peek();
    }

    public void printTasks() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);
        formatter.format("Tasks:%n");
        int counter = 1;
        for (Task task : tasks) {
            formatter.format("%d. %s ", counter++, task.getTaskType());
            formatter.format("on %s (%s) ", task.getAssignee().getName(), task.getAssignee().getRole());
            formatter.format("from %1$tH:%<tM till %2$tH:%<tM%n", task.getStartTime(), task.getEndTime());
        }
        System.out.println(formatter);
    }

}
