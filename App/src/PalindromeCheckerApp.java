
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {


public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Input: ");
    String input = sc.nextLine();

    PalindromeStrategy strategy = new StackStrategy();

    // Start time
    long startTime = System.nanoTime();

    boolean result = strategy.check(input);

    // End time
    long endTime = System.nanoTime();

    long executionTime = endTime - startTime;

    System.out.println("Is Palindrome?: " + result);
    System.out.println("Execution Time: " + executionTime + " ns");

    sc.close();
}
}

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack-based implementation
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}



