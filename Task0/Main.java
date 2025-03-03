package BytesPart1.Task0;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String left="#";
        String right="#";
        String b=" ";
        int n=16;
        left=left.repeat(n);
        right=right.repeat(n);
        b=b.repeat(n*2-4);
        System.out.println(left);
        int var=n*2-4;
        ArrayList<String> stringArray=new ArrayList<>();
        for(int i=0;i<n/2;i++) {
            String e = b.substring(0,i) + left.substring(0,i) + b.substring(0,var) + right.substring(0,i);
            stringArray.add(e);
            System.out.println(e);
            var=var-4;
        }
        for(int i=stringArray.size()-1;i>=0;i--) System.out.println(stringArray.get(i));

    }
}
