//Question : while loop using break and continue program in java

      /*
      Continue:
                 The continue statement in Java is used to skip the current iteration of a loop.
                 We can use continue statement inside any types of loops such as for, while, and do-while loop.
                 Basically continue statements are used in the situations when we want to continue the loop but do not want the remaining statement after the continue statement.

      Syntax:
                 continue;

       */

public class Que_No22 {
    public static void main(String [] args){
        for (int i = 0; i<100 ;i++){
            if (i%2!=0)  // In this if the condition becomes true then this will skip to the other parts and start from the beginning of the loop.
            {
                continue;
            }else {
                System.out.print( i +" ");
            }
            if (i==20) // As this condition hits true it will break the loop.
            {
                break;
            }
        }
    }

}
