import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double shipping = 0.0;
        System.out.println("Enter the price of you of your item.");


        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();

            if (itemPrice >= 100)
            {
                System.out.println("Your item is $" + itemPrice + "." + "You have qualified for free shipping!");
            } else if (itemPrice <= 99.99)
            {
                shipping = itemPrice * 0.02;
                System.out.println("Your item is $" + itemPrice + "." + "Your shipping cost is $" + shipping);
            } else
            {
                System.out.println("Please input a valid number greater than zero.");
            }
        }

        else
        {
            System.out.println("Sorry, please input a valid number.");
        }
    }
}