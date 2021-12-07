import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kg : ");
        float weight = sc.nextFloat();
        System.out.print("Enter the height in m : ");
        float height = sc.nextFloat();

        float ans=order(weight, height);
        System.out.println("The calculated BMI is " + ans);

    }
    public static float order(float weight, float height) {
        return weight/(height * height);
    }
}

