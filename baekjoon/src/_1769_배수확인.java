import java.io.*;

public class _1769_배수확인 {
	static int times = 0;

	private static void mulOfThree(String num, int times) {
		int sum = 0;
		
		if(num.length()>1) {
			times++;
		}
		for (int i = 0; i < num.length(); i++) {
			Character c = num.charAt(i);
			String str = c.toString();
			sum += Integer.parseInt(str);
			
		}
		

		if (sum > 9) {
			mulOfThree(Integer.toString(sum), times);
			
		}
		if (sum <= 9) {
			System.out.println(times);
			if(sum%3==0) {
				System.out.println("YES");	
			}
			else {
				System.out.println("NO");
			}
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String num = br.readLine();
		mulOfThree(num, times);

	}

}
