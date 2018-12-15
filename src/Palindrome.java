import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        //1. Declare your variables
        String userInput;
        Scanner scn = new Scanner(System.in);
        //2. Getting user input
        System.out.println("Enter a word:");
        userInput = scn.nextLine();
        //3. Invoke isPalindrome()
        isPalindrome(userInput);
    }

    //static isPalindrome Method
    public static Boolean isPalindrome(String userInput) {
        for (int i = 0; i<= userInput.length() / 2; i++) {
            if (userInput.charAt(i) != userInput.charAt(userInput.length() - i - 1)) {
                System.out.println("This is not a palindrome");
                return false;
            }
        }
        System.out.println("This is a palindrome");
        return true;
    }
}
