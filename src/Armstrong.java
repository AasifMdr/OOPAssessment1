import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rem;
        int arm = 0;
        int len = 0;

        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int t1=num;

        while (t1>0) {
            t1=t1/10;
            len=len+1;
        }
        int t2=num;
        while(t2!=0) {
            rem=t2%10;

            int mul=1;
            mul=mul*rem;
            for(int i=0;i<=len;i++)
            {
                arm=arm+mul;
                t2=t2/10;
            }
        }
        if (arm==num) {
            System.out.println("The given number is Armstrong");
        }
        else {
            System.out.println("The given number is not Armstrong");
        }
    }
}
