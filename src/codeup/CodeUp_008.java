package codeup;

import java.util.ArrayList;
import java.util.Scanner;
public class CodeUp_008{
	
	
	// 1096
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 흰돌의 갯수
		
		int[][] arr = new int[19][19]; // 바둑판
		
		for (int i=0; i<n; i++) {
			// 이게 왜 안되는거야?
//			String[] sArr = scan.nextLine().split(" ");
//			int x_num = Integer.valueOf(sArr[0]);
//			int y_num = Integer.valueOf(sArr[1]);
			
			int x_num = scan.nextInt();
			int y_num = scan.nextInt();
			
			arr[x_num-1][y_num-1] = 1;
		}
		
		for (int x=0; x<19; x++) {
			for (int y=0; y<19; y++) {
				System.out.print(arr[x][y]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		
	}
	
//	// 1095
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int min=0;
//		
//		for (int i=0; i<n; i++) {
//			int a = scan.nextInt();
//			if (i == 0) min=a;
//			
//			if (a<min)
//				min = a;
//		}
//		
//		System.out.print(min);
//	}
	
//	// 1094
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		ArrayList<Integer> arr = new ArrayList<>();
//		
//		for (int i=0; i<n; i++) {
//			arr.add(scan.nextInt());
//		}
//		
//		for (int k=0; k<arr.size(); k++) {
//			int idx = arr.size()-k-1;
//			System.out.print(arr.get(idx) + " ");
//		}
//	}
	
//	 // 1094 - 다른방식
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        
//        for(int i=n-1; i>=0; i--) {
//            System.out.print(arr[i]+" ");
//        }
//    }
	 
	
//	// 1084 - 정답
//	import java.io.BufferedReader;
//	import java.io.BufferedWriter;
//	import java.io.IOException;
//	import java.io.InputStreamReader;
//	import java.io.OutputStreamWriter;
//	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		try {
//			String str = br.readLine();
//			String[] arr = str.split(" ");
//			int cnt = 0;
//			
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			
//			for (int i = 0; i < Integer.valueOf(arr[0]); i++) {
//				for (int j = 0; j < Integer.valueOf(arr[1]); j++) {
//					for (int k = 0; k < Integer.valueOf(arr[2]); k++) {
//						bw.write(i + " " + j + " " + k + "\n");
//						cnt++;
//					}
//				}
//			}
//			
//			bw.write(String.valueOf(cnt));
//			bw.flush();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	
//	// 1084 - 시간초과
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		String[] arr = str.split(" ");
//		
//		int r = Integer.parseInt(arr[0]);
//		int g = Integer.parseInt(arr[1]);
//		int b = Integer.parseInt(arr[2]);
//		
//		int cnt=0;
//		
//		for(int i=0; i<r; i++) {
//			for(int j=0; j<g; j++) {
//				for(int k=0; k<b; k++) {
//					System.out.println(i + " " + j + " " + k);
//					cnt++;
//				}
//			}
//		}
//		System.out.println(cnt);
//	}
}