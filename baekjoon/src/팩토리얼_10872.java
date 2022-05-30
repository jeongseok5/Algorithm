import java.io.*;
//import java.util.*;

public class ÆÑÅä¸®¾ó_10872 {
	public static int fac(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * fac(n - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

//		Scanner scnr = new Scanner(System.in);
//		int n = scnr.nextInt();
		System.out.println(fac(n));
	}

}
