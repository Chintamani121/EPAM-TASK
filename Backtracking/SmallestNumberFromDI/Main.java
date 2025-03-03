package BytesPart2.Backtracking.SmallestNumberFromDI;
import java.util.Stack;

public class Main {
    public static String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(i + 1);
            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
       String s="IIID" ;
        System.out.println(smallestNumber(s));

    }
}
