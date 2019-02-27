package com.company;

/**
 * Created by 027937 on 2/26/2019.
 */
public class ToDo {
    private String title;
    private String description;
    private String priority;

    public ToDo(String title, String description, String priority){
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "The To-Do item is titled " + title + ". The description is " +
                description + ". The priority is " + priority;

    }
}
