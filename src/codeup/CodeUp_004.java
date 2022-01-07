package codeup;

import java.util.Scanner;
public class CodeUp_004 {

	// 1086
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		
		double w = Double.valueOf(arr[0]);
		double h = Double.valueOf(arr[1]);
		double b = Double.valueOf(arr[2]);
		
		double res = (w*h*b/8)/(1<<10)/(1<<10);
		
		System.out.printf("%.2f MB", res);
	}
	
//	// 1085
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		double h = Double.valueOf(arr[0]);
//		double b = Double.valueOf(arr[1]);
//		double c = Double.valueOf(arr[2]);
//		double s = Double.valueOf(arr[3]);
//		
//		double res = (h*b*c*s/8)/(1<<10)/(1<<10);
//		
//		System.out.printf("%.1f MB", res);
//	}
	
//	// 1064
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		long c = Long.valueOf(arr[2]);
//		
//		System.out.print((a>b?b:a)>c ? c:(a>b?b:a));
//	}
	
//	// 1063
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a>b ? a : b);
//	}
	
//	// 1062
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a^b);
//	}
	
//	// 1061
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a|b);
//	}
	
//	// 1060
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a&b);
//	}
	
//	// 1059
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		long a = scan.nextLong();
//		System.out.printf("%d", ~a);
//	}
	
//	// 1058
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a == 0 && b == 0 ? "1":"0");
//	}
	
//	// 1057
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a == b ? "1":"0");
//	}
	
//	// 1056
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a != b ? "1":"0");
//	}
	
//	// 1055
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a == 1 || b == 1 ? "1":"0");
//	}
	
//	// 1054
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a == 1 && b == 1 ? "1":"0");
//	}
	
//	// 1053
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		System.out.print(i == 0 ? "1":"0");
//	}
	
//	// 1052
//	public static void main(String[] args) {
//		// 공백으로 구분되어 정수가 2개 입력된다
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(b != a ? "1" : "0"); // b가 a보다 크거나 같으면 1, 아니면 0
//	}
	
//	// 1051
//	public static void main(String[] args) {
//		// 공백으로 구분되어 정수가 2개 입력된다
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(b >= a ? "1" : "0"); // b가 a보다 크거나 같으면 1, 아니면 0
//	}
	
//	// 1050
//	public static void main(String[] args) {
//		// 공백으로 구분되어 정수가 2개 입력된다
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a == b ? "1" : "0"); // a와 b가 같으면 1, 아니면 0
//	}
	
//	// 1049
//	public static void main(String[] args) {
//		// 공백으로 구분되어 정수가 2개 입력된다
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a > b ? "1" : "0"); // a가 b보다 크면 1, 아니면 0
//	}
	
//	// 1048
//	public static void main(String[] args) {
//		// 공백으로 구분되어 정수가 2개 입력된다
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a<<b); // a와 2의 b제곱과 곱해라
//	}
	
//	// 1047
//	public static void main(String[] args) {
//		// 정수가 1개 입력된다
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		System.out.printf("%d", i<<1); // 2배하여 출력
//	}
}