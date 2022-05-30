import java.util.Scanner;
import java.util.Comparator;

public class SortingWords_bubble implements Comparator<String>{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N; // �Է�ũ��
		while(true) {
			int s = scanner.nextInt();
			if(s>=1 && s<=20000) {
				N = s;
				break;
			}
		}

		String[] array = new String[N];
		
		// �����ִ� ���� �̽��������ڵ�("\n") ������
		scanner.nextLine();
		
		for(int i=0; i<N; i++) {
			String tmp = scanner.nextLine();
			if(tmp.length()<=50) {
				array[i] = tmp;
			}
		}
		
		scanner.close();
		
		SortingWords_bubble.bubbleSort(array);
		
		System.out.println(array[0]);
		for(int i = 1; i <N; i++) {
			// �ߺ��ȴٸ� �ѹ��� ���
			if(!array[i].equals(array[i-1])) {
				System.out.println(array[i]);
			}
		}
		
	}
	// ���� ����
	public static void bubbleSort(String[] arr) {
		SortingWords_bubble  s = new SortingWords_bubble ();
		int n = arr.length;
		for(int i = n-1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(s.compare(arr[j], arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
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
	
}
