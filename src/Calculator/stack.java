package Calculator;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings("all")
public class stack {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();//存后缀

        String a = null;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        for (int i = 0; i < a.length(); i++) {
            StringBuilder sb = new StringBuilder();
            char c = a.charAt(i);
            while (isnum(c)){
                sb.append(c);
                if (++i>=a.length())break;
                c = a.charAt(i);
            }
            if (!sb.toString().equals(""))
                stack2.push(new BigDecimal(sb.toString()));
            if (unnum(c)){
                if (c == '+'||c == '-') {
                    while (!stack1.empty()&&(char)stack1.peek() != '(')//&&((char)(stack1.peek()))!='('
                        stack2.push(stack1.pop());
                    if (stack1.empty()||(char)stack1.peek() == '(')
                        stack1.push(c);
                }
                else if (c=='*'||c=='/'){
                    if (!stack1.empty()&&((char)stack1.peek() == '*'||(char)stack1.peek() == '/')) {
                        stack2.push(stack1.pop());
                        stack1.push(c);
                    }else {
                        stack1.push(c);
                    }
                }
                else if (c == '(') stack1.push(c);//9+(3-1)*3+10/2
                else if (c == ')'){
                    while (!stack1.empty()&&(char)stack1.peek() != '('){
//                        System.out.println((char)stack1.peek());
                        stack2.push(stack1.pop());
                    }
                    if (!stack1.empty()) {
                        stack1.pop();
                    }
                }
            }
        }

        while (!stack1.empty())
            stack2.push(stack1.pop());
        Stack stack = new Stack();
        while (!stack2.empty())
            stack.push(stack2.pop());
        Stack stack3 = new Stack();//存结果
        while (!stack.empty()){
            Object c = stack.peek();
            if (c.getClass() == BigDecimal.class){
                stack3.push(stack.pop());
            }
            else if (stack3.size()>1){
                BigDecimal b1 = (BigDecimal)stack3.pop();
                BigDecimal a1 = (BigDecimal)stack3.pop();
                if ((char)c == '+'){
                    stack3.push(a1.add(b1));
                }if ((char)c == '-'){
                    stack3.push(a1.subtract(b1));
                }if ((char)c == '*'){
                    stack3.push(a1.multiply(b1));
                }if ((char)c == '/'){
                    stack3.push(a1.divide(b1));
                }
                stack.pop();
            }
        }
        System.out.print(stack3.pop());
    }


    public static boolean isnum(char a){
        if (a>='0' && a<='9'){
            return true;
        }
        else return false;
    }
    public static boolean unnum(char a){
        if (a == '+' || a == '-' || a== '*'|| a== '/'|| a== '('|| a== ')'){
            return true;
        }
        else return false;
    }

}