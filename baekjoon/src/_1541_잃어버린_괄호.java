import java.util.*;

public class _1541_�Ҿ����_��ȣ {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int res = Integer.MAX_VALUE; // 0�� �ȵ�. �ּ�ȭ�ϴ� �����̱⿡ �ִ밪���� �ٿ���������
		
		String[] str = scnr.nextLine().split("-");

		
		for (int i = 0; i < str.length; i++) { // ������ȣ�� �������� ������.
			int innerSum = 0;

			// �������� ���� ��ū�� �������� �и��� ���Ѵ�. meta character�� +�� �̽��������ڵ� ���
			String[] oprands = str[i].split("\\+");

			for (int j = 0; j < oprands.length; j++) {
				innerSum += Integer.parseInt(oprands[j]);
			}

			// ó�� ���� ����̱� ������ �����Ѵ�.
			if (res == Integer.MAX_VALUE) {
				res = innerSum;
			} else {
				res -= innerSum;
			}

		}
		System.out.println(res);
	}

}
