package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class baekjoon_001 {
	
	// 1202 보석 도둑
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 보석의 갯수
		int k = scan.nextInt(); // 가지고 있는 가방
		
		// 가방 하나에 보석 하나만 가능
		int[] marr = new int[n]; // 무게 arr
		int[] varr = new int[n]; // 가격 arr
		
		for (int i=0; i<n; i++) {
			marr[i] = scan.nextInt();
			varr[i] = scan.nextInt();
		}
		
		int[] karr = new int[k]; // 가방 무게 
		for (int i=0; i<k; i++) {
			karr[i] = scan.nextInt();
		}
		
		/*
		 * 비싼 것을 우선순위로 정렬
		 * 가방
		 * 1. 가방 무게가 큰 순으로 정렬한다
		 * 2. 가장
		 * 
		 * */
		
	}
	
//	// 1026 보물
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int[] a = new int[n];
//		int[] b = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			a[i] = scan.nextInt();
//		}
//		
//		for (int i=0; i<n; i++) {
//			b[i] = scan.nextInt();
//		}
//		
//		/*
//		 * A는 오름차순으로 정렬
//		 * B는 내림차순으로 정렬
//		 * B는 재정렬이 불가능하다 했으므로, sort로 정렬
//		 * */
//
//		Integer[] sort_b = new Integer[n];
//		
//		for(int i=0; i<n; i++) {
//			sort_b[i] = b[i];
//		}
//		
//		Arrays.sort(a);
//		Arrays.sort(sort_b, Collections.reverseOrder()); // 내림차순정렬
//		
//		int sum = 0;
//		for(int i=0; i<n; i++) {
//			sum += a[i]*sort_b[i];
//		}
//		
//		System.out.println(sum);
//		
//	}
	

//	// 1946 신입사원
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int tn = scan.nextInt(); // 테스트 케이스의 갯수
//		
//		for (int i=0; i<tn; i++) {
//			 int n = scan.nextInt(); // 지원자 수
//			 int[] arr = new int[n+1]; // n+1 로 만드는 이유는 (등수는 1부터고, index는 0부터라 하나 크게 만든다)
//			 
//			for (int j=0; j<n; j++) {
//				int x = scan.nextInt(); // 서류심사 등수
//				int y = scan.nextInt(); // 면접심사 등수
//				arr[x] = y; // 이렇게 넣으므로 서류심사 순으로 정렬을 하지 않아도된다. (자동으로 서류심사 순이니까)
//			}
//			
//			int max = 1; // 최대 선발 인원수 (서류심사 1등은 무조건 통과이므로 1부터 시작)
//			int interview_top = arr[1]; // 면접 제일 잘본 등수 (기본값: 서류심사 1등의 면접등수)
//			
//			for (int j=2; j<=n; j++) { // arr[0] 은 어차피 빈 값이고, arr[1] 은 이미 합격이니 2부터 시작
//				if (interview_top > arr[j]) { // 나의 면접등수가 높다면
//					interview_top = arr[j]; // 면접 잘 본 등수를 갈아치우고
//					max++; // 나는 통과
//				}
//			}
//			
//			System.out.println(max);
//		}
//	}
	
	
//	// 1946 신입사원 / 시간초과 (2차원 배열을 사용하여 정렬하면서 오바된듯)
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int tn = scan.nextInt(); // 테스트 케이스의 갯수
//		
//		// 서류/면접 둘다 떨어진다면 탈락
//		// 선발할 수 있는 최대 인원수를 각각 출력해라
//		
//		int[] res = new int[tn];
//		
//		for (int i=0; i<tn; i++) {
//			int n = scan.nextInt(); // 지원자 수
//			int[][] arr = new int[n][2];
//			
//			for (int j=0; j<n; j++) {
//				arr[j][0] = scan.nextInt();
//				arr[j][1] = scan.nextInt();
//			}
//			
//			// 서류심사 성적순으로 정렬
//			Arrays.sort(arr, new Comparator<int[]>() {
//				@Override
//				public int compare(int[] a, int[] b) {
//					return a[0]-b[0];
//				}
//			});
//			
//			int max = 0; // 최대 선발 인원수
//			int interview_top = n; // 면접 제일 잘본 등수
//			
//			for (int j=0; j<n; j++) {
//				
//				int my_interview = arr[j][1]; // 내 면접 등수
//				
//				if(arr[j][0] == 1) { // 서류심사가 1등이라면 무조건 통과
//					max++;
//					interview_top = my_interview;
//					continue;
//				}
//				
//				if (interview_top > arr[j][1]) {
//					interview_top = arr[j][1]; // 면접 잘 본 등수를 갈아치운다
//					max++;
//				}
//			}
//			
//			res[i] = max;
//		}
//		
//		for (int i=0; i<tn; i++) {
//			System.out.println(res[i]);			
//		}
//		
//		
//		// 일단 서류심사 성적 순으로 정렬
//		// 서류든 면접이든 1등이라면 무조건 합격
//		// 서류순서를 기준으로 나보다 앞에있는 지원자의 면접등수가 나보다 높다면 나는 탈락.
////		1 4 -- (합격) 무조건 합격 1등이니까
////		2 5 -- (탈락) 서류1등인 아이가 나보다 면접도 높아
////		3 6 -- (탈락) 서류1등인 아이가 나보다 면접도 높아
////		4 2 -- (합격) 합격 나보다 서류 높은애들이 면접은 낮네
////		5 7 -- (탈락) 서류1등인 아이가 나보다 면접도 높아
////		6 1 -- (합격) 무조건 합격 1등이니까
////		7 3 -- (탈락) 서류1등인 아이가 나보다 면접도 높아
//		
//	}
	
//	// 2217 로프
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt(); // 로프의 갯수
//		
//		int[] arr = new int[n]; // 각 로프가 들 수 있는 중량들
//		
//		for (int i=0; i<n; i++) {
//			arr[i] = scan.nextInt();
//		}
//		
//		// k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때,
//		// 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.
//		
//		// 들어올릴 수 있는 최대 중량을 구해라.
//		// 모든 로프를 사용할 필요는 없다.
//		
//		Arrays.sort(arr); // 1. 중량이 작은 순으로 정렬
//		
//		int max = 0; // 최대로 들 수 있는 중량
//		
//		for (int i=0; i<n; i++) {
//			// 중량이 작은 순으로 정렬되었기 때문에 뒤에
//			// i보다 뒤에 있는 중량은 모두 arr[i] 의 중량만큼은 들어올릴 수 있다.
//			// 그래서 현재 들어올릴 수 있는 중량 = arr[i]에
//			// 뒤에 남은 로프의 갯수를 곱하면, 그게 최대로 들어올릴 수 있는 중량이된다.
//			int now = arr[i]*(n-i);
//			
//			if (max < now) {
//				max = now;
//			}
//		}
//		
//		System.out.println(max);
//		
//		// 7, 10, 12     -> 21 (7,10,12 모두 사용하여 7*3 = 21)
//		// 5, 10, 15, 16 -> 30 (10,15,16 또는 15,16) 
//		// 5, 12, 15, 16 -> 36 (12,15,16 사용하여 12*3 :: 5*4보다 12*3이 더 크다는게 핵심)
//		
//	}
	
//	// 1541 잃어버린 괄호
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		
//		// 식의 값을 최소로 만들어라
//		
////			10-20+40-90+70+80-60
////			10-(20+40)-(90+70+80)-60
////	 		즉, 마이너스 연산자 뒤에는 숫자가 클 수록 식의 결과 값이 작아진다.
////			마이너스 기준으로 자르고, 잘려진 덩어리 내에서는 더하기를 하자
////			그리고 그것을 계산하자
////			주의! 첫번째 숫자는 무조건 양수다!
//		
//		String[] arr = str.split("-");
//		
//		int sum = 0;
//		
//		for (int i=0; i<arr.length; i++) {
//			String[] vArr = arr[i].split("\\+");
//			
//			int val = 0;
//			for (int j=0; j<vArr.length; j++) {
//				val += Integer.parseInt(vArr[j]);
//			}
//			
//			if (i==0) { // 첫번째는 양수다
//				sum = val;
//			} else {
//				sum -= val; // 마이너스 연산자를 기준으로 잘랐으므로 빼기
//			}
//		}
//		
//		System.out.println(sum);
//	}
	
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
