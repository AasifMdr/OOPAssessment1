import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int first_num = sc.nextInt();

        System.out.print("Enter the second number : ");
        int second_num = sc.nextInt();

        System.out.print("Enter the third number : ");
        int third_num = sc.nextInt();

        if (first_num < second_num && second_num < third_num){
            System.out.println("It is in an increasing order.");
        }
        else if (first_num > second_num && second_num > third_num){
            System.out.println("It is in decreasing order.");
        }
        else {
            System.out.println("It is neither in increasing or decreasing order.");
        }

    }
}
