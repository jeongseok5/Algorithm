import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
 
		int sum = Integer.MAX_VALUE;	// �ʱ� ���� ���� Ȯ���� ���� ������ ���� 
		String[] subtraction = in.nextLine().split("-");
		
 
		for(int i = 0; i < subtraction.length; i++) {
			int temp = 0;
 
			// �������� ���� ��ū�� �������� �и��Ͽ� �ش� ��ū���� ���Ѵ�.
			String[] addition = subtraction[i].split("\\+");
			
			// �������� ���� ��ū���� ��� ���Ѵ�. 
			for(int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}
			
			// ù ��°��ū�� ��� temp���� ù ��° ���� ��
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
 
}