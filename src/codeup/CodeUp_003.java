package codeup;

import java.util.Scanner;
public class CodeUp_003 {

	// 1046
	public static void main(String[] args) {
		// �������� ���е� ���� 3���� �Է¹ް�
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		
		int a = Integer.valueOf(arr[0]);
		int b = Integer.valueOf(arr[1]);
		int c = Integer.valueOf(arr[2]);
		
		int sum = a+b+c;
		System.out.println(sum); // ��
		System.out.printf("%.1f", (float)sum/3); // ���� ���� ������� ���
	}
	
//	// 1045
//	public static void main(String[] args) {
//		// �������� ���е� ���� 2���� �Է¹ް�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		
//		System.out.println(a+b); // ��
//		System.out.println(a-b); // ��
//		System.out.println(a*b); // ��
//		System.out.println(a/b); // ��
//		System.out.println(a%b); // ������
//		System.out.printf("%.2f", (float)a/b); // ���� ���� ������� ���
//	}
	
//	// 1044
//	public static void main(String[] args) {
//		// ���� 1���� �Է¹ް�
//		Scanner scan = new Scanner(System.in);
//		long i = scan.nextLong();
//		System.out.print(i+1); // 1�� ���� ���
//	}
	
//	// 1043
//	public static void main(String[] args) {
//		// �������� ���е� ����2���� �Է¹ް�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		String[] arr = str.split(" ");
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		
//		// a�� b�� ���� �������� ���
//		System.out.print(a%b);
//	}
	
//	// 1042
//	public static void main(String[] args) {
//		// �������� ���е� ����2���� �Է¹ް�
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		String[] arr = str.split(" ");
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]);
//		
//		// a�� b�� ���� ���� ���
//		int c = a/b;
//		System.out.print(c);
//	}
	
//	// 1041
//	public static void main(String[] args) {
//		// �����ڸ� �Է¹ް�
//		Scanner scan = new Scanner(System.in);
//		String val = scan.next();
//		
//		// �����ڸ� 10������ ��ȯ
//		char ch = val.charAt(0);
//		int i = (int) ch;
//		
//		// 10���� ���� ������Ű��, �ƽ�Ű���ڷ� ��ȯ
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
	
//	// 1038 2�� ������ ��
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
	 
	
//	// 1037 10�� ���� 1���� �ƽ�Ű ���ڷ� ���
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		char ch = (char)i;
//		System.out.print(ch);
//	}
	
//	// 1036 ������ 1���� 10���� ������ ���
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
//		int i = Integer.valueOf(s, 16); // 16������ ��ȯ
//		
//		System.out.printf("%o", i); // 9������ ���
//	}
	
//	// 1034
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.next();
//		
//		int i = Integer.valueOf(s, 8); // 8������ ��ȯ
//		
//		System.out.printf("%d", i); // 10������ ���
//	}
	
//	// 1033
//	public static void main(String[] args) {
//		int i;
//		Scanner scan = new Scanner(System.in);
//		i = scan.nextInt();
//		System.out.printf("%X", i); // 16���� (�빮��)
//	}
	
//	// 1032
//	public static void main(String[] args) {
//		int i;
//		Scanner scan = new Scanner(System.in);
//		i = scan.nextInt();
//		System.out.printf("%x", i); // 16���� (�ҹ���)
//	}
	
//	// 1031
//	public static void main(String[] args) {
//		int i;
//		Scanner scan = new Scanner(System.in);
//		i = scan.nextInt();
//		System.out.printf("%o", i); // 8����
//	}
}