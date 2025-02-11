import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        int ret = 0;
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') 
                st.push(str[i]);
            else {
                st.pop();
                
                if (str[i - 1] == '(') {
                    ret += st.size();
                } else {
                    // str[i - 1] == ')'
                    ret += 1;
                }
            }
        }
        
        System.out.print(ret);
        
        br.close();
    }
}