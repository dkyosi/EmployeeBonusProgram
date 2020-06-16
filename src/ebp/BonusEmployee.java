package ebp;
//imports
import java.util.Scanner;

//class
public class BonusEmployee {

	//the main function
	public static void main(String[] args) {
		  
		//variable declaration
		
	        int yearsOfService;
	        double employeeSalary;
	        String employeeName;

	        //scanner object
	        Scanner in = new Scanner(System.in);

	        //Get the employee name from the keyboard
	        System.out.print("Enter name of Employee :: ");
	        employeeName = in.nextLine();

	        //Get the employee salary from the keyboard
	        System.out.print("Enter Salary of Employee ? ");
	        employeeSalary = in.nextDouble();

	        //Get the employee years of service from the keyboard
	        System.out.print("Enter total year of services ? ");
	        yearsOfService = in.nextInt();

	        //Create an object of the class
	        BonusEmployee bonus = new BonusEmployee();
	        
	        //call the method to display bonus
	        bonus.showEmployeeBonus(bonus.findEmployeeBonus(yearsOfService, employeeSalary),employeeName);

	        //close the scanner
	        in.close();


	    }
	
	
	//method to find the bonus
	public double findEmployeeBonus(double years, double salary)

	{

		double employeBonus;

		// Check if year of service is between 10 and 15

		if (years >= 10 && years < 15)

		{

			employeBonus = salary*1;

		}

		// Check if year of services is 6 and 9

		else if (years >= 6 && years < 10)

		{

			employeBonus = salary * 0.75;

		}

		// Check if year of services is between 1 and 5

		else if (years >= 1 && years < 6)

		{

			employeBonus = salary * 0.50;

		}

		// If the year of service does not include the defined ranges, then the bonus is 0

		else

		{

			return 0;

		}

		return employeBonus;

	}

	// Define the method to display the bonus of the employee

	public void showEmployeeBonus(double employeBonus,String employeName) {

		// display the employee bonus
		if(employeBonus>0) {
			System.out.println("Total bonus is " + employeBonus);

		}else {
			System.out.println("Hey "+employeName+", Your are not eligible for a bonus ...");
		}
		

	}

	}


