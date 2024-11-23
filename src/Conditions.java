import java.util.Scanner;

public class Conditions {
    //Global variable
    Scanner input = new Scanner(System.in);

 /**
  * A One-Way if statement is a control structure used to execute a block of
  * code only if a specific condition evaluates to true.
  * If the condition is false, the code within the if block is
  * skipped, and the program continues executing subsequent statements.
  */

 public void useOneWayIf(){
     boolean messageArrived = true;

     //One-way if statement
     if(messageArrived){
         sendNotification();
     }
 }

 public void sendNotification(){
     System.out.println("Notification sent:  You have a new message");
 }

    /**
     *A two-way `if-else` statement allows the program to execute one block of code if a
     * condition is true and a different block of code if the condition is false.
     * It provides a clear way to handle mutually exclusive outcomes based on a single condition.
     *
     * A mutually exclusive outcome means that only one of the possible results can occur at a time.
     * For example, if you're deciding whether a number is even or odd, it can only be one or the other—never both.
     */

    public void checkForEvenOdd(){
        int number = 25;
        if(number % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }

    public void validateUserAccess(){
        System.out.println("Enter your user role: ");
        String userRole = input.nextLine();

        //Two-way if-else statement
        if(userRole.equalsIgnoreCase("Admin")){
            grantAccess();
        }else{
            denyAccess();
        }
    }

    public void grantAccess(){
        System.out.println("Access granted:  You have full permissions");
    }

    public void denyAccess(){
        System.out.println("Access denied:  You do not have full permissions");
    }

    /**
     * - The conditional operator (`? :`) is a shorthand for `if-else`:
     */

    public void useConditionalOperator(){
        System.out.println("Enter your role");
        String userRole= input.nextLine();

        String message = userRole.equalsIgnoreCase("Admin") ? grantAccessConditional() : denyAccessConditional();

        System.out.println(message);

    }

    public String grantAccessConditional(){
        System.out.println("Performing grant access logic...");
        return "Access granted:You have full permissions";
    }

    public String denyAccessConditional(){
        System.out.println("Performing deny access logic...");
        return "Access denied :You do not have full permissions";
    }

    /**
     * A nested if-else statement is an if-else structure placed inside another if or else block. It allows the program to evaluate
     * additional conditions within the original condition's true or false paths, enabling more complex decision-making.
     *
     * Scenario: A store offers discounts based on both membership level and total purchase amount.
     */

    public void useNestedIf(){
        String memberShipLevel = "Silver";
        double purchaseAmount = 100.00;

        //Nested if
        if(memberShipLevel.equalsIgnoreCase("Gold")){
            if(purchaseAmount >= 100){
                System.out.println("You receive a 20% discount");
            }else {
                System.out.println("You receive a 10% discount");
            }
        }else {
            System.out.println("No membership detected:  No discount");
        }
    }

    /**
     *A chained if-else statement evaluates multiple conditions sequentially until one is true,
     * executing the corresponding block of code. If none of the conditions are true, it often
     * ends with an else block to handle all remaining cases.
     *
     * Chained `if-else` statements provide a cleaner, more readable way to check multiple conditions sequentially.
     */

    public void useChainedIf(){

        int hour = 23;

        //Chained if-else
        if(hour >= 6 && hour < 11){   //&& provides a range
            System.out.println("It's breakfast time!");
        }else if(hour >=11 && hour < 15){
            System.out.println("It's lunch time!");
        }else if(hour >=18 && hour < 22){
            System.out.println("It's dinner time!");
        }else {
            System.out.println("It's snack time!");
        }

    }

    public void useCaseSwitch(){

        String output;
        // grade is a value 0 - 100
        int grade = 50;
        switch (grade / 10)
        {
            case 10: output = "Wow! You got an A+ ; ";   break;
            case 9: output = "Excellent! A-"; break;
            case 8: output = "Very Good! B+" ; break;
            case 7: output = "Good!"; break;
            default: output = "Keep trying!"; break;
        }//end of switch
        System.out.println(output);

    }
   enum FamousArtists {
        JACOB_LAWRENCE,
        AUGUSTA_SAVAGE,
        ROMARE_BEARDEN,
        JEAN_MICHEL_BASQUIAT,
        FAITH_RINGGOLD,
        KARA_WALKER;
    }

    public void useEnumWithCase() {
        // Declaring Enum variable
        FamousArtists artist;

        // Assigning a value to the Enum variable
        artist = FamousArtists.JACOB_LAWRENCE;

        // Switch statement for artist choices
        switch (artist) {
            case JACOB_LAWRENCE:
                System.out.println("You chose Jacob Lawrence, known for 'The Migration Series' depicting the Great Migration.");
                break;
            case AUGUSTA_SAVAGE:
                System.out.println("You chose Augusta Savage, a sculptor and activist who created 'The Harp' for the 1939 World's Fair.");
                break;
            case ROMARE_BEARDEN:
                System.out.println("You chose Romare Bearden, famous for his innovative collages and depiction of culture.");
                break;
            case JEAN_MICHEL_BASQUIAT:
                System.out.println("You chose Jean-Michel Basquiat, a neo-expressionist known for his dynamic and political street art.");
                break;
            case FAITH_RINGGOLD:
                System.out.println("You chose Faith Ringgold, celebrated for her story quilts like 'Tar Beach'.");
                break;
            case KARA_WALKER:
                System.out.println("You chose Kara Walker, known for her powerful silhouettes exploring history and identity.");
                break;
            default:
                System.out.println("This artist is not in the list!");
                break;
        }

    }





}
