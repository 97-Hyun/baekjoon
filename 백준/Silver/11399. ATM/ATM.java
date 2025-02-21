import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n];
        int prev = 0;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            sum += prev + arr[i];
            prev += arr[i];
        }
        
        br.close();
        System.out.print(sum);
    }
}