//Question: How to convert Fahrenheit to Celsius.
import java.util.Scanner;
public class Que_No5 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        float fahrenheit = input.nextFloat();
        float celsius =  (fahrenheit-32)*(5.0f/9.0f);
        System.out.println("The Celsius value for given fahrenheit is : "+celsius);
    }
}
