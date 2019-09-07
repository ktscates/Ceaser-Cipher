public class Decrypt {

    public static StringBuffer decryption(String cipherText, int key){

        //Decrypt the text
        StringBuffer decrypt = new StringBuffer();
        for (int j = 0; j < cipherText.length(); j++){

            //Check if text is upper case
            if (Character.isUpperCase(cipherText.charAt(j))){
                char d = (char) (((int)cipherText.charAt(j) + key -65) % 26 - 65);
                decrypt.append(d);

                //Check if text is lower case
            } else {
                char d = (char) (((int)cipherText.charAt(j) + key -97) % 26 - 97);
                decrypt.append(d);

            }
        }

        return decrypt;

    }
}
