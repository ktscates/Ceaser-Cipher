public class Encrypt {

    public String Encrypt(String plainText, int key){

        //Declare the alphabet
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //Find character in the alphabet
        StringBuilder encrypt = new StringBuilder(plainText);
        for(int i = 0; i < encrypt.length; i++){
            char plainChar = encrypt.charAt(i);
            int plainIndex = alphabet.indexOf(plainChar);
        }
    }

}
