import java.util.Scanner;
import java.util.Comparator;

public class SortingWords_bubble implements Comparator<String>{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N; // 입력크기
		while(true) {
			int s = scanner.nextInt();
			if(s>=1 && s<=20000) {
				N = s;
				break;
			}
		}

		String[] array = new String[N];
		
		// 남아있던 개행 이스케이프코드("\n") 버리기
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
			// 중복된다면 한번만 출력
			if(!array[i].equals(array[i-1])) {
				System.out.println(array[i]);
			}
		}
		
	}
	// 버블 정렬
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
		// 길이가 같다면
		if (s1.length() == s2.length()) {
			return s1.compareTo(s2);
		}
		else {
		return s1.length() - s2.length();
		}
	}
	
}
