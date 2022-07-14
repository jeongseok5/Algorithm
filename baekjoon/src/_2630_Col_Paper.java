import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// ���� 2630��
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
		
		int newSize = size/2; // ����
		// ��� �Ͼ������ Ȯ��
		divide(row, col, newSize); // 2��и�
		divide(row, col+newSize, newSize); // 3��и�
		divide(row+newSize, col, newSize); // 1��и�
		divide(row+newSize, col+newSize, newSize); // 4��и�
	}

	private static boolean checkColor(int row , int col, int size) {
		int color = board[row][col]; // ù ��° ���Ҹ� �������� �˻�
		for (int i = row; i < row+size; i++) {
			for (int j = col; j < col+size; j++) {
				if (board[i][j] != color) 
					return false;
			}
		}
		// ��� ��ġ�ϸ� true ����
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