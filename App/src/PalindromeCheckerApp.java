import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){


                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a string: ");
                String input = sc.nextLine();
                Queue<Character> queue = new LinkedList<>();
                Stack<Character> stack = new Stack<>();
                for (int i = 0; i < input.length(); i++) {
                    char ch = input.charAt(i);
                    queue.add(ch);
                    stack.push(ch);
                }
                boolean isPalindrome = true;
                while (!queue.isEmpty() && !stack.isEmpty()) {
                    if (queue.remove() != stack.pop()) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("The string is a Palindrome.");
                } else {
                    System.out.println("The string is NOT a Palindrome.");
                }

                sc.close();
            }
        }
