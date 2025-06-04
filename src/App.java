import controllers.Stack;

public class App {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(0);
        stack.push(5);
        stack.printStack(); 
        stack.pop();
        stack.peek();
        stack.printStack(); 
    }
}
