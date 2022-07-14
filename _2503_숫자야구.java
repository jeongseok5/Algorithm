import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _2503_���ھ߱� {
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
		// 123 ~ 987�� ����
		// ���ڰ� �ߺ��Ǵ� ���: 255 ��
		// �Ǵ� 0�� �ִ� ���: 509 �� �� �������ش�.
		for (int i = 123; i <= 987; i++) {
			if (removeDup(i) != true)
				continue;

			int pass = 0;
			// �� ��
			for (int j = 0; j < N; j++) {
				int strkCount = 0;
				int ballCount = 0;

				BaseBall current = list.get(j);
				String currentData = Integer.toString(current.num);
				String iData = Integer.toString(i);

				// strike ���� ��: ��ġ�� �����ϰ� ���� ������ ��Ʈ����ũ
				for (int k = 0; k < 3; k++) {
					if (currentData.charAt(k) == iData.charAt(k))
						strkCount++;
				}
				// ball ���� ��: ��ġ�� ���� ������ ���� ������ ��
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
			// 123 356 327 489 ��� ������ and�� �¾ƾ� �������� �����ϴ� ��.
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
