import java.util.Scanner;

public class DistanceSpeed {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float timeSeconds;
        float mps,kph, mph;

        System.out.print("Input distance in meters : ");
        float distance = sc.nextFloat();

        System.out.print("Input the hour : ");
        float hour = sc.nextFloat();

        System.out.print("Input the minutes : ");
        float minutes = sc.nextFloat();

        System.out.print("Input the seconds: ");
        float seconds = sc.nextFloat();

        timeSeconds = (hour * 3600) + (minutes * 60) + seconds;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is "+ mps);
        System.out.println("Your speed in km/h is "+ kph);
        System.out.println("Your speed in miles/h is "+ mph);
    }
}

