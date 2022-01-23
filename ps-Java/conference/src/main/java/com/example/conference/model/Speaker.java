package com.example.conference.model;

public class Speaker {
    private String firstName;
    private String lastName;
    private String conferenceSubject;

    public Speaker() {
    }

    public Speaker(String firstName, String lastName,String conferenceSubject) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getConferenceSubject() {
        return conferenceSubject;
    }

    public void setConferenceSubject(String conferenceSubject) {
        this.conferenceSubject = conferenceSubject;
    }
}

