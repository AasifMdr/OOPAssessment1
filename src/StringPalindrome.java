import java.util.Scanner;

public class StringPalindrome {

    public static void main(String args[]) {

        String x, y = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        x = sc.nextLine();

        int n = x.length();

        for (int i = n - 1; i >= 0; i--) {
            y = y + x.charAt(i);
        }
        if (x.equalsIgnoreCase(y)){
            System.out.println("It is a palindrome.");
        }
        else {
            System.out.println("It is not a palindrome.");
        }
    }
}