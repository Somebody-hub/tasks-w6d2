package Model;

import java.util.*;

public class Task {
    private final Long id;
    private String title;
    private TaskStatus status;
    private boolean deleted;

    public Task(Long id, String title, TaskStatus taskStatus) {
        this.id = id;
        this.title = title;
        this.status = taskStatus;
        this.deleted = false;
    }

    public Task(Long id, String title) {
        this(id, title, TaskStatus.NEW);
    }

    public Task(Long id) {
        this(id, "", TaskStatus.NEW);
    }

    public Long getId() {
        return id;
    }

    public String getText() {
        return title;
    }

    public void setText(String text) {
        this.title = text;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Task task)) return false;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Task: " + id + " " + title + " " + status;
    }
}
