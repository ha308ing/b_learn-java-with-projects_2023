package Tasks;

import java.time.LocalTime;

import Employee.Employee;

public class Task {
    private TaskTypes taskType;
    private Employee assignee;
    private LocalTime startTime;
    private LocalTime endTime;

    public Task(TaskTypes taskType, Employee assignee, LocalTime startTime) {
        this.taskType = taskType;
        this.assignee = assignee;
        this.startTime = startTime;
        this.endTime = startTime.plusHours(taskType.getDuration());
    }

    public Employee getAssignee() {
        return assignee;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public TaskTypes getTaskType() {
        return taskType;
    }

}
