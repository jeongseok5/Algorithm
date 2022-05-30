import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _16120_PPAP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'P') {
				stack.push('P');
			} else {
				// 3번째에 A 4번째에 P가 온다면 PPAP
				if (stack.size() >= 2 && i + 1 < s.length() && s.charAt(i + 1) == 'P') {
					stack.pop();
					stack.pop();
				} else {
					System.out.println("NP");
					return;
				}
			}
		}
		if (stack.size() == 1)
			System.out.println("PPAP");
		else
			System.out.println("NP");
	}

}
