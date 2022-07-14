import java.util.Scanner;

public class _20363_당근키우기 {

	public static void main(String[] args) {
		
		int res = 0;
		int larger; int smaller;
		
		Scanner scnr = new Scanner(System.in);
		
		String[] resource = scnr.nextLine().split(" ");
		int sun = Integer.parseInt(resource[0]);
		int water = Integer.parseInt(resource[1]);
		
		if(sun > water) {
			larger = sun;
			smaller = water;
		}else {
			larger = water;
			smaller = sun;
			
		}
		// idea: 필요한 햇빛과 물중 큰 수인 자원을 먼저 주고 작은 수의 자원를 주고 
		// 작은 수%10만큼 감소한 큰 수의 자원들 다시 준다
		res += larger;
		res += smaller;
		res += smaller/10;
		
		System.out.println(res);
		
		
		
		
		

	}

}
