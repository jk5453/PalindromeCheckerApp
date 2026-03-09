
import java.util.Scanner;

public class PalindromeCheckerApp {


public static void main(String[] args){


    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = sc.nextLine();

    PalindromeService service = new PalindromeService();

    boolean result = service.checkPalindrome(input);

    System.out.println("Is Palindrome: " + result);

    sc.close();
}
}

// Service class containing palindrome logic
class PalindromeService {

    public boolean checkPalindrome(String input) {

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}



