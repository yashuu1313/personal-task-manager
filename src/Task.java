public class Task { //      
    private String title; 
    private String description;
    private String dueDate;
    private boolean completed; 

    public Task(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;
    }

    public void markCompleted() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "[ " + (completed ? "✔" : "✘") + " ] " + title +
               " | Due: " + dueDate +
               " | " + description;
    }
}
