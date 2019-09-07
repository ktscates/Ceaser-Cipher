import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
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
}



