import java.io.*;

public class �����_19_10994 {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in),550000);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out),550000);
		int n = Integer.parseInt(br.readLine());
		arr = new char[4 * n - 3][4 * n - 3];
		
		// init: �� ����..
		for(int i=0; i<4*n-3; i++) {
			for(int j=0;j<4*n-3; j++) {
				arr[i][j] = ' ';
			}
		}
		
		
		star(n, 0, 0);

		for (int i = 0; i < 4 * n - 3; i++) {
			for (int j = 0; j < 4 * n - 3; j++) {
				bw.write(arr[i][j]);
			}
			bw.write("\n");
		}
		bw.flush();
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
				}else {
					
				}
			}
		}
		star(n - 1, x + 2, y + 2);

	}
}
