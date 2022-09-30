import java.util.Scanner;

public class Lab_06_04_MetricConversion {
    public static void main(String[] args) {

        double lengthInMeters;
        double miles;
        double feet;
        double inches;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("What is the length in meters that you want to convert?");
        if (in.hasNextDouble()){
            lengthInMeters = in.nextDouble();
            in.nextLine();

            miles = lengthInMeters * 0.00062;

            feet = lengthInMeters * 3.2808399;

            inches = lengthInMeters * 39.3700787;


            System.out.printf("Your entered length in miles is %.2f miles%n",miles);
            System.out.printf("Your entered length in feet is %.2f feet%n",feet);
            System.out.printf("Your entered length in inches is %.2f inches",inches);



        }else{
            trash = in.nextLine();
            System.out.println("You have entered an incorrect measurement: " + trash + " Please try again.");
            System.exit(0);
        }
    }
}
