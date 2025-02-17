import java.util.Scanner;

class FuelCosts {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the number of gallons of gas in the tank: ");
    if(in.hasNextDouble())
    {
        Double gallonsTank=in.nextDouble();
        System.out.println("Please enter the fuel efficiency for your vehicle: ");
        if(in.hasNextDouble())
        {
            Double fuelEfficiency=in.nextDouble();
            System.out.println("Please enter the price of gas per gallon: ");
            if(in.hasNextDouble())
            {
                Double pricePerGallon=in.nextDouble();
                Double costPerHundred=(100/fuelEfficiency)*pricePerGallon;
                System.out.println("The cost per 100 miles is: " + costPerHundred);
                Double distancePossible = gallonsTank*fuelEfficiency;
                System.out.print("The car can go " +distancePossible);
                //Couldn't get the word miles after the distance possible without an error, have to figure out syntax.
            }
            else{
                System.out.println("ERROR: Please enter a valid value.");
            }

        }
        else{
            System.out.println("ERROR: Please enter a valid value.");
        }
    }
    else{
        System.out.println("ERROR: Please enter a valid value.");
    }





















































}}
