package Java_Development_internship;

import java.util.Scanner;

public class Student_Grade_Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects.");
		int n = sc.nextInt();
		System.out.println("Enter the marks of the subject one by one.");
		double sum = 0 ;
		for (int i = 1; i <= n; i++) {
			sum+= sc.nextDouble();
		}
		int m = (int)sum/n;

		switch (m/10){
			case 10:
			case 9:
				System.out.println("Grade is O");
				break;
			case 8:
				System.out.println("Grade is A");
				break;
			case 7:
				System.out.println("Grade is B");
				break;
			case 6:
				System.out.println("Grade is C");
				break;
			case 5:
				System.out.println("Grade is D");
				break;
			case 4:
				System.out.println("Grade is E");	
				break;
			default:
				System.out.println("Grade is F");
				break;
		}
		sc.close();
		
	}



}


