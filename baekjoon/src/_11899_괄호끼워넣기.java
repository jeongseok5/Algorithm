import java.io.*;

public class ��ȣ�����ֱ�_11899 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// init
		char[] arr = br.readLine().toCharArray();
		int cnt = 0, answer = 0;

		// �迭 Ž��
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
		// cnt�� ����̸� ��ȣ�� ���ڶ� ������ �ȴ�.
		if (cnt > 0) {
			answer += cnt;
		}

		System.out.println(answer);
		br.close();
	}
}
