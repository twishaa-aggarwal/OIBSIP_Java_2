import java.util.Random;
import java.util.Scanner;
class trial
{
  public static void main (String[] args) {
  Random random = new Random();
  Scanner sc = new Scanner(System.in);
  int randomnumber = random.nextInt(101);
  System.out.println("Welcome to the guessing game! I have thought of a random number between 0 to 100, Can you guess what it is?!");
  System.out.println("Guess the number between 0 to 100");
  int usernumber = sc.nextInt();
  if (usernumber == randomnumber) {
    System.out.println("YOU GUESSED IT");
  }
  else{
    System.out.println("NOPE! WRONG");
  } 
  int count = 0;
  while (randomnumber != usernumber ) { 
    System.out.println("Guess again");
    int usernumber1 = sc.nextInt();
    if (usernumber1> randomnumber) {
      System.out.println("TOO HIGH");
      count ++;
    }
    if (usernumber1< randomnumber) {
      System.out.println("TOO LOW");
      count ++;
    }
    if (usernumber1 == randomnumber) {
      System.out.println("CONGRATULATIONS ! YOU GUESSED IT!!");
      count++;
      break;
    }
  
  }
  System.out.println("It took you " + count + " tries to get to the answer");
  if (count<5) {
    System.out.println("You are an A player! :) Good guessing champ!");
  }
  if (count>5) {
    System.out.println("Gotta work on your guessing skills bud :( took you so many tries");
  }
}
}