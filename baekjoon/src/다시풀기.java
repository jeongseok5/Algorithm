import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 다시풀기 {
    static int arr[][];
    static boolean visit[];
    static int country, line, result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n;i++){
            country = sc.nextInt();
            line = sc.nextInt();

            result = 0;

            arr = new int[country+1][country+1];
            visit = new boolean[country+1];

            for(int j = 0; j<line;j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[a][b] = 1;
                arr[b][a] = 1;
            }
            bfs();
            System.out.println(result-1);
        }
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        while(!queue.isEmpty()){
            result++;
            int cur = queue.poll();
            for(int i = 1; i<=country;i++){
                if(arr[cur][i] == 1 && !visit[i]){
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}