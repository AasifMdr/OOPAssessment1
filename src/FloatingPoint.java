import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first float point number : ");
        float first_num = sc.nextFloat();

        System.out.print("Enter the second float point number : ");
        float second_num = sc.nextFloat();

        deci(first_num,second_num);
    }

    public static void deci (float first_num, float second_num){

        if (Math.abs(first_num-second_num)<=0) {
            System.out.println("It's the same number");
        }
        else {
            System.out.println("It's not the same number");
        }
    }
}