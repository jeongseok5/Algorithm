import java.util.*;

public class ķ��_4796 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String results = ""; 
		while (true) {
			String[] in = scnr.nextLine().split(" ");
			int l = Integer.parseInt(in[0]);
			int p = Integer.parseInt(in[1]);
			int v = Integer.parseInt(in[2]);
			int res = 0;

			if (l == 0 && p == 0 && v == 0)
				break;

			// �ް��ϼ� v��,  �����ϴ� p���� l�� ���� ��밡���ϹǷ�
			// l���� v/p�� ķ������ ����� �� �ִ�.
			res += (l * (v / p));
			// v/p�� ķ������ �ٳ�� �� ���� �Ⱓ �� 
			// �̿� �����ϼ� ���� �Ǵ� �����ϼ�  v%p�� �� �� �ּҰ��� ������� �����ش�. 
			res += (v % p > l ? l : v%p);
			results += res+" ";
			
			
		}
		String[] result = results.split(" ");
		for(int i=0;i<result.length;i++) {
			System.out.println("Case "+(i+1) +": " + result[i]);
		}
	}
}
