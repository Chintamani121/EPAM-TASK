package BytesPart1.Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String wordHaveGreatestNumberOfVowelsFromLine(String line) {
        if(line==null) return null;
        HashMap<Character,Integer> mpp = new HashMap<>(Map.of(
                'A',1, 'E',1, 'I',1, 'O',1, 'U',1,
                'a',1,'e',1,'i',1,'o',1,'u',1
        ));
        StringBuilder temp= new StringBuilder();
        String ans="";
        int tempVar = 0;
        int ansVar = 0;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)==' '){
                if(tempVar>=ansVar) {
                    ans = String.valueOf(temp);
                    ansVar = tempVar;
                }
                temp = new StringBuilder();
                tempVar = 0;
            }
            else {
                if(mpp.containsKey(line.charAt(i))) tempVar++;
                temp.append(line.charAt(i));
            }
        }
        if(ansVar < tempVar) return String.valueOf(temp);
        return (ans.isEmpty()) ? null : ans;
    }

    public static void main(String[] args) {
        System.out.println(wordHaveGreatestNumberOfVowelsFromLine(null));

    }
}
