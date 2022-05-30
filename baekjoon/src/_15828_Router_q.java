import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _15828_Router_q {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		int packet = 0;
		while (packet != -1) {
			packet = Integer.parseInt(br.readLine());
			if (packet == 0) {
				q.poll();
			} else if (packet > 0 && q.size() < n) {
				q.offer(packet);
			}
		}
		if (q.isEmpty()) {
			System.out.println("empty");
		} else {
			while (!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
		}

	}

}
