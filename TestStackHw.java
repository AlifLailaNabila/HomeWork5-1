import java.util.Stack;
import HomeWork5.stackHw;

import static HomeWork5.stackHw.*;

public class TestStackHw {
    public static void main(String[] args) {
        Stack<Integer> plate=new Stack<>();
        stack_push(plate);
        stack_peek(plate);
        stack_pop(plate);
        stack_search(plate,1);

    }
}
