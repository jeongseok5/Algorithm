import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SortingWords{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] array = new String[N];
		
		// �����ִ� ���� �̽��������ڵ�("\n") ������
		scanner.nextLine();
		
		for(int i=0; i<N; i++) { 
			array[i] = scanner.nextLine();
		}
		
		Arrays.sort(array, comp);
		
		scanner.close();
		
		System.out.println(array[0]);
		for(int i = 1; i <N; i++) {
			// �ߺ��ȴٸ� �ѹ��� ���
			if(!array[i].equals(array[i-1])) {
				System.out.println(array[i]);
			}
		}

	}
	
	static Comparator<String> comp = new Comparator<String>() {
		
		@Override
		public int compare(String s1, String s2) {
			// ���̰� ���ٸ�
			if (s1.length() == s2.length()) {
				return s1.compareTo(s2);
			}
			else {
			return s1.length() - s2.length();
			}
		}
	};
	
}
