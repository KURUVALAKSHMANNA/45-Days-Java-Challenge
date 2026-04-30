package Day5;

public class Employee {
	
	String id; 
	String name;
	double salary;
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getId() { return id; } 
	public String getName() { return name; }
	public double getSalary() { return salary; }
	
	public void display() {
		System.out.println(id + " | " + name + " | " + salary);
	}
}
