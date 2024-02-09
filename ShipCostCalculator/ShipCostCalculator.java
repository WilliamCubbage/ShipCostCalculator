import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int itemPrice = 0;
        double shipping = 0.0;
        System.out.println("Enter the price of you of your item.");
        itemPrice = in.nextInt();

        if (itemPrice >=100)
        {
            System.out.println("Your item is $" + itemPrice + "." + "You have qualified for free shipping!");

        }
        else
        {
            shipping = itemPrice * 0.02;
        }

            System.out.println("Your item is $" + itemPrice + "." + "Your shipping cost is $" + shipping);
    }
}