import java.time.*;

public class Task {
    private int id;
    private String description;
    private TaskStatus status;
    private LocalDateTime createdAt;

    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.status = TaskStatus.TODO;
        this.createdAt = LocalDateTime.now();
    }

    public Task(int id, String description, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = LocalDateTime.now();
    }

    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public TaskStatus getStatus(){
        return status;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setStatus(TaskStatus status){
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
