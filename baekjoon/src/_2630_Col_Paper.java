import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 백준 2630번
public class _2630_Col_Paper {
	public static int white = 0;
	public static int blue  = 0;
	public static int[][] board;

	public static void divide(int row, int col, int size) {
		
		if(checkColor(row, col, size)) {
			if(board[row][col]==0) {
				white++;
			}else {
				blue++;
			}
			return;
		}
		
		int newSize = size/2; // 절반
		// 모두 하얀색임을 확인
		divide(row, col, newSize); // 2사분면
		divide(row, col+newSize, newSize); // 3사분면
		divide(row+newSize, col, newSize); // 1사분면
		divide(row+newSize, col+newSize, newSize); // 4사분면
	}

	private static boolean checkColor(int row , int col, int size) {
		int color = board[row][col]; // 첫 번째 원소를 기준으로 검사
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if (board[i][j] != color) 
					return false;
			}
		}
		// 모두 일치하면 true 리턴
		return true;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		divide(0, 0, n);
		
		System.out.println(white);
		System.out.println(blue);

	}
}