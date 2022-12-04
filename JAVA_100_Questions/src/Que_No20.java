import java.util.Scanner;

//Question: Reverse the number
public class Que_No20 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number= input.nextInt();
        int remainder=0;
        int reverse=0;
        while (number!=0){
            remainder = number%10;
             reverse = reverse*10 +remainder;
             number/=10;
        }
        System.out.println("The reverse of the number is : " + reverse);
    }
}
