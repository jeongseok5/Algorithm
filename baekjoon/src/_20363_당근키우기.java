import java.util.Scanner;

public class ���Ű���_20363 {

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
		// idea: �ʿ��� �޺��� ���� ū ���� �ڿ��� ���� �ְ� ���� ���� �ڿ��� �ְ� 
		// ���� ��%10��ŭ ������ ū ���� �ڿ��� �ٽ� �ش�
		res += larger;
		res += smaller;
		res += smaller/10;
		
		System.out.println(res);
		
		
		
		
		

	}

}
