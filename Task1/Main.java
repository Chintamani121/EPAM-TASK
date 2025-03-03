package BytesPart1.Task1;
public class Main {
    public static String findLongestWord(String a) {
        if(a==null) return null;
        String ans= "";
        StringBuilder temp= new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                if(temp.length()>ans.length()) ans= temp.toString();
                temp = new StringBuilder();
            }
            else temp.append(a.charAt(i));
        }
        if(temp.length()>ans.length()) return temp.toString().trim();
        if(ans.isEmpty()) return null;
        return ans.trim();
    }

    public static void main(String[] args) {
        System.out.print(".");
        System.out.print(findLongestWord("   abcd   abcdefg abcdef   "));
        System.out.print(".");
    }
}
