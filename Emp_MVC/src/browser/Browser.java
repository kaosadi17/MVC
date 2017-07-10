package browser;

import java.util.Scanner;

import Model.Emp_Model;
import View.Emp_View;
import controller.Emp_Controller;

public class Browser {

	public static void main(String[] args) {
		System.out.println("Enter Employee Id:");
		Scanner scanner = new Scanner(System.in);
		String empId = scanner.nextLine();
		System.out.println("Enter Employee Name");
		Scanner scanner2 = new Scanner(System.in);
		String empName = scanner2.nextLine();
		Emp_Model model = new Emp_Model();
		
		Emp_View view = new Emp_View();
		Emp_Controller controller = new Emp_Controller(model,view);
		controller.setEmpId(empId);
		controller.setEmpName(empName);
		controller.updateView();

	}

	
}
