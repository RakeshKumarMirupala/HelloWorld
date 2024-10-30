package com.mini.Repsonse;

public class Ticket {

    private int ticketId;
    private String ticketStatus;
    private String trainNum;
    private String name;
    private String email;
    private String dob;         // Date of Birth
    private String gender;
    private String doj;         // Date of Journey
    private String source;
    private String destination;

    // Default constructor
    public Ticket() {}

    // Parameterized constructor
    public Ticket(int ticketId, String ticketStatus, String trainNum, String name, String email, String dob, String gender, String doj, String source, String destination) {
        this.ticketId = ticketId;
        this.ticketStatus = ticketStatus;
        this.trainNum = trainNum;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.doj = doj;
        this.source = source;
        this.destination = destination;
    }

    // Getters and Setters
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", ticketStatus='" + ticketStatus + '\'' +
                ", trainNum='" + trainNum + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", doj='" + doj + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}

