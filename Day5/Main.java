package Day5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number of Employees : ");
		int size = scan.nextInt();
		scan.nextLine();
		
		EmployeeServices service = new EmployeeServices(size);
		
		while(true) {
			System.out.println("\n------ Employee Management System-----\n");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employees");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Update Employee");
			System.out.println("6. Exists\n");
			
			System.out.println("Enter choice : ");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter EMployee ID : ");
				String id = scan.nextLine();
				
				System.out.println("Enter Employee Name : ");
				String name = scan.nextLine();
				
				System.out.println("Enter Employee Salary");
				double salary = scan.nextDouble();
				
				service.addEmployee(new Employee(id, name, salary));
				break;
				
				
			case 2 :
				service.viewEmployees();
				break;
				
			case 3 : 
				System.out.println("Enter Employee ID to serach : ");
				String sid = scan.nextLine();
				
				Employee e = service.searchEmployee(sid);
				if(e != null) {
					e.display();
				} else {
					System.out.println("Not Found");
				} 
				break;
				
			case 4 :
				System.out.println("Enter ID to delete : ");
				String did = scan.nextLine();
				service.deleteEmployee(did);
				break;
				
			case 5 :
				System.out.println("Enter ID to Update : ");
				String uid = scan.nextLine();
				
				System.out.println("Enter New Name : ");
				String newName = scan.nextLine();
				
				System.out.println("Enter New Salary : ");
				double newSalary = scan.nextDouble();
				
				service.updateEmployee(uid, newName, newSalary);
				break;
				
			case 6 :
				System.out.println("Existing...");
				scan.close();
				return;
				
			default :
				System.out.println("Invalid choice! Select again.");
			}
			
		}
	}
}
