import java.util.Scanner;

public class App {

    public static void main(String[] args){

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
}



