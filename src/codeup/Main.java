package codeup;

import java.util.Scanner;
public class Main {
	
	// 1099
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[10][10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		// 오른쪽이 막혀서 아래로 내려가야한다면.. 기존의 y축 값이 필요하다
		// 왜냐? x축 값이 1은 증가하고 y축 값은 기존 값으로 유지되어야 하니까
		// 그 기존 y축이 now_y 라고 하자
		
		int now_y = 1; // 2,2 가 거미집인데.. index 방식이니까 하나 작은 1부터
		boolean isEnd = false; // 먹이를 찾았는지 여부
		
		for (int i=1; i<10; i++) { // 2,2 가 거미집인데.. index 방식이니까 하나 작은 1부터
			for (int j=now_y; j<10; j++) {
				if (arr[i][j] == 0) { // 길이 열려있다? 일단 칠해
					arr[i][j] = 9;
					now_y = j; // 일단 현재 y축은 유효하니까 저장~
					continue; // 계속 오른쪽으로 가보자고
				} else if (arr[i][j] == 1) { // 막혀있다?
					break; // 아래로 내려가야하니 y축 이동은 그만하자
				} else { // 먹이발견
					arr[i][j] = 9;
					isEnd = true;
					break;
				}
			}
			
			if (isEnd) break; // 먹이를 찾았다면 중지
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
//	// 1098
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String[] sArr = scan.nextLine().split(" ");
//		
//		int h = Integer.parseInt(sArr[0]); // 세로
//		int w = Integer.parseInt(sArr[1]); // 가로
//		
//		int[][] arr = new int[h][w];
//		
//		int n = scan.nextInt();
//		
//		for (int k=0; k<n; k++) {
//			int len = scan.nextInt(); // 막대 길이
//			int d = scan.nextInt(); // 방향 (0:가로, 1:세로)
//			int x = scan.nextInt()-1; // int[][] 는 index니까 1감소
//			int y = scan.nextInt()-1;
//			
//			for (int i=0; i<len; i++) { // 막대길이만큼
//				if(d == 0) { // 가로로
//					arr[x][y+i] = 1;
//				} else { // 세로로
//					arr[x+i][y] = 1;
//				}
//			}
//		}
//		
//		for(int i=0; i<h; i++) {
//			for(int j=0; j<w; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
	
//	// 1097
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int[][] arr = new int[19][19];
//		
//		for(int i=0; i<19; i++) {
//			for(int j=0; j<19; j++) {
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		int n = scan.nextInt();
//		for (int k=0; k<n; k++) {
//			int x = scan.nextInt();
//			int y = scan.nextInt();
//			
//			for(int i=0; i<19; i++) {
//				if (arr[x-1][i] == 0) {
//					arr[x-1][i] = 1;
//				} else {
//					arr[x-1][i] = 0;
//				}
//			}
//			for(int j=0; j<19; j++) {
//				if (arr[j][y-1] == 0) {
//					arr[j][y-1] = 1;
//				} else {
//					arr[j][y-1] = 0;
//				}
//			}
//		}
//		
//		for(int i=0; i<19; i++) {
//			for(int j=0; j<19; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
}