import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String line = in.nextLine();
		line = "5"+line;
		System.out.println(Integer.parseInt(line)+5);
		


		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String line = in.nextLine();
		line = "4"+line+"3";
		System.out.println(Double.parseDouble(line)+3.4);

		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String line = in.nextLine();
		System.out.println(!Boolean.parseBoolean(line));


		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String line = in.nextLine();
		line = line + "3";
		int num = Integer.parseInt(line)+2;
		System.out.println((char)num);
		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String line = in.nextLine();
		line = line + "1";
		int num = Integer.parseInt(line)/2;
		System.out.println((double)num);
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String line = in.nextLine();
		line = "1"+line;
		double num = Double.parseDouble(line);
		System.out.println((int)num);
		
	}

}
