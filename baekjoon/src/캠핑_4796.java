import java.util.*;

public class 캠핑_4796 {

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

			// 휴가일수 v일,  연속하는 p일중 l일 동안 사용가능하므로
			// l일을 v/p번 캠핑장을 사용할 수 있다.
			res += (l * (v / p));
			// v/p번 캠핑장을 다녀온 후 남는 기간 중 
			// 이용 가능일수 ㅣ일 또는 남은일수  v%p일 둘 중 최소값을 결과값에 더해준다. 
			res += (v % p > l ? l : v%p);
			results += res+" ";
			
			
		}
		String[] result = results.split(" ");
		for(int i=0;i<result.length;i++) {
			System.out.println("Case "+(i+1) +": " + result[i]);
		}
	}
}
