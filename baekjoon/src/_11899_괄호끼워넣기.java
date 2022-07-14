import java.io.*;

public class 괄호끼워넣기_11899 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// init
		char[] arr = br.readLine().toCharArray();
		int cnt = 0, answer = 0;

		// 배열 탐색
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '(') {
				cnt += 1;
			} else if (arr[i] == ')') {
				if (cnt == 0) {
					answer += 1;
				} else {
					cnt -= 1;
				}
			}
		}
		// cnt가 양수이면 괄호가 모자란 개수가 된다.
		if (cnt > 0) {
			answer += cnt;
		}

		System.out.println(answer);
		br.close();
	}
}
