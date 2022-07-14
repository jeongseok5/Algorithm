import java.util.Scanner;

public class _22940_선형연립방정식 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int n = scnr.nextInt();
		scnr.nextLine();

		// 연립방정식의 계수들을 저장할 행렬
		float[][] mat = new float[n][n + 1];
		String[][] temp = new String[n][n + 1];

		for (int i = 0; i < n; i++) {
			temp[i] = scnr.nextLine().split(" ");
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n + 1; j++) {
				mat[i][j] = Float.parseFloat(temp[i][j]);
			}
		}

		for (int i = 0; i < n; i++) {
			// i행 i열 계수를 1로 변경
			float divider = mat[i][i];
			for (int j = 0; j < n + 1; j++) {
				// i번째 행 전체를 i번째 계수로 나눈다.
				mat[i][j] = mat[i][j] / divider;
			}

			// k = i를 제외한 행, 나머지행들의 i열 계수를 0으로 변경
			for (int k = 0; k < n; k++) {
				float multiple = mat[k][i] / mat[i][i];
				for (int j = 0; j < n + 1; j++) {
					if (k != i) {
						mat[k][j] = mat[k][j] - mat[i][j] * multiple;
					}
				}
			}
//			for (int l = 0; l < n; l++) {
//				for (int m = 0; m < n + 1; m++) {
//					System.out.print(mat[l][m] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
		}

		// 다 끝나면 행렬은 단위행렬이 되므로 방정식의 우변을 출력
		String ans = " ";
		for (int i = 0; i < n; i++) {
			ans += Math.round(mat[i][n]) + " ";
		}
		System.out.println(ans.trim());
	}

}
