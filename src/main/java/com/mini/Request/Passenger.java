package com.mini.Request;

public class Passenger {
	
	private String name;
    private String email;
    private String dob;         // Date of Birth
    private String gender;
    private String doj;         // Date of Journey
    private String source;
    private String destination;
    private String trainNum;

    // Default constructor

    public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String name, String email, String dob, String gender, String doj, String source,
			String destination, String trainNum) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.doj = doj;
		this.source = source;
		this.destination = destination;
		this.trainNum = trainNum;
	}
	
	// Getters and Setters
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

    public String getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(String trainNum) {
        this.trainNum = trainNum;
    }

    @Override
    public String toString() {
        return "TrainBookingRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", doj='" + doj + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", trainNum='" + trainNum + '\'' +
                '}';
    }

}

