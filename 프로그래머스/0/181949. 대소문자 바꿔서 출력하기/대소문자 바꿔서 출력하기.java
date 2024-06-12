import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] cArr = a.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        for(char c : cArr) {
            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
                          
        sb.toString();
        System.out.print(sb);
    }
}