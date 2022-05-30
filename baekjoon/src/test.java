import java.io.*;
import java.util.Scanner;

public class test {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new char[4 * n - 3][4 * n - 3];
		
		for(int i=0; i<4*n-3; i++) {
			for(int j=0;j<4*n-3; j++) {
				arr[i][j] = ' ';
			}
		}
		
		
		
		star(n, 0, 0);

		for (int i = 0; i < 4 * n - 3; i++) {
			for (int j = 0; j < 4 * n - 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	static void star(int n, int x, int y) {
		// base
		if (n == 1) {
			arr[x][y] = '*';
			return;
		}

		// recur: ���� ���׵θ��� �� ǥ��
		for (int i = 0; i < 4 * n - 3; i++) {
			for (int j = 0; j < 4 * n - 3; j++) {
				// ó�� ��, ������ ��, ó�� ��, ������ ���̸� ä��
				if (i == 0 || i == 4 * n - 4 || j == 0 || j == 4 * n - 4) {
					arr[x + i][y + j] = '*';
				}
			}
		}
		star(n - 1, x + 2, y + 2);

	}
}
