import java.util.Scanner;

public class LoopsAndArrays {
    Scanner input = new Scanner(System.in);

    /**
     * For Loop
     * A for loop is used when the number of iterations is known beforehand. It iterates through
     * a block of code a specific number of times, often using a counter variable.
     * While Loop
     * A while loop continues to execute a block of code as long as its condition evaluates to true.
     * It is ideal when the number of iterations is not predetermined.
     */
      public void useWhileAndForLoop(){
          //Declare array using "new" operator S9
          String[] studentNames = new String[5];   //5 elements, index values 0 - 4

          int index = 0;
          //While loop to populate the array
          while(index < 5){   //index values of the array are 0 , 1, 2, 3, 4
              System.out.println("Enter the name of student: " + (index + 1) + ":");
              studentNames[index] = input.nextLine();
              index++;
          }

          //for loop to traverse and display each element value in the array
          System.out.println("\nStudent Name:");

          for(int i =0; i< studentNames.length; i++){
              System.out.println(studentNames[i]);
          }//end of for loop

      }

    /**
     * Nested loops occur when one loop is placed inside another, allowing the inner loop to complete all its iterations for each iteration
     * of the outer loop. This is useful for tasks like working with grids or matrices.
     */

    public void useNestedLoops(){
        for(int i = 1; i<=7; i++) {  //outer loop rows

            for(int j = 1; j<=5; j++){  //Inner loop for columns
                 System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * An enhanced for loop, also known as a "for-each" loop,
     * simplifies iterating through arrays or collections. It processes each element directly without using an index.
     */

    public void useEnhancedForLoop(){
        //Declare and initialize array in one step
        int[] numbers = {5, 10, 15, 20, 25};
        int total = 0;

        //enhanced for loop
        for (int num : numbers){
            total += num;
        }

        System.out.println("Total: " + total);
    }

    public void useArrayOutOfBoundExample(){
        //Declare and initialize array in one step
        int[] numbers = {5, 10, 15, 20, 25};  //Arrray contains 5 element index 0 - 4

        try{
            //Attempting to access an out-of-bound index
            System.out.println("Element at index 5: " + numbers[5]);
       }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: You tried to access an index that is out of bounds");
        }
        System.out.println("Program continues after handling the exception.");
    }

    /**
     * A do-while loop executes the code block at least once and then continues looping as long as the condition evaluates to true.
     * It ensures the loop body is executed before the condition is checked (the body is executed at least once)
     */

    public void useDoWhileLoop(){
        String correctPassword = "java123";
        String enteredPassword;

        do{
            System.out.println("Enter your password: ");
            enteredPassword = input.nextLine();
        }while(!enteredPassword.equals(correctPassword));

        System.out.println("Access Granted!");
    }

    /**
     * A sentinel-controlled loop runs until a specific sentinel value (e.g., -1) is
     * encountered, signaling the end of input. It is often used when collecting input data of an unknown size.
     *
     * Calculate the sum of numbers until the user enters -1.
     */

    public void useSentinelValue(){
        int sum = 0;
        int inputValue;
        System.out.println("Enter numbers to sum, or -1 to stop: ");

        while((inputValue = input.nextInt()) != -1){
            sum += inputValue;

        }
        System.out.println("Total sum: " + sum);

    }

    /**The break statement exits a loop immediately, regardless of the iteration count or condition.
     * It is useful for prematurely stopping a loop when a certain condition is met.
     *
     */
    public void useBreak(){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break;
            }//break will exit out of for and if statement
            System.out.println("i = " + i);
        }

    }

    /**
     * The continue statement skips the current iteration of a loop and proceeds
     * with the next iteration. It is helpful when specific cases should not be processed in a loop.
     */
    public void useContinue(){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                continue;
            }//break will exit out of for and if statement
            System.out.println("i = " + i);
        }

    }

}
