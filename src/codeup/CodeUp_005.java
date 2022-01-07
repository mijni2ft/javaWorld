package codeup;

import java.util.Scanner;
public class CodeUp_005 {

	// 1070
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		switch(a) {
			case 12:
			case 1:
			case 2:
				System.out.println("winter"); 
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("spring"); 
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("summer"); 
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("fall"); 
				break;
		}
	}
	
//	// 1069
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		
//		switch(str) {
//		case "A":
//			System.out.println("best!!!"); 
//			break;
//		case "B":
//			System.out.println("good!!"); 
//			break;
//		case "C":
//			System.out.println("run!"); 
//			break;
//		case "D":
//			System.out.println("slowly~"); 
//			break;
//		default:
//			System.out.println("what?"); 
//			break;
//		}
//	}
	
//	// 1068
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		
//		if (90<=a) {
//			System.out.println("A");				
//		} else if (70<=a && a<90) {
//			System.out.println("B");
//		} else if (40<=a && a<=70) {
//			System.out.println("C");
//		} else {
//			System.out.println("D");
//		}
//	}
	
//	// 1067
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		long a = scan.nextLong();
//		
//		if (a > 0) {
//			System.out.println("plus");				
//		} else {
//			System.out.println("minus");
//		}
//		
//		if (a%2 == 0) {
//			System.out.println("even");				
//		} else {
//			System.out.println("odd");
//		}
//	}
	
//	// 1066
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		for (String val: arr) {
//			int a = Integer.valueOf(val);
//			if (a%2 == 0) {
//				System.out.println("even");				
//			} else {
//				System.out.println("odd");
//			}
//		}
//	}
	
//	// 1065
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		for (String val: arr) {
//			int a = Integer.valueOf(val);
//			if (a%2 == 0)
//				System.out.println(a);				
//		}
//	}
}