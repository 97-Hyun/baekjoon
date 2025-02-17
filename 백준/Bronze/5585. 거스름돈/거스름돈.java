import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] coins = {500, 100, 50, 10, 5, 1};
        int count = 0;
        int val = Integer.parseInt(br.readLine());
        val = 1000 - val;
        
        
        for (int coin : coins) {
            if (val == 0) break;
            
            count += val / coin; 
            val %= coin;
        }
        
        bw.write(count+"");
        
        bw.flush();
        br.close();
        bw.close();
    }
}