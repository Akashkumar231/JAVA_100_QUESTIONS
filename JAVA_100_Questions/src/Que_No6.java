import java.util.Scanner;

//Question: How to swap two numbers using third variable
public class Que_No6 {
    public static void main(String [] args){
        int first_Number = 45;
        int second_Number = 56;
        int temp;
        temp =first_Number; // temp variable will store the value of first variable
        first_Number = second_Number; //  int first variable the second number will be placed.
        second_Number=temp; // and in the second variable the value of temp variable which is storing the value of first variable will be placed.
        System.out.println(first_Number);
        System.out.println(second_Number);
    }
}
