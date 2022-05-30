import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2164_ī��2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] queue = new int[N];
		// 0���� 1, ..., N-1���� N ����
		for (int i = 0; i < N; i++) {
			queue[i] = i + 1;
		}
		int first_index = 0;
		int last_index = N - 1;

		// N�� 1�̵Ǹ� �ϳ��� ī�常 ���´�
		while (N-- > 1) {
			first_index = (first_index + 1) % queue.length;
			queue[(last_index + 1) % queue.length] = queue[first_index];
			first_index = (first_index + 1) % queue.length;
			last_index = (last_index + 1) % queue.length;
			
		}

		System.out.println(queue[first_index]);
	}

}
