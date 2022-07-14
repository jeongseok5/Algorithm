import java.util.Scanner;

public class _22940_�������������� {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int n = scnr.nextInt();
		scnr.nextLine();

		// ������������ ������� ������ ���
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
			// i�� i�� ����� 1�� ����
			float divider = mat[i][i];
			for (int j = 0; j < n + 1; j++) {
				// i��° �� ��ü�� i��° ����� ������.
				mat[i][j] = mat[i][j] / divider;
			}

			// k = i�� ������ ��, ����������� i�� ����� 0���� ����
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

		// �� ������ ����� ��������� �ǹǷ� �������� �캯�� ���
		String ans = " ";
		for (int i = 0; i < n; i++) {
			ans += Math.round(mat[i][n]) + " ";
		}
		System.out.println(ans.trim());
	}

}
