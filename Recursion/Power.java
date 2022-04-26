package Recursion;

public class Power {

    static int stepCount=0;
    public static void main(String[] args) {
        System.out.println(pow(2,10));
        System.out.printf("Step: %d", stepCount);
    }

    static int power(int a, int b) {
        stepCount++;
        if(a==0){
            return 0;
        } else if (a==1 || b==0){
            return 1;
        } 
        return a*power(a,b-1);
    }

    static int pow(int a, int b){
        stepCount++;
        if(a==0){
            return 0;
        } else if (a==1 || b==0){
            return 1;
        }
        if (b%2==0) {
            return pow(a*a, b/2);
        }
        return a*pow(a,b-1);
    }
}
