import java.util.Scanner;
/**
 * Tells the user if their number is odd or even
 * @author Thomas Quigley
 */
public class Main {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // gets the users number
    System.out.println("Please enter an integer:");
    int userInt = input.nextInt();

    // figures out if it even or odd and tells the user
    int remainder = userInt % 2;
    if (remainder == 1 || remainder == -1) {
      System.out.println(userInt + " is an odd number");
    } else {
      System.out.println(userInt + " is an even number");
    }
    
    
  }
}
