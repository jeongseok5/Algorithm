import java.io.*;

public class 별_16505 {
	static char[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int arrSize;
		if (n == 0) {
			arrSize = 1;
		} else if (n == 1) {
			arrSize = 2;
		} else {
			arrSize = (int) Math.pow(2, n);
		}

		// 행이 n^2인 배열을 먼저 생성
		arr = new char[arrSize][];
		// 0행은 크기가 n^2, 1행은 n^2-1...인 비정방 배열 생성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new char[8 - i];
		}

		star(0, 0, n, false);

		for (int i = 0; i < arrSize; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();

	}

	private static void star(int x, int y, int n, boolean blank) {
		if (n == 0) {
			arr[x][y] = '*';
			return;
		} else if (n == 1) {
			arr[x][y] = '*';
			arr[x + 1][y] = '*';
			arr[x][y + 1] = '*';

		}
		// 가로세로 2등분을 한 4사분면
		// size
		int size;
		if(n==2) {
			size = n/2;
		}else {
			size = (int) Math.pow(2, n) / 2;
		}
		for (int i = x; i < x + Math.pow(n, 2); i += size) {
			for (int j = y; j < y + Math.pow(n, 2); j += size) {
				star(i, j, size, false);
			}
		}
	}

}
