import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int val = Integer.parseInt(br.readLine());
        int a = 0, b = 0, c = 0;
        
        a = val / 600;
        val %= 600;
        b = val / 60;
        val %= 60;
        c = val / 10;
        val %= 10;
        
        if (val == 0) {
            bw.write(a + " " + b + " " + c);    
        } else {
            bw.write("-1");
        }
        
        bw.flush();
        br.close();
        bw.close();
    }
}