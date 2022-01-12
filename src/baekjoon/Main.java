package baekjoon;

import java.util.Scanner;
public class Main {
	
	// 2839 설탕 배달 / 220ms
	public static void main(String[] args) {
		
		// 봉지의 최소 개수 출력 (3키로, 5키로)
		// 정확하게 n킬로그램을 만들 수 없다면 -1을 출력
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int b5 = n/5;
		int r = n%5;
		int cnt = 0;
		
		if (r == 0) {
			cnt = b5;
		} else if (r==1 && b5>=1) { // 1개가 남았다? 5키로짜리가 최소1개는 필요해
			// 하나 풀고 3으로 2개 묶어
			cnt = b5 -1 + 2;
		} else if (r==2 && b5>=2) { // 2개 남음. 5키로가 최소 2개필요
			// 2개풀고 3키로로 3번 묶어
			cnt = b5 - 2 + 4;
		} else if (r==3) { // 까알끔
			cnt = b5 + 1;
		} else if (r==4 && b5>= 1){ // 4개 남음. 최소 1개 필요
			// 한개 풀고 3개로 묶임
			cnt = b5 - 1 + 3;
		} else {
			cnt = -1;
		}
		
		System.out.print(cnt);
	}
	
//	// 2839 설탕 배달 / 204ms
//	public static void main(String[] args) {
//		
//		// 봉지의 최소 개수 출력 (3키로, 5키로)
//		// 정확하게 n킬로그램을 만들 수 없다면 -1을 출력
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int cnt = 0;
//		
//		/*
//		 * 4
//		 * 3
//		 * 2
//		 * 1 >> 
//		 * 0 >> 끝
//		 * */
//		
//		
//		int _몫 = n/5;
//		if (_몫> 0) { // 5로 나누어짐
//			cnt += _몫; // 봉지 수 올리고
//			n -= _몫*5;
//		}
//		
//		if (n <= 0) {
////			System.out.print(cnt);
//		} else if (0<n && n<=1) {
//			if (cnt < 1) { // 5키로말고 3키로로 해야하는데 5킬로도 없으면 불가
//				cnt = -1;
////				System.out.print(cnt);	
//			} else {
//				cnt -= 1; // 5키로를 하나 풀고
//				cnt += 2; // 3키로 짜리 2봉지 추가
//			}
//		} else if (1<n && n<=2) {
//			if (cnt < 2) { // 5키로짜리가 최소 2개 필요
//				cnt = -1;
//			} else {
//				cnt -= 2; // 5키로를 2개풀고
//				cnt += 4; // 그럼 남은게 12키로니까 3키로 짜리 4봉지 추가
//			}
//		} else if (2<n && n<=3) {
//			cnt++;
//		} else {
//			if (cnt < 1) { // 5키로가 최소 1개 필요
//				cnt = -1;
//			} else {
//				cnt -= 1; // 5키로를 하나 풀고
//				cnt += 3; // 풀려있는게 9키로니까 3키로 짜리 3봉지 추가
//			}
//		}
//		
//		System.out.print(cnt);
//		
//		
//		/*
//		 * 일단 냅다 5로 나눠
//		 * 몫이 0보다 커? 그럼 봉지 수를 몫만큼 올리고, 필요한 무게에서 그 값만큼 빼
//		 * 몫이 0보다 작어? 그럼 3으로 나눠. 근데 또 0보다 작어? -1 출력
//		 * 							 0보다 커? 그럼 봉지 수를 몫만큼 올리고, 필요한 무게에서 그 값만큼 빼
//		 * */
//		
//		
//	}

}
