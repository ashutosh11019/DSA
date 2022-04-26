package Stack;

import java.util.*;

/**
 * Bracket
 */
public class Bracket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> str  = new Stack<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                str.push(c);
            } 
            else{
                if(str.isEmpty()){
                    break;
                }
                if (str.peek()=='(' && c==')') {
                    str.pop();
                }
                else if (str.peek()=='{' && c=='}') {
                    str.pop();
                }
                else if (str.peek()=='[' && c==']') {
                    str.pop();
                }
            }
        }
        if(str.empty()){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
        sc.close();
    }
}