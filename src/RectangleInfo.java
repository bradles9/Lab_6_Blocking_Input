import java.util.Scanner;


public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Please enter the length of the rectangle: ");
        if (in.hasNextDouble()){
            Double length=in.nextDouble();
            System.out.println("Please enter the width of the rectangle: ");
            if (in.hasNextDouble()){
                Double width=in.nextDouble();
                System.out.println("The area of the rectangle is: ");
                Double area=length*width;
                System.out.println(area);
                System.out.println("The perimeter of the rectangle is: ");
                Double perimeter=(length*2)+(width*2);
                System.out.println(perimeter);
                System.out.println("The diagonal of the rectangle is: ");
                Double diagonal=Math.sqrt((length*length)+(width*width));
                System.out.println(diagonal);
            }
            else{
                System.out.println("ERROR: Please enter a correct width of the rectangle.");
            }

        }
        else{
            System.out.println("ERROR: Please enter a correct length of the rectangle.");

        }


    }
}
