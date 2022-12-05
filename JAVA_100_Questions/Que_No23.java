//Question: Print all the alphabets using for loop program in java
 /*
 Type casting is when you assign a value of one primitive data type to another type.

        In Java, there are two types of casting:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte

  */

public class Que_No23 {
    public static void main(String [] args){
        // Here we used the ASCII value of a=97 to z=122

        for (int i = 97 ;i<=122 ;i++){
            System.out.print((char)i + " "); // Here we have performed Type Casting.
        }
    }
}
