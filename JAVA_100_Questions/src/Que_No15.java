import java.util.Arrays;
import java.util.Scanner;

public class Que_No15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number= input.nextInt();
        int fact= 1;
        for (int i =1 ;i<=number ;i++){
            fact = fact*i;

        }
        System.out.print("The factorial of the number is : " + fact);

    }
}
