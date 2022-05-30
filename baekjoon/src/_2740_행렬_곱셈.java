import java.io.*;

public class _2740_행렬_곱셈 {
	
	public static void main(String[] args) throws IOException {
		// init
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N, M, K = 0;

		// 첫번째 행렬
		String[] s = br.readLine().split(" ");
		N = Integer.parseInt(s[0]);
		M = Integer.parseInt(s[1]);
		String[][] first_mat = new String[N][M];
		for (int i = 0; i < N; i++) {
			first_mat[i] = br.readLine().split(" ");
		}

		// 두번째 행렬
		s = br.readLine().split(" ");
		K = Integer.parseInt(s[1]);
		String[][] second_mat = new String[M][K];
		for (int i = 0; i < M; i++) {
			second_mat[i] = br.readLine().split(" ");
		}

		// 행렬 계산
		String ans ="";
		for (int i = 0; i < N; i++) { // ith row
			for (int j = 0; j < K; j++) { // jth col
				int sum = 0;
				for (int k = 0; k < M; k++) { // k번째 원소
					sum += Integer.parseInt(first_mat[i][k]) * Integer.parseInt(second_mat[k][j]);
				}
				// 첫번째 행렬 i행 두번재 행렬 j열 연산이 끝나면 ans에 저장 
				ans += Integer.toString(sum)+" ";
			}
			// 첫번째 행렬 i행 연산이 모두 끝나면 줄바꿈
			ans = ans.trim();
			ans += "\n";

		}
		System.out.println(ans);
	}

}
