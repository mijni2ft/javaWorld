package codeup;

import java.util.Scanner;
public class Main {
	
	// 1046
	public static void main(String[] args) {
		// �������� ���е� ���� 3���� �Է¹ް�
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		
		int a = Integer.valueOf(arr[0]);
		int b = Integer.valueOf(arr[1]);
		int c = Integer.valueOf(arr[2]);
		
		int sum = a+b+c;
		System.out.println(sum); // ��
		System.out.printf("%.1f", (float)sum/3); // ���� ���� ������� ���
	}

}