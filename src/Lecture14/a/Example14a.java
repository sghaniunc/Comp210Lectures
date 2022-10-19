package Lecture14.a;

// Example of Stacks using Linked Lists with Generics (w/o interfaces)
public class Example14a {
    public static void main(String[] args){
        testSetA();
        testSetB();
    }
    static void testSetA(){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
//        stack.push("hi");     // This will give a compile error (wrong data type)
//        stack.push(10.5); // This will also give a compile error
        System.out.println("Pushed = "+ 10 + ", Stack size = "+stack.getSize());
        stack.push(20);
        System.out.println("Pushed = "+ 20 + ", Stack size = "+stack.getSize());
        stack.push(30);
        System.out.println("Pushed = "+ 30 + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop()._value);
        System.out.println("Stack popped value = "+ stack.pop()._value);
        System.out.println("Stack popped value = "+ stack.pop()._value);
    }
    static void testSetB(){
        Stack<String> stack = new Stack<>();
        String s;
        s = "How";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        s = "are";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        s = "you?";
        stack.push(s);
        System.out.println("Pushed = "+ s + ", Stack size = "+stack.getSize());
        System.out.println("Stack popped value = "+ stack.pop()._value);
        System.out.println("Stack popped value = "+ stack.pop()._value);
        System.out.println("Stack popped value = "+ stack.pop()._value);
    }
}
