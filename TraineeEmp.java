package com.inheritance;

public class TraineeEmp extends Employee{
	
	protected String Performance;
	
	public TraineeEmp(int id, String name, double salary, String Performance) {
		super(id, name, salary);
		this.Performance = Performance;
		
	}
    @Override
    public String getDetails() {
    	
    	return super.getDetails() + " " + Performance;
    }
}
