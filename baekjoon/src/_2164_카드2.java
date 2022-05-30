import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2164_카드2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] queue = new int[N];
		// 0에는 1, ..., N-1에는 N 저장
		for (int i = 0; i < N; i++) {
			queue[i] = i + 1;
		}
		int first_index = 0;
		int last_index = N - 1;

		// N이 1이되면 하나의 카드만 남는다
		while (N-- > 1) {
			first_index = (first_index + 1) % queue.length;
			queue[(last_index + 1) % queue.length] = queue[first_index];
			first_index = (first_index + 1) % queue.length;
			last_index = (last_index + 1) % queue.length;
			
		}

		System.out.println(queue[first_index]);
	}

}
