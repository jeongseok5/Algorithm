import java.io.*;

public class _11729_하노이탑 {

	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void hanoi(int n, int start, int via, int des) throws IOException {
		// n개의 원판
		// 시작은 1 도착은 3 경유는 2
		if (n == 1) {
			bw.write(start + " " + des + "\n");
		} else {
			hanoi(n - 1, start, des, via);
			bw.write(start + " " + des + "\n");
			hanoi(n - 1, via, start, des);
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println((int) Math.pow(2, n) - 1);
		hanoi(n, 1, 2, 3);
		bw.flush();
		bw.close();

	}

}
