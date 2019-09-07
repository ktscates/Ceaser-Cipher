import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException{

        boolean theProgramIsRunning = true;

        while (theProgramIsRunning){

            //Enable the user to choose an option
            Scanner option = new Scanner(System.in);
            System.out.println("Welcome to the Ceaser Cipher Application. Choose one of the following options: Encrypt, Decrypt, or Exit");



            String choice = option.nextLine();

            if (choice.equals("Encrypt")){

                //Input the plain text
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a word: ");
                String plainText = input.nextLine();
                System.out.println("The plain text is: " + plainText);

                //Input the key or shift
                Scanner inputKey = new Scanner(System.in);
                System.out.println("Enter a Shift: ");
                int key = Integer.parseInt((inputKey.nextLine()));
                System.out.println("The shift is: " + key);

                //Output Ciphered text
                System.out.println("The Cipher text is: " + Encrypt.encryption(plainText, key));
            }
            else if (choice.equals("Decrypt")){

                //Input the cipher text
                Scanner cipherInput = new Scanner(System.in);
                System.out.println("Enter a word: ");
                String cipherText = cipherInput.nextLine();
                System.out.println("The plain text is: " + cipherText);

                //Input the key or shift
                Scanner inputShift = new Scanner(System.in);
                System.out.println("Enter a Shift: ");
                int shift = Integer.parseInt((inputShift.nextLine()));
                System.out.println("The shift is: " + shift);

                //Output Ciphered text
                System.out.println("The Plain text is: " + Decrypt.decryption(cipherText, shift));
            }
            else if (choice.equals("Exit")){

                System.out.println("Goodbye, Thank you!");
                theProgramIsRunning = false;
            }
            else {

                System.out.println("We are sorry, this option does not exit. Please try again later!");
            }
        }
    }
}



