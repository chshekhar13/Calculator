import java.util.Scanner;

public class Function_Calculator {
	public static void main(String[] args) {
		int num1, num2, result;
		num1 = num2 = result = 0;
		Scanner sc = new Scanner(System.in);
		int choice ;
		choice = sc.nextInt();
		while(choice!=0)
		{
		System.out.println("\n Enter num1");
		num1 = sc.nextInt();
		System.out.println("\n Enter num2");
		num2 = sc.nextInt();

		System.out.println("Enter choice :");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		
		switch (choice) {
		case 1: {
			result = add(num1, num2);
			System.out.println("Add -> Num1 :" + num1 + "+ num2 " + num2 + " =" + result);
			break;
		}
		case 2: {
			result = sub(num1, num2);
			System.out.println("Sub -> Num1 :" + num1 + "- num2 " + num2 + " =" + result);
			break;
		}
		case 3: {
			result = mult(num1, num2);
			System.out.println("Mult -> Num1 :" + num1 + " *num2 " + num2 + " =" + result);
			break;
		}
		case 4: {
			result = div(num1, num2);
			System.out.println("Div ->Num1 :" + num1 + "/ num2 " + num2 + " =" + result);
			break;
		}

		}
		choice = sc.nextInt();
		}

		
		sc.close();
	}

	static int add(int no1, int no2) {
		return no1 + no2;

	}

	static int sub(int no1, int no2) {
		return no1 - no2;

	}

	static int mult(int no1, int no2) {
		return no1 * no2;

	}

	static int div(int no1, int no2) {
		return no1 / no2;

	}

}
