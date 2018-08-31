package HomeWork5;

import java.util.Stack;

public class stackHw {

    //Stack<Integer> plates=new Stack<Integer>();

    //inserting plates in stack.
    // Pushing element on the top of the stack
    public static void stack_push(Stack<Integer> plate) {
        for (int i = 0; i < 5; i++) {
            plate.push(i);
        }
    }

    // Popping element from the top of the stack
    public static void stack_pop(Stack<Integer> plate) {
        System.out.println("Pop :");

        for (int i = 0; i < 5; i++) {
            Integer plateBring = (Integer) plate.pop();
            System.out.println(plateBring);
        }
    }

    // Displaying element on the top of the stack
    public static void stack_peek(Stack<Integer> plate) {
        Integer element = (Integer) plate.peek();
        System.out.println("Element on stack top : " + element);
    }

    // Searching element in the stack
    public static void stack_search(Stack<Integer> plate, int element) {
        Integer pos = (Integer) plate.search(element);

        if (pos ==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position " + pos);


    }
}

