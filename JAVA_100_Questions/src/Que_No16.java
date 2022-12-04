/*
A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:

      1)Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.
      2)Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.
      3)Increment/Decrement: It increments or decrements the variable value. It is an optional condition.
      4)Statement: The statement of the loop is executed each time until the second condition is false.

 */

public class Que_No16 {
    public static void main(String [] args){
        //This loop will run 10 times
        for (int i =1 ;i<=10 ;i++){
            System.out.println(i);
        }
    }
}
