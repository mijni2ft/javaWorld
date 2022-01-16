package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class baekjoon_001 {
	
	// 2217 ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // ������ ����
		
		int[] arr = new int[n]; // �� ������ �� �� �ִ� �߷���
		
		for (int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		
		// k���� ������ ����Ͽ� �߷��� w�� ��ü�� ���ø� ��,
		// ������ �������� ��� ���� w/k ��ŭ�� �߷��� �ɸ��� �ȴ�.
		
		// ���ø� �� �ִ� �ִ� �߷��� ���ض�.
		// ��� ������ ����� �ʿ�� ����.
		
		Arrays.sort(arr); // 1. �߷��� ���� ������ ����
		
		int max = 0; // �ִ�� �� �� �ִ� �߷�
		
		for (int i=0; i<n; i++) {
			// �߷��� ���� ������ ���ĵǾ��� ������ �ڿ�
			// i���� �ڿ� �ִ� �߷��� ��� arr[i] �� �߷���ŭ�� ���ø� �� �ִ�.
			// �׷��� ���� ���ø� �� �ִ� �߷� = arr[i]��
			// �ڿ� ���� ������ ������ ���ϸ�, �װ� �ִ�� ���ø� �� �ִ� �߷��̵ȴ�.
			int now = arr[i]*(n-i);
			
			if (max < now) {
				max = now;
			}
		}
		
		System.out.println(max);
		
		// 7, 10, 12     -> 21 (7,10,12 ��� ����Ͽ� 7*3 = 21)
		// 5, 10, 15, 16 -> 30 (10,15,16 �Ǵ� 15,16) 
		// 5, 12, 15, 16 -> 36 (12,15,16 ����Ͽ� 12*3 :: 5*4���� 12*3�� �� ũ�ٴ°� �ٽ�)
		
	}
	
//	// 1541 �Ҿ���� ��ȣ
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
//		
//		// ���� ���� �ּҷ� ������
//		
////			10-20+40-90+70+80-60
////			10-(20+40)-(90+70+80)-60
////	 		��, ���̳ʽ� ������ �ڿ��� ���ڰ� Ŭ ���� ���� ��� ���� �۾�����.
////			���̳ʽ� �������� �ڸ���, �߷��� ��� �������� ���ϱ⸦ ����
////			�׸��� �װ��� �������
////			����! ù��° ���ڴ� ������ �����!
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
//			if (i==0) { // ù��°�� �����
//				sum = val;
//			} else {
//				sum -= val; // ���̳ʽ� �����ڸ� �������� �߶����Ƿ� ����
//			}
//		}
//		
//		System.out.println(sum);
//	}
	
//	// 11399 ATM
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt(); // �ο� �� 
//		
//		int[] arr = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			arr[i] = scan.nextInt(); // �ɸ��� �ð�
//		}
//		
//		// �ʿ��� �ð��� ���� �ּڰ��� ���϶�
//		// �ɸ��� �ð��� ���� ������ �����Ѵ�.
//		// �Ѹ� �ɸ��� �ð��� ���Ѵ�.
//		// �� ���� ���ϰ� ����Ѵ�.
//
//		Arrays.sort(arr);
//		
//		int pre = 0;
//		int sum = 0;
//		
//		for (int i=0; i<n; i++) {
//			// �� �� ��� + �� �ڽ� �̰� ����
//			pre += arr[i]; // �� �� ���� ���� ����
//			sum += pre;  // �������� ���̱�
//		}
//		
//		System.out.println(sum);
//	}
	
//	// 11047 ����
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int k = scan.nextInt(); // ��ǥ �ݾ�
//		
//		int[] arr = new int[n];
//		
//		for (int i=0; i<n; i++) {
//			arr[i] = scan.nextInt(); // ���� ����
//		}
//		
//		// �ּ� ���� ������ ���ض�
//		// ū �ݾ׺��� �ɷη� �ϸ����
//		
//		int cnt = 0;
//		
//		for (int i=n-1; i>=0; i--) { // ����! �ڿ�����!
//			int s = k/arr[i]; // ��
//			
//			if (s > 0) { // �� ���������ٸ�!
//				cnt += s; // ���� ������ �ø���
//				k -= arr[i]*s; // ���� �ݾ��� ����
//			}
//		}
//		
//		System.out.println(cnt);
//	}
	
//	// 1931 ȸ�ǽ� ���� / 1208ms / ����
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		int[][] arr = new int[n][2];
//		
//		for (int i=0; i<n; i++) {
//			arr[i][0] = scan.nextInt(); // ���۽ð�
//			arr[i][1] = scan.nextInt(); // �����½ð�
//		}
//		
//		// ���� ���� ������ ������ ����.
//		// �� �����ð����� ���� ����� ���� ������ ����.
//		// �ݺ��Ѵ�.
//		// ��, ������ �ð��� ���� ���, ���۽ð��� ������ ���� �켱���� �д�.
//		
//		Arrays.sort(arr, new Comparator<int[]>() {
//			@Override
//			public int compare(int[] a, int[] b) {
//				
//				if(a[1] == b[1]) { // ���� ������ �ð��� ���ٸ�
//					return a[0]-b[0]; // ���۽ð��� ���� ������ ����
//				}
//				
//				return a[1]-b[1]; // �����½ð��� ���� ������ ����
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
		
//		// 1931 ȸ�ǽ� ���� / ù��° ����
//		public static void main(String[] args) {
//			Scanner scan = new Scanner(System.in);
//			int n = scan.nextInt();
//			
//			int[][] arr = new int[n][2];
//			
//			for (int i=0; i<n; i++) {
//				arr[i][0] = scan.nextInt(); // ���۽ð�
//				arr[i][1] = scan.nextInt(); // �����½ð�
//			}
//			
//			int cnt = 0; // ȸ�� Ƚ��
//			int last_time = 0; // �׷��� �������� ����ε�
//			int end_time = 100000; // ���廡�� ������ �����ð�
//			int now_time = 0; // ����ð�
//			
//			for (int j=0; j<n; j++) {
//				if (end_time >= arr[j][1]) { // ���� ���� ������ �����ð�
//					end_time = arr[j][1];	
//				}
//				
//				if (last_time <= arr[j][1]) { // �׷��� �������� ��þ�
//					last_time = arr[j][1];
//				}
//			}
//			
//			if (end_time != 100000) { // ������ ȸ�� �ϳ� �� (4�ÿ� ����)
//				cnt++; // ȸ�� Ƚ�� �ø���
//				now_time = end_time; // ȸ�� �ϳ� ������ �ð��帧
//				end_time = 0; // �ٽ� ����ְ�
//			}
//			
//			for (int j=0; j<n; j++) {
//				if (now_time == arr[j][0]) { // ���۽ð��� �����̶� ����? �ְ� ȿ���̴�
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // ���� �־� �ʰ� 1���� or �� ���������� ȸ�� ����
//					}
//				} else if (now_time < arr[j][0]) { // ���� �����������..�׷��� �� �� �ִ� ȸ�Ǵ�
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // ���� �־� �ʰ� 1���� or �� ���������� ȸ�� ����
//					}				
//				}
//			}
//			
//			if (end_time != 0) {
//				cnt++;
//				now_time = end_time; // ȸ�� �ϳ� ������ �ð��帧
//				end_time = 0;
//			}
//			
//			boolean isEnd = false;
//			
//			for (int j=0; j<n; j++) {
//				if (now_time == arr[j][0]) { // ���۽ð��� �����̶� ����? �ְ� ȿ���̴�
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // ���� �־� �ʰ� 1���� or �� ���������� ȸ�� ����
//					}
//				} else if (now_time < arr[j][0]) { // ���� �����������..�׷��� �� �� �ִ� ȸ�Ǵ�
//					if (end_time == 0 || end_time > arr[j][1]) {
//						end_time = arr[j][1]; // ���� �־� �ʰ� 1���� or �� ���������� ȸ�� ����
//					}				
//				}
//				
//				if (j == n-1 && now_time == last_time) { // ������ ���̰� �ð��� ������ �ߴٸ�
//					isEnd = true;
//				}
//			}
//		}
	
//	// 2839 ���� ��� / 220ms
//	public static void main(String[] args) {
//		
//		// ������ �ּ� ���� ��� (3Ű��, 5Ű��)
//		// ��Ȯ�ϰ� nų�α׷��� ���� �� ���ٸ� -1�� ���
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
//		} else if (r==1 && b5>=1) { // 1���� ���Ҵ�? 5Ű��¥���� �ּ�1���� �ʿ���
//			// �ϳ� Ǯ�� 3���� 2�� ����
//			cnt = b5 -1 + 2;
//		} else if (r==2 && b5>=2) { // 2�� ����. 5Ű�ΰ� �ּ� 2���ʿ�
//			// 2��Ǯ�� 3Ű�η� 3�� ����
//			cnt = b5 - 2 + 4;
//		} else if (r==3) { // ��˲�
//			cnt = b5 + 1;
//		} else if (r==4 && b5>= 1){ // 4�� ����. �ּ� 1�� �ʿ�
//			// �Ѱ� Ǯ�� 3���� ����
//			cnt = b5 - 1 + 3;
//		} else {
//			cnt = -1;
//		}
//		
//		System.out.print(cnt);
//	}
	
//	// 2839 ���� ��� / 204ms
//	public static void main(String[] args) {
//		
//		// ������ �ּ� ���� ��� (3Ű��, 5Ű��)
//		// ��Ȯ�ϰ� nų�α׷��� ���� �� ���ٸ� -1�� ���
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
//		 * 0 >> ��
//		 * */
//		
//		
//		int _�� = n/5;
//		if (_��> 0) { // 5�� ��������
//			cnt += _��; // ���� �� �ø���
//			n -= _��*5;
//		}
//		
//		if (n <= 0) {
////			System.out.print(cnt);
//		} else if (0<n && n<=1) {
//			if (cnt < 1) { // 5Ű�θ��� 3Ű�η� �ؾ��ϴµ� 5ų�ε� ������ �Ұ�
//				cnt = -1;
////				System.out.print(cnt);	
//			} else {
//				cnt -= 1; // 5Ű�θ� �ϳ� Ǯ��
//				cnt += 2; // 3Ű�� ¥�� 2���� �߰�
//			}
//		} else if (1<n && n<=2) {
//			if (cnt < 2) { // 5Ű��¥���� �ּ� 2�� �ʿ�
//				cnt = -1;
//			} else {
//				cnt -= 2; // 5Ű�θ� 2��Ǯ��
//				cnt += 4; // �׷� ������ 12Ű�δϱ� 3Ű�� ¥�� 4���� �߰�
//			}
//		} else if (2<n && n<=3) {
//			cnt++;
//		} else {
//			if (cnt < 1) { // 5Ű�ΰ� �ּ� 1�� �ʿ�
//				cnt = -1;
//			} else {
//				cnt -= 1; // 5Ű�θ� �ϳ� Ǯ��
//				cnt += 3; // Ǯ���ִ°� 9Ű�δϱ� 3Ű�� ¥�� 3���� �߰�
//			}
//		}
//		
//		System.out.print(cnt);
//		
//		
//		/*
//		 * �ϴ� ���� 5�� ����
//		 * ���� 0���� Ŀ? �׷� ���� ���� ��ŭ �ø���, �ʿ��� ���Կ��� �� ����ŭ ��
//		 * ���� 0���� �۾�? �׷� 3���� ����. �ٵ� �� 0���� �۾�? -1 ���
//		 * 							 0���� Ŀ? �׷� ���� ���� ��ŭ �ø���, �ʿ��� ���Կ��� �� ����ŭ ��
//		 * */
//		
//		
//	}

}
