package codeup;

import java.util.Scanner;
public class CodeUp_002 {
	
	// 1030
	public static void main(String[] args) {
		long a;
		Scanner scan = new Scanner(System.in);
		a = scan.nextLong();
		
//		System.out.printf("%d", a);
		System.out.print(a);
	}
	
//	// 1029
//	public static void main(String[] args) {
//		double a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextDouble();
//		
//		System.out.printf("%.11f", a);
//	}
	
//	// 1028
//	public static void main(String[] args) {
//		long a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextLong();
//		
//		System.out.println(a);
//	}
	
//	// 1027
//	public static void main(String[] args) {
//		String a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextLine();
//		
//		String[] arr = a.split("\\.");
//		
//		System.out.print(arr[2] + "-" + arr[1] + "-" + arr[0]);
//	}
	
	// 1026
//	public static void main(String[] args) {
//		String a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.next();
//		
//		String[] arr = a.split(":");
//		System.out.println(Integer.valueOf(arr[1]));
//	}
	
//	// 1025
//	public static void main(String[] args) {
//		int a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		
//		String str = String.valueOf(a);
//		String[] arr = str.split("");
//		
//		for (int i=0; i<str.length(); i++) {
//			
//			String org = arr[i];
//			
//			int zeroCnt = str.length() - 1 - i;
//			
//			for (int j=0; j<zeroCnt; j++) {
//				org += "0";
//			}
//			
//			System.out.println("[" + org + "]");
//		}
//		
//		
//		// ���۸�
////        String s;        
////        Scanner sc = new Scanner(System.in);
////        s=sc.next();
////        int [] data = new int[s.length()];
////                
////        for(int i=0; i<s.length(); i++) {
////            data[i]=s.charAt(i)-'0'; // String or Char �� int�� ����ȯ�ϴ� ���
////        }
////        
////        System.out.println("["+data[0]*10000+"]");
////        System.out.println("["+data[1]*1000+"]");
////        System.out.println("["+data[2]*100+"]");
////        System.out.println("["+data[3]*10+"]");
////        System.out.println("["+data[4]+"]");
//	}
	
	// 1024
//	public static void main(String[] args) {
//		String a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.next();
//		
//		// ���� �̷��� 14248 / 109
////		String [] arr = a.split("");
////		for (String str : arr) {
////			System.out.println("'" + str + "'");			
////		}
//		
//		// �̰� ���۸� 14260 / 117
////		for(int i=0; i<a.length(); i++) {
////			System.out.println("'" + a.charAt(i) + "'");
////		}
//		
//	}
	
//	// 1023
//	public static void main(String[] args) {
//		Double a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextDouble();
//		
//		// TODO CHECK :: �ΰ��� ������
//		// �̰Ŵ� �ȵǴµ�
////		String str= String.valueOf(a);
//		
//		// �̷��Դ� �ȴ�
//		String str;
//		str = String.valueOf(a);
//		
//		String[] arr = str.split("\\.");
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//	}
	
//	// 1022
//	public static void main(String[] args) {
//		String a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextLine();
//		System.out.print(a);
//	}
	
//	// 1021
//	public static void main(String[] args) {
//		String a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.next();
//		System.out.print(a);
//	}
	
	// 1020
//	public static void main(String[] args) {
//		String a = "";
//		Scanner scan = new Scanner(System.in);
//		a = scan.next();
//		a = a.replaceAll("-", "");
//		System.out.print(a);
//	}
	
	// 1019 - 2021.2.4 �� 2021.02.04 �� ���
//	public static void main(String[] args) {
//		String a = "";
//		Scanner scan = new Scanner(System.in);
//		a = scan.next();
//		
//		String[] arr = a.split("\\.");
//		
//		Integer a1 = Integer.parseInt(arr[0]);
//		Integer a2 = Integer.parseInt(arr[1]);
//		Integer a3 = Integer.parseInt(arr[2]);
//		
//		System.out.printf("%04d.%02d.%02d", a1, a2, a3);
//	}
	
//	// 1018 - �ð� �Է¹޾� �״�� ����ϱ�
//	public static void main(String[] args) {
//		String a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextLine();
//		System.out.print(a);
//	}
	
	// 1017
//	public static void main(String[] args) {
//		int a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		System.out.print(a + " " + a + " " + a);
//	}
	
	// 1016 �� ����?
	
	// 1015
//	public static void main(String[] args) {
//		float a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextFloat();
//		System.out.printf("%.2f",a);
//	}
	
//	// 1014
//	public static void main(String[] args) {
//		String a, b;
//		Scanner scan = new Scanner(System.in);
//		a = scan.next();
//		b = scan.next();
//		System.out.print(b + " " + a);
//	}
	
//	// 1013
//	public static void main(String[] args) {
//		int a, b;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		b = scan.nextInt();
//		System.out.print(a + " " + b);
//	}
	
//	// 1012
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		float num = scan.nextFloat();
//		System.out.printf("%f",num); // �Ҽ��� �������� ���
//	}
	
	// 1011
//	public static void main(String[] args) {
//		String str;
//		Scanner scan = new Scanner(System.in);
//		str = scan.next();
//		System.out.print(str);
//	}
	
	// 1010
//	public static void main(String[] args) {
//		int a;
//		Scanner scan = new Scanner(System.in);
//		a = scan.nextInt();
//		System.out.print(a);
//	}
}