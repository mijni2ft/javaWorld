package codeup;

import java.util.Scanner;
public class CodeUp_003 {

	// 1046
	public static void main(String[] args) {
		// 공백으로 구분된 정수 3개를 입력받고
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		
		int a = Integer.valueOf(arr[0]);
		int b = Integer.valueOf(arr[1]);
		int c = Integer.valueOf(arr[2]);
		
		int sum = a+b+c;
		System.out.println(sum); // 합
		System.out.printf("%.1f", (float)sum/3); // 나눈 값을 순서대로 출력
	}
	
//	// 1045
//	public static void main(String[] args) {
//		// 공백으로 구분된 정수 2개를 입력받고
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		
//		System.out.println(a+b); // 합
//		System.out.println(a-b); // 차
//		System.out.println(a*b); // 곱
//		System.out.println(a/b); // 몫
//		System.out.println(a%b); // 나머지
//		System.out.printf("%.2f", (float)a/b); // 나눈 값을 순서대로 출력
//	}
	
//	// 1044
//	public static void main(String[] args) {
//		// 정수 1개를 입력받고
//		Scanner scan = new Scanner(System.in);
//		long i = scan.nextLong();
//		System.out.print(i+1); // 1을 더해 출력
//	}
	
//	// 1043
//	public static void main(String[] args) {
//		// 공백으로 구분된 정수2개를 입력받고
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		String[] arr = str.split(" ");
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		
//		// a를 b로 나눈 나머지를 출력
//		System.out.print(a%b);
//	}
	
//	// 1042
//	public static void main(String[] args) {
//		// 공백으로 구분된 정수2개를 입력받고
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		String[] arr = str.split(" ");
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		
//		// a를 b로 나눈 몫을 출력
//		int c = a/b;
//		System.out.print(c);
//	}
	
//	// 1041
//	public static void main(String[] args) {
//		// 영문자를 입력받고
//		Scanner scan = new Scanner(System.in);
//		String val = scan.next();
//		
//		// 영문자를 10진수로 변환
//		char ch = val.charAt(0);
//		int i = (int) ch;
//		
//		// 10진수 값을 증가시키고, 아스키문자로 변환
//		char str = (char)(i+1);
//		System.out.print(str);
//	}
	
//	// 1040
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int val = scan.nextInt();
//		
//		System.out.println(-val);
//	}
	
//	// 1039
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String val = scan.nextLine();
//		String[] arr =val.split(" ");
//		
//		long i = Long.valueOf(arr[0]);
//		long j = Long.valueOf(arr[1]);
//		
//		System.out.println(i + j);
//	}
	
//	// 1038 2개 정수의 합
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String val = scan.nextLine();
//		String[] arr =val.split(" ");
//		
//		long i = Long.valueOf(arr[0]);
//		long j = Long.valueOf(arr[1]);
//		
//		System.out.println(i + j);
//	}
	 
	
//	// 1037 10진 정수 1개를 아스키 문자로 출력
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		char ch = (char)i;
//		System.out.print(ch);
//	}
	
//	// 1036 영문자 1개를 10진수 값으로 출력
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		char ch = s.charAt(0);
//		int i = (int)ch;
//		System.out.print(i);
//	}
	
//	// 1035
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		
//		int i = Integer.valueOf(s, 16); // 16진수로 변환
//		
//		System.out.printf("%o", i); // 9진수로 출력
//	}
	
//	// 1034
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		
//		int i = Integer.valueOf(s, 8); // 8진수로 변환
//		
//		System.out.printf("%d", i); // 10진수로 출력
//	}
	
//	// 1033
//	public static void main(String[] args) {
//		int i;
//		Scanner scan = new Scanner(System.in);
//		i = scan.nextInt();
//		System.out.printf("%X", i); // 16진수 (대문자)
//	}
	
//	// 1032
//	public static void main(String[] args) {
//		int i;
//		Scanner scan = new Scanner(System.in);
//		i = scan.nextInt();
//		System.out.printf("%x", i); // 16진수 (소문자)
//	}
	
//	// 1031
//	public static void main(String[] args) {
//		int i;
//		Scanner scan = new Scanner(System.in);
//		i = scan.nextInt();
//		System.out.printf("%o", i); // 8진수
//	}
}