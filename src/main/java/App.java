import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        //The code execution
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String plainText = input.nextLine();
        System.out.println("The plain text is: " + plainText);
        int key = 3;
//        System.out.println("Text  : " + );
        System.out.println("Shift : " + key);
        System.out.println("Cipher: " + Encrypt.encryption(plainText, key));

    }
}



