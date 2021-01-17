/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author chase
 */
public class firstWordCapital {

    /**
     * @param args the command line arguments
     */
    
  public static void main(String[] args) {
      
      
      //This program displays a method in which to capitalize the first letter of 
      //every word in it's output
      
      

    // create a string
    String message = "{I'm hella gay, my niggas}";

    // stores each characters to a char array
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;

    for(int i = 0; i < charArray.length; i++) {

      // if the array element is a letter
      if(Character.isLetter(charArray[i])) {

        // check space is present before the letter
        if(foundSpace) {

          // change the letter into uppercase
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }

      else {
        // if the new character is not character
        foundSpace = true;
      }
    }

    // convert the char array to the string
    message = String.valueOf(charArray);
    System.out.println("Message: " + message);
  }
}
    
    

