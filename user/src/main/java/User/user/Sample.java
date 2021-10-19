package User.user;

import java.util.Scanner;


public class Sample {

	public static void main(String[] args) throws UserDefinedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  code:");
		int code = sc.nextInt();
		Employee c = new Employee();
		String Employee = c.findEmployeeBycode(code);
		System.out.println(Employee);	
	}

}
