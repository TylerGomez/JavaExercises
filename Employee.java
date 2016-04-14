
public class Employee {
	private String name;
	private double payRate;
	private final int EMPLOYEE_ID;
	private static int nextID = 999;
	public static final double STARTING_PAY_RATE = 7.75;
	
	public Employee(String name){
		this.name = name;
		this.payRate = STARTING_PAY_RATE;
		EMPLOYEE_ID = getNextID();
	}
	
	public Employee(String name, double STARTING_PAY_RATE){
		this.name = name;
		this.payRate = STARTING_PAY_RATE;
		EMPLOYEE_ID = getNextID();
		
	}
	public String getName(){
		return name; 
	}
	public int getEmployeeID(){
		return EMPLOYEE_ID;
	}
	public double getPayRate(){
		return payRate;
	}
	
	public void changeName(String newName){
		name = newName;
	}
	
	public void changePayRate(double newRate){
		payRate = newRate;
	}
	
	private int getNextID(){
		nextID++;
		return nextID;
	}
}
