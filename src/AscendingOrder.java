import java.util.Scanner;
import java.io.*;

public class AscendingOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names you want to enter : ");
        int num = sc.nextInt();

        String[] str = new String[num];
        System.out.println("Enter the strings : ");

        for(int i = 0; i < num; i++)
        {
            str[i] = new String(sc.next());
        }
        for(int i = 0; i < num; i++)
        {
            for(int j = i+1; j < num; j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("The sorted list of strings are : ");
        for(int i = 0; i < num; i++)
        {
            System.out.println(str[i]);
        }
    }
}