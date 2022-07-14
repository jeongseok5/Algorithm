import java.util.*;

public class _1541_잃어버린_괄호 {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		int res = Integer.MAX_VALUE; // 0은 안됨. 최소화하는 문제이기에 최대값에서 줄여나갸아함
		
		String[] str = scnr.nextLine().split("-");

		
		for (int i = 0; i < str.length; i++) { // 뺄셈기호를 기준으로 나눈다.
			int innerSum = 0;

			// 뺄셈으로 나뉜 토큰을 덧셈으로 분리해 더한다. meta character인 +은 이스케이프코드 사용
			String[] oprands = str[i].split("\\+");

			for (int j = 0; j < oprands.length; j++) {
				innerSum += Integer.parseInt(oprands[j]);
			}

			// 처음 수는 양수이기 때문에 대입한다.
			if (res == Integer.MAX_VALUE) {
				res = innerSum;
			} else {
				res -= innerSum;
			}

		}
		System.out.println(res);
	}

}
