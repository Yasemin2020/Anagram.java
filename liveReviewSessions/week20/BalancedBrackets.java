package week20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    /*
    For compiler one of the most important task is balanced brackets
    * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
    Brackets are balanced if the closing bracket matches the opening one.
    https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

    Hint: Use HashMap for the bracket pairs and Stack to help keep track of which opening brackets have been seen and need to be closed

    Ex: {([])} -> balanced
        {[(])} -> not balanced
        {[(])} -> not balanced


        Checking for parenthesis is the most important task of compiler

        Stack is : Last in First out
        push(item) ---> putting on the
        pop() ----> first retrieves and removes the last entry

        Map holds : key and value

     */
    public static void main(String[] args) {

    }

    public static boolean isBalanced(String exp){
        Stack<Character> stack = new Stack<>(); // hold characters coming from String

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('{','}');
        brackets.put('[',']');
        brackets.put('(',')');
        for (int i = 0; i < exp.length(); i++) {
            char ch= exp.charAt(i);
        }

        return true;
    }

}
