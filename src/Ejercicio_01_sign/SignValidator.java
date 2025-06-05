package Ejercicio_01_sign;
import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '(': stack.push(')'); break;
                case '[': stack.push(']'); break;
                case '{': stack.push('}'); break;
                default:
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false;
                    }
            }
        }

        return stack.isEmpty(); // si está vacío, es válido
    }
}
