import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");
        int cnt = 1;
        
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("S")) {
                cnt++;
            } else {
                cnt++;
                i++;
            }
        }
        
        cnt = Math.min(n, cnt);
        
        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}