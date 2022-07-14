import java.util.*;

public class _11399_ATM {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int min = 0, n = scnr.nextInt();
		int[] p = new int[n + 1];
		for (int i = 0; i < n; i++)
			p[i] = scnr.nextInt();
		Arrays.sort(p);
		for (int i = 1; i <= n; i++) {
			p[i] = p[i - 1] + p[i];
			min +=p[i];
		}
		System.out.println(min);
		scnr.close();

	}

}
