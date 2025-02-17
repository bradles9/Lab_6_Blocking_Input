import java.util.Scanner;


public class CtoFConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the temperature in Celsius: ");

        //validity of variable
        if (in.hasNextDouble()) {
            double Celsius = in.nextDouble();
            double Fahrenheit = (Celsius * 1.8) + 32;
            //Fahrenheit output
            System.out.println("The converted temp to Fahrenheit: " + Fahrenheit);
            if(Celsius>100){
                System.out.println("The temperature you have enter is at or beyond boiling temperatures.");
            }
            else if(Celsius<0){
                System.out.println("The temperature you have enter is at or below freezing temperatures.");
            }

        }
        else {
            System.out.println("ERROR: Please enter a numeric temp.");


        }






    }
}