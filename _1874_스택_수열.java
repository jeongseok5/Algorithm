import java.io.*;

public class _1874_����_���� {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());

		int[] stack = new int[N];

		//
		int index = 0;
		// ������ �Է¹޾Ҵ��� ���� ����
		int start = 0;

		// N �� �ݺ�
		while (N-- > 0) {
			int value = Integer.parseInt(br.readLine());

			if (value > start) {
				// start + 1���� �Է¹��� value ���� push�� �Ѵ�.
				for (int i = start + 1; i <= value; i++) {
					stack[index] = i;
					index++;
					sb.append('+').append('\n');
				}
				// ���� push �� ���� ���������� �����ϱ� ���� ���� �ʱ�ȭ
				start = value;
			}

			// top�� �ִ� ���Ұ� �Է¹��� ���� ���� ���� ���
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
