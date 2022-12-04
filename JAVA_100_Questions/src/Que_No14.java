import java.util.Scanner;

//Question : Check the number is odd or even
public class Que_No14 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        if (number %2 ==0 ){
            System.out.println("Yes , the given number is even");
        }else {
            System.out.println("No , the given number is odd");
        }
    }
}
