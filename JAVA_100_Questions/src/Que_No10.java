import java.util.Scanner;

//Question : Find the Largest Element in java.
public class Que_No10 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second Number : ");
        int secondNumber = input.nextInt();
        if (firstNumber>secondNumber){
            System.out.println("The largest Element is " + firstNumber);
        }else {
            System.out.println("The largest Element is " + secondNumber);
        }

    }
}
