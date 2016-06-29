/*
 * A program to encode and decode words using the Atbash
 * cipher. 
 * Md. Riad Arifin 
 */

import java.util.Scanner;

public class Atbash {

    public static void main(String[] args) {

        //Creating some variables
        Scanner kbd = new Scanner(System.in);
        String message = "";
        while (!"quit".equals(message)) {
            System.out.print("Enter your message: ");
            message = kbd.nextLine();

            //to end the program when the message is quit
            if ("quit".equals(message)) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {

                //to ask user whether to encode or decode
                System.out.print("Are you encoding (1) or decoding (2)? ");
                int encodeOrDecode = kbd.nextInt();
                kbd.nextLine();
                String output = "";

                //to encode or decode the message
                for (int i = 0; i < message.length(); ++i) {

                    if ('a' <= message.charAt(i) && message.charAt(i) <= 'z') {
                        int x = message.charAt(i) - 'a';
                        x = 'z' - x;
                        char xc = (char) x;
                        output += xc;
                        // message = message.replace(message.charAt(i), xc);
                    } else if ('A' <= message.charAt(i) && message.charAt(i)
                            <= 'Z') {
                        
                        int x = message.charAt(i) - 'A';
                        x = 'Z' - x;
                        char xc = (char) x;
                        output += xc;
                        //message = message.replace(message.charAt(i), xc);
                    }

                }

                //display the encoded or decoded message
                if (encodeOrDecode == 1) {
                    System.out.println("Your encoded message: " + output);
                }
                if (encodeOrDecode == 2) {
                    System.out.println("Your decoded message: " + output);
                }
            }
            System.out.println();
        }
      }//end main()
}//end class Atbash
