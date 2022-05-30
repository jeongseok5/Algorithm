import java.util.Scanner;
import java.util.Comparator;

public class SortingWords_merge implements Comparator<String>{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] array = new String[N];
		
		// 남아있던 개행 이스케이프코드("\n") 버리기
		scanner.nextLine();
		
		for(int i=0; i<N; i++) { 
			array[i] = scanner.nextLine();
		}
		
		SortingWords_merge.mergeSort(array, 0, N-1);
		
		scanner.close();

		for(int i = 1; i <N; i++) {
			// 중복된다면 한번만 출력
			if(!array[i].equals(array[i-1])) {
				System.out.println(array[i]);
			}
		}

	}
	public static void mergeSort(String[] arr, int p, int r) {
		if(p < r) {
			int q = (p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr, p, q, r);
		}
			
	}
	public static void merge(String[] arr, int p, int q, int r) {
		String[] tmp = new String[arr.length];
		SortingWords_merge  s = new SortingWords_merge ();
		int i = p, j = q+1, t = 1;
		while(i <= q && j <= r) {
			if(s.compare(arr[i], arr[j]) < 0) {
				tmp[t++] = arr[i++];
			}else {
				tmp[t++] = arr[j++];
			}
		}
		while(i<= q) {
			tmp[t++] = arr[i++];
		}
		while(j<= r) {
			tmp[t++] = arr[j++];
		}
		
		i = p; t = 0;
		while(t <= r) {
			arr[i++] = tmp[t++];
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
	
	
//	static Comparator<String> comp = new Comparator<String>() {
//		
//		@Override
//		public int compare(String s1, String s2) {
//			// 길이가 같다면
//			if (s1.length() == s2.length()) {
//				return s1.compareTo(s2);
//			}
//			else {
//			return s1.length() - s2.length();
//			}
//		}
//	};
	


}
