//Question: How to get input from the user using the Scanner class.
import java.util.Scanner; // This import statement is used to use the Scanner class which is present in the java.util package using the import keyword
public class Que_No4 {
    public static void main(String [ ] args){
        Scanner input = new Scanner(System.in); // This line will create the object of the Scanner class with reference variable input which will be used to take the input
//        from the user.
        System.out.print("Enter the First Number : ");
        int number1= input.nextInt();
        System.out.print("Enter the Second Number : ");
        int number2= input.nextInt();

        System.out.println("The first number is " + number1 );
        System.out.println("The Second number is " + number2 );

    }

}
