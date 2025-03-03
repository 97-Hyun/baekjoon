import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] classList = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            classList[i][0] = Integer.parseInt(input[0]); 
            classList[i][1] = Integer.parseInt(input[1]); 
        }

        Arrays.sort(classList, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
           
            if (!pq.isEmpty() && pq.peek() <= classList[i][0]) {
                pq.poll(); 
            }
            pq.offer(classList[i][1]); 
        }

        System.out.println(pq.size());
    }
}
