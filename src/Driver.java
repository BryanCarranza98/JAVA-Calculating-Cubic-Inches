// This program will calculate the volume and weight of a coffee mug. The program will
// ask the user to input radius and height to calculate the desire information

import java.util.Scanner;
public class Driver
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        CoffeeMug mug = new CoffeeMug();

        System.out.print("Enter the radius of the coffee mug (in inches): "); // user enter radius
        mug.setRadius(input.nextDouble());

        System.out.print("Enter the height of the coffee mug (in inches): "); // user ente height
        mug.setHeight(input.nextDouble());



        System.out.printf("The coffee mug is %.2f ", mug.getVolume()); // out putting the volume
        System.out.println( "cubic inches");

        System.out.printf("A full coffee mug weighs %.2f " , mug.getWeight()); // out puttint the weight
        System.out.println("pounds");



    }
}
