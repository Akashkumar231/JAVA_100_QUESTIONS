//Question: How to add Two numbers in java.
import java.util.Scanner;
public class Que_No8 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int first_Number = input.nextInt();
        System.out.print("Enter the first number : ");
        int second_Number = input.nextInt();
        int sum = first_Number+second_Number;
        System.out.println("The sum of two number is : " + sum);

    }
}
