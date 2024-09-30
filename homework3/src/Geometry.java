import java.util.Scanner;
/**
     This program demonstrates static methods
 */
//create Geometry to show menu
public class Geometry
{
    /**
     * This method will show the menu to the users
     * Simply print out instructions for the user with a menu of options for the user to choose from
     */
        public static void printMenu()
        {
            System.out.println("This is a geometry calculator");
            System.out.println("Choose what you would like to calculate");
            System.out.println("1. Find the area of a circle");
            System.out.println("2. Find the area of a rectangle");
            System.out.println("3. Find the area of a triangle");
            System.out.println("4. Find the circumference of a circle");
            System.out.println("5. Find the perimeter of a rectangle");
            System.out.println("6. Find the perimeter of a triangle");
        }
    /**
     * This method will calculate circle area
     * Take in the radius of the circle
     * Return the area using the formula A = π r 2
     * @param r radius of circle
     * @return Math.PI*r*r area of circle
     */
    public static double circleArea(double r)
        {
            return Math.PI*r*r;
        }
    /**
     * This method will calculate area of rectangle
     * Take in the length and width of rectangle
     * Return the area using the formula A = lw
     * @param l width of rectangle
     * @param w length of rectangle
     * @return l*w area of rectangle
     */
        public static double rectangleArea(double l,double w)
        {
            return l*w;
        }
    /**
     * This method will calculate the area of triangle
     * Take in the base and height of the triangle
     * Return the area using the formula A = ½bh
     * @param b base of triangle
     * @param h height of triangle
     * @return b*h/2 area of triangle
     */
        public static double triangleArea(double b, double h)
        {
            return b*h/2;
        }
    /**
     * This method will calculate the circle circumference
     * Take in the radius of the circle
     * Return the circumference using the formula C = 2πr
     * @param r the radius of the circle
     * @return Math.PI*r*2 circumference of the circle
     */
        public static double circleCircumference(double r)
        {
            return  Math.PI*r*2;
        }
    /**
     * This method will calculate the perimeter of rectangle
     * Take in the length and the width of the rectangle
     * Return the perimeter of the rectangle using the formula P = 2l +2w
     * @param l the length of rectangle
     * @param w the width of the rectangle
     * @return 2l+2w the perimeter of the rectangle
     */
        public static double rectanglePerimeter(double l,double w)
        {
            return 2*l+2*w;
        }
    /**
     * This method will calculate the perimeter of triangle
     * Take in the lengths of the three sides of the triangle
     * Return the perimeter of the triangle which is calculated by adding up the three sides
     * @param l1 the first lengths of the three sides of the triangle
     * @param l2 the second lengths of the three sides of the triangle
     * @param l3 the third lengths of the three sides of the triangle
     * @return l1+l2+l3 the perimeter of the triangle
     */
        public static double trianglePerimeter(double l1,double l2,double l3)
        {
            return l1+l2+l3;
        }
        public static void main (String [] args)
        {
            int choice; //the user's choice
            double value; //the value returned from the method
            char letter; //the Y or N from the user's decision to exit
            double radius; //the radius of the circle
            double length; //the length of the rectangle
            double width; //the width of the rectangle
            double height; //the height of the triangle
            double base; //the base of the triangle
            double side1; //the first side of the triangle
            double side2; //the second side of the triangle
            double side3; //the third side of the triangle

            //create a scanner object to read from the keyboard
            Scanner keyboard = new Scanner (System.in);

            //do loop was chose to allow the menu to be displayed first
            do
            {
                //call the printMenu method
                printMenu();
                choice = keyboard.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter the radius of the circle: ");
                        radius = keyboard.nextDouble();
                        //call the circleArea method and store the result in the value
                        value = circleArea(radius);
                        System.out.println("The area of the circle is " + value);
                        break;
                    case 2:
                        System.out.print("Enter the length of the rectangle: ");
                        length = keyboard.nextDouble();
                        System.out.print("Enter the width of the rectangle: ");
                        width = keyboard.nextDouble();
                        value = rectangleArea(length,width);
                        //call the rectangleArea method and store the result in the value
                        System.out.println("The area of the rectangle is " + value);
                        break;
                    case 3:
                        System.out.print("Enter the height of the triangle: ");
                        height = keyboard.nextDouble();
                        System.out.print("Enter the base of the triangle: ");
                        base = keyboard.nextDouble();
                        value = triangleArea(height,base);
                        //call the triangleArea method and store the result in the value
                        System.out.println("The area of the triangle is " + value);
                        break;
                    case 4:
                        System.out.print("Enter the radius of the circle: ");
                        radius = keyboard.nextDouble();
                        value = circleCircumference(radius);
                        //call the circumference method and store the result in the value
                        System.out.println("The circumference of the circle is " + value);
                        break;
                    case 5:
                        System.out.print("Enter the length of the rectangle: ");
                        length = keyboard.nextDouble();
                        System.out.print("Enter the width of the rectangle: ");
                        width = keyboard.nextDouble();
                        value=rectanglePerimeter(length,width);
                        //call the perimeter method and store the result in the value
                        System.out.println("The perimeter of the rectangle is " + value);
                        break;
                    case 6:
                        System.out.print("Enter the length of side 1 of the triangle: ");
                        side1 = keyboard.nextDouble();
                        System.out.print("Enter the length of side 2 of the triangle: ");
                        side2 = keyboard.nextDouble();
                        System.out.print("Enter the length of side 3 of the triangle: ");
                        side3 = keyboard.nextDouble();
                        value=trianglePerimeter(side1,side2,side3);
                        //call the perimeter method and store the result in the value
                        System.out.println("The perimeter of the triangle is " + value);
                        break;
                    default:
                        System.out.println("You did not enter a valid choice.");
                }

                //consumes the new line character after the number
                keyboard.nextLine();
                System.out.println("Do you want to exit the program (Y/N)?: ");
                String answer = keyboard.nextLine();
                letter = answer.charAt(0);
            }while (letter != 'Y' && letter != 'y');
        }
}

