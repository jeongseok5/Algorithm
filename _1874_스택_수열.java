import java.io.*;

public class _1874_스택_수열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());

		int[] stack = new int[N];

		//
		int index = 0;
		// 어디까지 입력받았는지 보는 변수
		int start = 0;

		// N 번 반복
		while (N-- > 0) {
			int value = Integer.parseInt(br.readLine());

			if (value > start) {
				// start + 1부터 입력받은 value 까지 push를 한다.
				for (int i = start + 1; i <= value; i++) {
					stack[index] = i;
					index++;
					sb.append('+').append('\n');
				}
				// 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
				start = value;
			}

			// top에 있는 원소가 입력받은 값과 같지 않은 경우
			else if (stack[index - 1] != value) {
				System.out.println("NO");
				return;
			}

			index--;
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}

}
