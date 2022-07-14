import java.io.*;

public class _4779_ĭ������� {
	static char[] arr;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while ((s = br.readLine()) != null) { // �Է��� ���� �� ����
			int n = Integer.parseInt(s); // n
			int len = (int) Math.pow(3, n); // 3�� n����
			arr = new char[len]; // 3�� n���� �迭����

			// -�� ä���
			for (int i = 0; i < len; i++) {
				arr[i] = '-';
			}

			cantor(0, len);

			for (int i = 0; i < len; i++) {
				bw.write(arr[i]);
			}
			bw.write("\n");
			bw.flush();
		}
	}

	static void cantor(int start, int len) {
		// base
		if (len == 1) {
			return;
		}
		// recur
		for (int i = start + len / 3; i < start + 2 * len / 3; i++) {
			arr[i] = ' ';
		}
		cantor(start, len / 3);
		cantor(start + 2 * len / 3, len / 3);

	}

}
