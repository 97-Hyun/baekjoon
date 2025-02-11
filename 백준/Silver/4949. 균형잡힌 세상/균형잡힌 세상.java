import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            String str = br.readLine();
            
            if (str.equals(".")) break;
            
            Stack<Character> st = new Stack<>();
            boolean isValid = true;
            
            for (char c : str.toCharArray()) {
                if (c == '(')
                    st.push(')');
                else if (c == '[')
                    st.push(']');
                else if (c == ')' || c == ']') {
                    if (st.isEmpty() || st.pop() != c) {
                        isValid = false;
                        break;
                    }    
                }
            }
            
            if (isValid && st.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        br.close();
    }
}