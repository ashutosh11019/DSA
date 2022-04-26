// import java.io.*;
import java.util.*;

public class Main {
    public static boolean prime(int n){
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c>0){
            return false;
        }
        return true;
    }
	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=0;i<al.size();i++){
			
		    if(prime(al.get(i))){
		        al.remove(i);
		    }
		}
		al.remove(37);
		al.remove(739);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}