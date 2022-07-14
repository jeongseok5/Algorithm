import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2503_숫자야구 {
	static List<BaseBall> list = new ArrayList<>();
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		String[][] arr = new String[N][];

		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(" ");
			//
			int num = Integer.parseInt(arr[i][0]);
			int strk = Integer.parseInt(arr[i][1]);
			int ball = Integer.parseInt(arr[i][2]);

			BaseBall BaseBall = new BaseBall(num, strk, ball);
			list.add(BaseBall);
		}
		System.out.println(findOut());

	}

	static int findOut() {
		int Ans = 0;
		// 123 ~ 987에 대해
		// 숫자가 중복되는 경우: 255 등
		// 또는 0이 있는 경우: 509 등 은 제외해준다.
		for (int i = 123; i <= 987; i++) {
			if (removeDup(i) != true)
				continue;

			int pass = 0;
			// 한 줄
			for (int j = 0; j < N; j++) {
				int strkCount = 0;
				int ballCount = 0;

				BaseBall current = list.get(j);
				String currentData = Integer.toString(current.num);
				String iData = Integer.toString(i);

				// strike 개수 비교: 위치가 동일하고 값이 같으면 스트라이크
				for (int k = 0; k < 3; k++) {
					if (currentData.charAt(k) == iData.charAt(k))
						strkCount++;
				}
				// ball 개수 비교: 위치가 같지 않은데 값이 같으면 볼
				for (int l = 0; l < 3; l++) {
					for (int m = 0; m < 3; m++) {
						if (currentData.charAt(l) == iData.charAt(m)) {
							if (l != m)
								ballCount++;
						}
					}
				}
				if (current.strk == strkCount && current.ball == ballCount) {
					pass++;
				}
			}
			// 123 356 327 489 모든 조건이 and로 맞아야 정답으로 생각하는 것.
			if (pass == N) {
				Ans++;
			}

		}

		return Ans;
	}

	static boolean removeDup(int num) {
		String numS = Integer.toString(num);
		if (numS.charAt(0) == '0' || numS.charAt(1) == '0' || numS.charAt(2) == '0') {
			return false;
		}

		if (numS.charAt(0) == numS.charAt(1)) {
			return false;
		}
		if (numS.charAt(1) == numS.charAt(2)) {
			return false;
		}
		if (numS.charAt(0) == numS.charAt(2)) {
			return false;
		}

		return true;
	}

	static class BaseBall {
		int num;
		int strk;
		int ball;

		public BaseBall(int num, int strk, int ball) {
			this.num = num;
			this.strk = strk;
			this.ball = ball;
		}
	}

}
