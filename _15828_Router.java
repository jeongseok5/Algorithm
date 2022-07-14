import java.util.Scanner;

public class _15828_Router {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int size = 0, add = 0, delete = 0;

		int packet;

		while ((packet = sc.nextInt()) != -1) {
			int idx = add % N;
			if (packet == 0) {
				size -= 1;
				delete = (delete + 1) % N;
			} else {
				if (size < N) {
					arr[idx] = packet;
					add = (add + 1) % N;
					size += 1;
				} else {
					continue;
				}
			}
		}
		// size 만큼 arr 돌면서 출력
		if (size == 0) {
			System.out.println("empty");

		} else if (size > 0) {
			for (int i = delete; i < delete + size; i++) {
				System.out.print(arr[i % N]);
				if (i != delete + size)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}