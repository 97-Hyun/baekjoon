import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};
        
        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());
            
            for (int j = 0; j < coins.length; j++) {
                bw.write((val / coins[j]) + "");
                if (j < coins.length - 1) bw.write(" ");  // 마지막 값에는 공백을 추가하지 않음
                val %= coins[j];
            }
            bw.write("\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}