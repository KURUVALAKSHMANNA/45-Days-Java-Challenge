package Day5;

public class EmployeeServices {

	Employee[] employees;
	int count = 0;
	
//	Constructor to set the size
	public EmployeeServices(int size) {
		employees = new Employee[size];
	}
	
//	 Add Employees
	public void addEmployee(Employee e) {
		if (count < employees.length) {
			employees[count] = e;
			count++;
			System.out.println("Employee Added Successfully!");
		} else {
			System.out.println("Storage full!");
		}
	}
	
//	View All Employees
	public void viewEmployees() {
		if(count == 0) {
			System.out.println("No Employees Found!");
			return;
		}
		for(int i = 0; i < count; i++) {
			employees[i].display();
		}
	}
	
//	Search Employee
	public Employee searchEmployee(String id) {
		for(int i = 0; i < count; i++) {
			if(employees[i].getId().equals(id)) {
				return employees[i];
			}
		}
		return null;
	}
	
//	 Delete Employee
	public void deleteEmployee(String id) {
	    for (int i = 0; i < count; i++) {
	        if (employees[i].getId().equals(id)) {

	            // ✅ shifting
	            for (int j = i; j < count - 1; j++) {
	                employees[j] = employees[j + 1];
	            }

	            employees[count - 1] = null;
	            count--;

	            System.out.println("Employee Deleted Successfully!");
	            return;
	        }
	    }
	    System.out.println("Employee Not Found!");
	}
	
//	Update Employee
	public void updateEmployee(String id, String newName, double newSalary) {
		Employee e = searchEmployee(id);
		if(e != null) {
			e.setName(newName);
			e.setSalary(newSalary);
			System.out.println("Employee Details Updated!");
		} else {
			System.out.println("Employee Not Found!");
		}
	}
}
