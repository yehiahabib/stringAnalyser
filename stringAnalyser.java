import java.util.Scanner;

public class stringAnalyser {
	
  public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);
    System.out.println("Enter a string:");
    String userInput = input.nextLine();
    input.close();
    
	System.out.println("The length of the string is " + userInput.length());
    System.out.println("The first character is " + userInput.charAt(0));
    System.out.println("The last character is " + userInput.charAt(userInput.length() - 1));
    
	int capitalLetters = 0;
    
	for (int x = 0; x < userInput.length(); x++) {
      if (Character.isUpperCase(userInput.charAt(x))) {
        capitalLetters++;
      }
    }
    System.out.println("The number of letters in upper case is " + capitalLetters);
  }
}
