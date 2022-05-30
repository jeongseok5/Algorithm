import java.io.*;

public class _2740_���_���� {
	
	public static void main(String[] args) throws IOException {
		// init
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N, M, K = 0;

		// ù��° ���
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		String[][] first_mat = new String[N][M];
		for (int i = 0; i < N; i++) {
			first_mat[i] = br.readLine().split(" ");
		}

		// �ι�° ���
		s = br.readLine().split(" ");
		K = Integer.parseInt(s[1]);
		String[][] second_mat = new String[M][K];
		for (int i = 0; i < M; i++) {
			second_mat[i] = br.readLine().split(" ");
		}

		// ��� ���
		String ans ="";
		for (int i = 0; i < N; i++) { // ith row
			for (int j = 0; j < K; j++) { // jth col
				int sum = 0;
				for (int k = 0; k < M; k++) { // k��° ����
					sum += Integer.parseInt(first_mat[i][k]) * Integer.parseInt(second_mat[k][j]);
				}
				// ù��° ��� i�� �ι��� ��� j�� ������ ������ ans�� ���� 
				ans += Integer.toString(sum)+" ";
			}
			// ù��° ��� i�� ������ ��� ������ �ٹٲ�
			ans = ans.trim();
			ans += "\n";

		}
		System.out.println(ans);
	}

}
