package com.example.names_lab.models;

public class Greeting {
    private String name;
    private String timeOfDay;

    // Constructor
    public Greeting(String name, String timeOfDay) {
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }
}

