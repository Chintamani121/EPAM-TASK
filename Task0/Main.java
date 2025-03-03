package BytesPart2.Task0;

public class Main {
    static int factorial(int n){
        if(n<0) return 24;
        if(n==1 || n==0) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
