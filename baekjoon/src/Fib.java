import java.util.Scanner;

public class Fib {
	public static int fib(int n) {
		int zeroth = 0;
		int first = 1;
		if (n==0) {
			return zeroth;
		}
		else if (n==1) {
			return first;
		}
		else {
			return fib(n-2)+fib(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        System.out.println(fib(n));
        s.close();
    }
}
