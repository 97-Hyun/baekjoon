import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i = 1;
        
        while (true) {
            String[] input = br.readLine().split(" ");
            int l = Integer.parseInt(input[0]);
            int p = Integer.parseInt(input[1]);
            int v = Integer.parseInt(input[2]);
            int ret = 0;
            
            if (l == 0 && p == 0 && v == 0) break;
            
            ret += (v / p) * l;
            v %= p;
            
            if (l > v) {
                ret += v;
            } else {
                ret += l;
            }
            
            bw.write("Case " + i + ": " + ret + "\n");
            i++;
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}