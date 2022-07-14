import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1065_한수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		int N = Integer.parseInt(br.readLine());

		// 111도 등차수열이다.
		for (int i = 1; i <= N; i++) {
			if (i < 100) {
				ans += 1;
				continue;
			} else if (i == 1000) {
				continue;
			} else {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				// 중복된 숫자가 없더라도 등차가 아닌 경우
				if (hun - ten != ten - one) {
					continue;
				}
				ans += 1;
			}
		}
		System.out.println(ans);
	}
}
