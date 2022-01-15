package baekjoon;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	// 11399 ATM
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // �ο� �� 
		
		int[] arr = new int[n];
		
		for (int i=0; i<n; i++) {
			arr[i] = scan.nextInt(); // �ɸ��� �ð�
		}
		
		// �ʿ��� �ð��� ���� �ּڰ��� ���϶�
		// �ɸ��� �ð��� ���� ������ �����Ѵ�.
		// �Ѹ� �ɸ��� �ð��� ���Ѵ�.
		// �� ���� ���ϰ� ����Ѵ�.

		Arrays.sort(arr);
		
		int pre = 0;
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			// �� �� ��� + �� �ڽ� �̰� ����
			pre += arr[i]; // �� �� ���� ���� ����
			sum += pre;  // �������� ���̱�
		}
		
		System.out.println(sum);
	}
}
