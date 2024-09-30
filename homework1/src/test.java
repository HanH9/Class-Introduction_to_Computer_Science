import java.util.*;
import java.text.*;
public class test
{
    public static void main(String[] args)
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //TASK #5 Create a DecimalFormat object with 2 decimal places
        //Create a Scanner object to read input
        Scanner keyboard = new Scanner (System.in);
        String firstName; //user's first name
        boolean discount = false; //flag, true if user is eligible for discount
        int inches; //size of the pizza
        char crustType; //code for type of crust
        String crust = "Hand-tossed"; //name of crust
        double cost = 12.99; //cost of the pizza
        final double TAX_RATE = .08; //sales tax rate
        double tax; //amount of tax
        char choice; //user's choice
        String input; //user input
        String toppings = "Cheese "; //list of toppings
        int numberOfToppings = 0; //number of toppings
        //prompt user and get first name
        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        String name1 = "Mike";
        String name2 = "Diane";
        if(name1.equalsIgnoreCase(firstName) || name2.equalsIgnoreCase(firstName))
        {
            discount = true;
        }
        System.out.println("Pizza Size (inches) Cost");
        System.out.println(" 10 $10.99");
        System.out.println(" 12 $12.99");
        System.out.println(" 14 $14.99");
        System.out.println(" 16 $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = keyboard.nextInt();
        if(inches == 10)
        {
            cost = 10.99;
        }
        else if(inches == 14)
        {
            cost = 14.99;
        }
        else if(inches == 16)
        {
            cost = 16.99;
        }
        else
        {
            System.out.println("Sorry,we don't have this size,so a 12 inch pizza will be made.");
        }
        keyboard.nextLine();
        //prompt user and get crust choice
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or " +
                "(D) Deep-dish (enter H, T, or D): ");
        input = keyboard.nextLine();
        crustType = input.charAt(0);
        switch(crustType)
        {
            case 'H':case 'h':
            crust = "Hand-tossed";
            break;
            case 'T':case 't':
            crust = "Thin-crust";
            break;
            case'D':case 'd':
            crust = "Deep-dish";
            break;
            default:
                System.out.println("Your input was not one of the choices, so a Hand-tossed crust will be made.");
        }
        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each,"
                +" choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");
        //if topping is desired,
        //add to topping list and number of toppings
        System.out.print("Do you want Pepperoni? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni ";
        }
        System.out.print("Do you want Sausage? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Sausage ";
        }
        System.out.print("Do you want Onion? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Onion ";
        }
        System.out.print("Do you want Mushroom? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y')
        {
            numberOfToppings += 1;
            toppings = toppings + "Mushroom ";
        }
        //add additional toppings cost to cost of pizza
        cost = cost + (1.25*numberOfToppings);
        //display order confirmation
        System.out.println();
        System.out.println("Your order is as follows: ");
        System.out.println(inches + " inch pizza");
        System.out.println(crust + " crust");
        System.out.println(toppings);
        //apply discount if user is elibible
        //ADD LINES FOR TASK #4 HERE
        if(discount)
        {
            System.out.println("You have a $2.00 discount");
            cost-=2;
        }
        //EDIT PROGRAM FOR TASK #5
        //SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
        System.out.println("The cost of your order is: $" + decimalFormat.format(cost));
        //calculate and display tax and total cost
        tax = cost * TAX_RATE;
        System.out.println("The tax is: $" + decimalFormat.format(tax));
        System.out.println("The total due is: $" + decimalFormat.format(tax+cost));
        System.out.println("Your order will be ready for pickup in 30 minutes.");
    }
}
