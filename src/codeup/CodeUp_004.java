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
//		// �������� ���еǾ� ������ 2�� �Էµȴ�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(b != a ? "1" : "0"); // b�� a���� ũ�ų� ������ 1, �ƴϸ� 0
//	}
	
//	// 1051
//	public static void main(String[] args) {
//		// �������� ���еǾ� ������ 2�� �Էµȴ�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(b >= a ? "1" : "0"); // b�� a���� ũ�ų� ������ 1, �ƴϸ� 0
//	}
	
//	// 1050
//	public static void main(String[] args) {
//		// �������� ���еǾ� ������ 2�� �Էµȴ�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a == b ? "1" : "0"); // a�� b�� ������ 1, �ƴϸ� 0
//	}
	
//	// 1049
//	public static void main(String[] args) {
//		// �������� ���еǾ� ������ 2�� �Էµȴ�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]);
//		long b = Long.valueOf(arr[1]);
//		System.out.print(a > b ? "1" : "0"); // a�� b���� ũ�� 1, �ƴϸ� 0
//	}
	
//	// 1048
//	public static void main(String[] args) {
//		// �������� ���еǾ� ������ 2�� �Էµȴ�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		System.out.print(a<<b); // a�� 2�� b������ ���ض�
//	}
	
//	// 1047
//	public static void main(String[] args) {
//		// ������ 1�� �Էµȴ�
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		System.out.printf("%d", i<<1); // 2���Ͽ� ���
//	}
}