import java.util.Scanner;

public class _17478_��� {
	static String temp = "";
	static String arr[];

	static void bot(int n) {
		String pre = temp;
		
		if (n == 0) {
			System.out.println(pre + arr[0]);
			System.out.println(pre + arr[4]);
			System.out.println(pre + arr[5]);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println(pre + arr[i]);
		}
		temp += "____";
		bot(n-1);
		
		System.out.println(pre + arr[5]);

	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");

		arr = new String[6];
		arr[0] = "\"����Լ��� ������?\"";
		arr[1] = "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.";
		arr[2] = "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.";
		arr[3] = "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"";
		arr[4] = "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"";
		arr[5] = "��� �亯�Ͽ���.";

		bot(n);
	}
}
