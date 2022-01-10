package codeup;

import java.util.Scanner;
public class CodeUp_007 {
	
	// 1093
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] arr = new int[23];
		
		for (int i=0; i<n; i++) {
			int j = scan.nextInt();
			arr[j-1] += 1;
		}
		
		for (int j=0; j<23; j++) {
			System.out.print(arr[j] + " ");
		}
	}
	
//	// 1092
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);  
//		int b = Integer.valueOf(arr[1]);  
//		int c = Integer.valueOf(arr[2]);
//		
//		int i=1;
//		
//		while(true) {
//			if (i%a ==0 && i%b==0 && i%c==0) {
//				break;
//			}
//			i++;
//		}
//		System.out.print(i);
//	}
	
//	// 1091
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]); // 시작 값
//		long m = Long.valueOf(arr[1]); // 곱할 값
//		long d = Long.valueOf(arr[2]); // 더할 값
//		long n = Long.valueOf(arr[3]);
//		
//		for(int j=1; j<n; j++) {
//			a = (a*m)+d;
//		}
//		System.out.print(a);
//	}
	
//	// 1090
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		long a = Long.valueOf(arr[0]); // 시작 값
//		long b = Long.valueOf(arr[1]); // 등비
//		long n = Long.valueOf(arr[2]);
//		
//		for(int j=1; j<n; j++) {
//			a *= b;
//		}
//		System.out.print(a);
//	}
	
//	// 1089
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int a = Integer.valueOf(arr[0]);
//		int b = Integer.valueOf(arr[1]); // 등차
//		int n = Integer.valueOf(arr[2]);
//		
//		for(int j=1; j<n; j++) {
//			a += b;
//		}
//		
//		System.out.print(a);
//	}
	
//	// 1088
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		
//		for(int j=1; j<=i; j++) {
//			if (j%3 != 0) {
//				System.out.print(j+" ");
//			}
//		}
//	}
	
//	// 1087
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		
//		int j = 1;
//		int sum = 0;
//		
//		while(true) {
//			sum += j;
//			j++;
//			
//			if (sum >=i) {
//				System.out.print(sum);
//				break;
//			}
//			
//		}
//	}
	
//	// 1083
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		
//		for (int j = 1; j<=i; j++) {
//			if (j%3 == 0) {
//				System.out.print("X");
//			} else {
//				System.out.print(j);
//			}
//			
//			System.out.print(" ");
//		}
//	}
	
//	// 1082
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt(16);
//		
//		for (int i=1; i<16; i++) {
//			System.out.printf("%X*%X=%X\n", a, i, a*i);
//		}
//	}
	
//	// 1081
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int n = Integer.valueOf(arr[0]);  
//		int m = Integer.valueOf(arr[1]);
//		
//		for (int i=1; i<=n; i++) {
//			for (int j=1; j<=m; j++) {
//				System.out.println(i + " " + j);				
//			}
//		}
//	}
	
//	// 1080
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt();
//		
//		int j = 0;
//		int sum = 0;
//		
//		while(true) {
//			if (sum >= i) {
//				System.out.println(j);
//				break;
//			}
//			++j;
//			sum += j;
//		}
//	}
	
//	// 1079
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			
//			if ("q".equals(arr[i])) {
//				break;
//			}
//		}
//	}
	
//	// 1078
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int i = scan.nextInt(); // 정수 1개가 입력된다
//		
//		int sum = 0;
//		
//		for (int j = 1; j<=i; j++) {
//			if (j%2 == 0) {
//				sum += j;
//			} 
//		}
//		System.out.print(sum);
//	}
	
}