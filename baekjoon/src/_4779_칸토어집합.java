import java.io.*;

public class _4779_칸토어집합 {
	static char[] arr;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s;
		while ((s = br.readLine()) != null) { // 입력이 없을 때 까지
			int n = Integer.parseInt(s); // n
			int len = (int) Math.pow(3, n); // 3의 n제곱
			arr = new char[len]; // 3의 n제곱 배열생성

			// -로 채우기
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
