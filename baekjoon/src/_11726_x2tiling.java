import java.util.Scanner;

public class x2tiling11726 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int n = scnr.nextInt(); // Á¤¼ö
		
		int[] dp = new int[n+2];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		recur(dp, n);
		
		System.out.println(recur(dp, n));
		scnr.close();
	}
	
	public static int recur(int[] dp, int n) {
		for(int i=3; i<=n; i++) {
			dp[i] =(dp[i-1] + dp[i-2]) % 10007;
		}
		return dp[n];
	}

}
