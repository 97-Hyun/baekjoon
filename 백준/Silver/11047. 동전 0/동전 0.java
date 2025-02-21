import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int ret = 0;
        int[] coins = new int[n];
        
        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }
        
        for (int i = n - 1; i >= 0; i--) {
            ret += k / coins[i];
            k %= coins[i];
        }
        
        br.close();
        System.out.println(ret);
    }
}