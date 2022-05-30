import java.util.*;
import java.io.*;

public class _11725_트리의_부모_찾기 {
	static boolean[] visit;
	static ArrayList<Integer>[] ad;
	static int result[];
	static int nV; // 노드의 개수
	static int nE; // 간선

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		nV = Integer.parseInt(st.nextToken()); // 노드의 개수

		visit = new boolean[nV + 1];
		ad = new ArrayList[nV + 1];
		result = new int[nV + 1];

		for (int i = 1; i <= nV; i++)
			ad[i] = new ArrayList<>();

		for (int i = 1; i < nV; i++) {
			st = new StringTokenizer(br.readLine());

			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());

			ad[t1].add(t2);
			ad[t2].add(t1);
		}
		dfs(1);
		for (int i = 2; i <= nV; i++)
			System.out.println(result[i]);

	}

	static void dfs(int num) {
		visit[num] = true;
		for (int index : ad[num]) {
			if (!visit[index]) {
				result[index] = num;
				dfs(index);
			}
		}
	}

}
