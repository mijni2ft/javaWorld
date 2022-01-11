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
		
		// �������� ������ �Ʒ��� ���������Ѵٸ�.. ������ y�� ���� �ʿ��ϴ�
		// �ֳ�? x�� ���� 1�� �����ϰ� y�� ���� ���� ������ �����Ǿ�� �ϴϱ�
		// �� ���� y���� now_y ��� ����
		
		int now_y = 1; // 2,2 �� �Ź����ε�.. index ����̴ϱ� �ϳ� ���� 1����
		boolean isEnd = false; // ���̸� ã�Ҵ��� ����
		
		for (int i=1; i<10; i++) { // 2,2 �� �Ź����ε�.. index ����̴ϱ� �ϳ� ���� 1����
			for (int j=now_y; j<10; j++) {
				if (arr[i][j] == 0) { // ���� �����ִ�? �ϴ� ĥ��
					arr[i][j] = 9;
					now_y = j; // �ϴ� ���� y���� ��ȿ�ϴϱ� ����~
					continue; // ��� ���������� �����ڰ�
				} else if (arr[i][j] == 1) { // �����ִ�?
					break; // �Ʒ��� ���������ϴ� y�� �̵��� �׸�����
				} else { // ���̹߰�
					arr[i][j] = 9;
					isEnd = true;
					break;
				}
			}
			
			if (isEnd) break; // ���̸� ã�Ҵٸ� ����
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
//		int h = Integer.parseInt(sArr[0]); // ����
//		int w = Integer.parseInt(sArr[1]); // ����
//		
//		int[][] arr = new int[h][w];
//		
//		int n = scan.nextInt();
//		
//		for (int k=0; k<n; k++) {
//			int len = scan.nextInt(); // ���� ����
//			int d = scan.nextInt(); // ���� (0:����, 1:����)
//			int x = scan.nextInt()-1; // int[][] �� index�ϱ� 1����
//			int y = scan.nextInt()-1;
//			
//			for (int i=0; i<len; i++) { // ������̸�ŭ
//				if(d == 0) { // ���η�
//					arr[x][y+i] = 1;
//				} else { // ���η�
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