public class App {

    public static void main(String[] args)
    {
        //The code execution
        String plainText = "CATES";
        int key = 3;
        System.out.println("Text  : " + plainText);
        System.out.println("Shift : " + key);
        System.out.println("Cipher: " + Encrypt.encryption(plainText, key));

    }
}



