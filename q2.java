import java.util.Scanner;
import java.util.Stack;

public class q2 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        String  s = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!stack.empty()&&s.charAt(i) != stack.peek()){
                stack.pop();

            }else {
                stack.push(s.charAt(i));

            }
        }
        System.out.println(stack.size());
    }
}
