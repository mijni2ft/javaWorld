package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class baekjoon_001 {
	
//	// 11399 ATM
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt(); // 인원 수 
//		
//		int[] arr = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			arr[i] = scan.nextInt(); // 걸리는 시간
//		}
//		
//		// 필요한 시간의 합의 최솟값을 구하라
//		// 걸리는 시간이 적은 순으로 정렬한다.
//		// 한명씩 걸리는 시간을 구한다.
//		// 그 합을 구하고 출력한다.
//
//		Arrays.sort(arr);
//		
//		int pre = 0;
//		int sum = 0;
//		
//		for (int i=0; i<n; i++) {
//			// 내 앞 모두 + 나 자신 이게 쌓임
//			pre += arr[i]; // 내 앞 순서 값들 축적
//			sum += pre;  // 순서마다 쌓이기
//		}
//		
//		System.out.println(sum);
//	}
	
//	// 11047 동전
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int k = scan.nextInt(); // 목표 금액
//		
//		int[] arr = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			arr[i] = scan.nextInt(); // 동전 단위
//		}
//		
//		// 최소 동전 갯수를 구해라
//		// 큰 금액부터 쪼로록 하면되지
//		
//		int cnt = 0;
//		
//		for (int i=n-1; i>=0; i--) { // 주의! 뒤에부터!
//			int s = k/arr[i]; // 몫
//			
//			if (s > 0) { // 오 나누어졌다면!
//				cnt += s; // 동전 갯수를 올리고
//				k -= arr[i]*s; // 남은 금액을 차감
//			}
//		}
//		
//		System.out.println(cnt);
//	}
	
//	// 1931 회의실 배정 / 1208ms / 정답
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int[][] arr = new int[n][2];
//		
//		for (int i=0; i<n; i++) {
//			arr[i][0] = scan.nextInt(); // 시작시간
//			arr[i][1] = scan.nextInt(); // 끝나는시간
//		}
//		
//		// 제일 일찍 끝나는 수업을 고른다.
//		// 그 끝난시간에서 가장 가까운 시작 수업을 고른다.
//		// 반복한다.
//		// 단, 끝나는 시간이 같은 경우, 시작시간이 먼저인 것을 우선으로 둔다.
//		
//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] a, int[] b) {
//				
//				if(a[1] == b[1]) { // 만약 끝나는 시간이 같다면
//					return a[0]-b[0]; // 시작시간이 빠른 순으로 정렬
//				}
//				
//				return a[1]-b[1]; // 끝나는시간이 빠른 순으로 정렬
//			}
//		});
//		
//		int cnt = 0;
//		int now_time = 0;
//		for (int i=0; i<n; i++) {
//			if (now_time <= arr[i][0]) {
//				now_time = arr[i][1];
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
//	}
		
//		// 1931 회의실 배정 / 첫번째 도전
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			
//			int[][] arr = new int[n][2];
//			
//			for (int i=0; i<n; i++) {
//				arr[i][0] = scan.nextInt(); // 시작시간
//				arr[i][1] = scan.nextInt(); // 끝나는시간
//			}
//			
//			int cnt = 0; // 회의 횟수
//			int last_time = 0; // 그래서 마지막이 몇시인데
//			int end_time = 100000; // 가장빨리 끝나는 수업시간
//			int now_time = 0; // 현재시간
//			
//			for (int j=0; j<n; j++) {
//				if (end_time >= arr[j][1]) { // 가장 먼저 끝나는 수업시간
//					end_time = arr[j][1];	
//				}
//				
//				if (last_time <= arr[j][1]) { // 그래서 마지막이 몇시야
//					last_time = arr[j][1];
//				}
//			}
//			
//			if (end_time != 100000) { // 오케이 회의 하나 함 (4시에 끝남)
//				cnt++; // 회의 횟수 올리고
//				now_time = end_time; // 회의 하나 했으니 시간흐름
//				end_time = 0; // 다시 비워주고
//			}
//			
//			for (int j=0; j<n; j++) {
//				if (now_time == arr[j][0]) { // 시작시간이 지금이랑 같아? 최고 효율이다
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // 냅다 넣어 너가 1등임 or 더 먼저끝나는 회의 등장
//					}
//				} else if (now_time < arr[j][0]) { // 텀이 생기긴하지만..그래도 할 수 있는 회의다
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // 냅다 넣어 너가 1등임 or 더 먼저끝나는 회의 등장
//					}				
//				}
//			}
//			
//			if (end_time != 0) {
//				cnt++;
//				now_time = end_time; // 회의 하나 했으니 시간흐름
//				end_time = 0;
//			}
//			
//			boolean isEnd = false;
//			
//			for (int j=0; j<n; j++) {
//				if (now_time == arr[j][0]) { // 시작시간이 지금이랑 같아? 최고 효율이다
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // 냅다 넣어 너가 1등임 or 더 먼저끝나는 회의 등장
//					}
//				} else if (now_time < arr[j][0]) { // 텀이 생기긴하지만..그래도 할 수 있는 회의다
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // 냅다 넣어 너가 1등임 or 더 먼저끝나는 회의 등장
//					}				
//				}
//				
//				if (j == n-1 && now_time == last_time) { // 마지막 턴이고 시간도 끝까지 했다면
//					isEnd = true;
//				}
//			}
//		}
	
//	// 2839 설탕 배달 / 220ms
//	public static void main(String[] args) {
//		
//		// 봉지의 최소 개수 출력 (3키로, 5키로)
//		// 정확하게 n킬로그램을 만들 수 없다면 -1을 출력
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int b5 = n/5;
//		int r = n%5;
//		int cnt = 0;
//		
//		if (r == 0) {
//			cnt = b5;
//		} else if (r==1 && b5>=1) { // 1개가 남았다? 5키로짜리가 최소1개는 필요해
//			// 하나 풀고 3으로 2개 묶어
//			cnt = b5 -1 + 2;
//		} else if (r==2 && b5>=2) { // 2개 남음. 5키로가 최소 2개필요
//			// 2개풀고 3키로로 3번 묶어
//			cnt = b5 - 2 + 4;
//		} else if (r==3) { // 까알끔
//			cnt = b5 + 1;
//		} else if (r==4 && b5>= 1){ // 4개 남음. 최소 1개 필요
//			// 한개 풀고 3개로 묶임
//			cnt = b5 - 1 + 3;
//		} else {
//			cnt = -1;
//		}
//		
//		System.out.print(cnt);
//	}
	
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
