package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	// 11399 ATM
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 인원 수 
		
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = scan.nextInt(); // 걸리는 시간
		}
		
		// 필요한 시간의 합의 최솟값을 구하라
		// 걸리는 시간이 적은 순으로 정렬한다.
		// 한명씩 걸리는 시간을 구한다.
		// 그 합을 구하고 출력한다.

		Arrays.sort(arr);
		
		int pre = 0;
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			// 내 앞 모두 + 나 자신 이게 쌓임
			pre += arr[i]; // 내 앞 순서 값들 축적
			sum += pre;  // 순서마다 쌓이기
		}
		
		System.out.println(sum);
	}
}
