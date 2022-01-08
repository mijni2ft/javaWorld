package codeup;

import java.util.Scanner;
public class CodeUp_006 {
	// 1077
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int x = 0;
		
		do {
			System.out.println(x);
			x++;
		} while(x<=i); // 일단 무조건 1번 실행하고, 조건이 true면 또 실행
	}
	
//	// 1076
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		char a = scan.nextLine().charAt(0);
//		char pre = 'a';
//		
//		do {
//			System.out.print(pre + " ");
//			pre++;
//		} while(pre <= a); // 일단 무조건 1번 실행하고, 조건이 true면 또 실행
//	}
	
//	// 1075
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		while(true) {
//			if (a<=0)
//				break;
//			else
//				System.out.println(--a);
//		}
//	}
	
//	// 1074
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		while(true) {
//			if (a<1)
//				break;
//			else
//				System.out.println(a--);
//		}
//	}
	
//	// 1073
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		while(true) {
//			long a = scan.nextLong();
//			if (a==0)
//				break;
//			else
//				System.out.println(a);
//		}
//	}
	
//	// 1072
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		
//		while(a!=0) {
//			int b = scan.nextInt();
//			System.out.println(b);
//			a--;
//		}
//	}
	
//	// 1071
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			long a = scan.nextLong();
//			
//			if (a != 0)
//				System.out.println(a);
//			else 	
//				break;
//		}
//	}
}