package collections;

import java.util.Stack;

public class StackImp {

    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        // Pushes element into stack
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        // Adds element at specified index
        animals.add(1,"AD");
        System.out.println(animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals);
    }

}
