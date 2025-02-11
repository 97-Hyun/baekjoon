import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int val = 1;
        int ret = 0;
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                val *= 2;
                stack.push(ch[i]);
            } else if (ch[i] == '[') {
                val *= 3;
                stack.push(ch[i]);
            } else {
                if (ch[i] == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        ret = 0;
                        break;
                    }
                    
                    if (ch[i - 1] == '(') ret += val;
                    
                    stack.pop();
                    val /= 2;
                } else {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        ret = 0;
                        break;
                    }
                    
                    if (ch[i - 1] == '[') ret += val;
                    
                    stack.pop();
                    val /= 3;
                }
            }
        }
        
        if (!stack.isEmpty()) 
            ret = 0;
        
        System.out.println(ret);
        br.close();
    }
}