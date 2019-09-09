import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DecryptTest {

    @Test
    public void testDecrypt_testWord_String(){
        Decrypt testingDecrypt = new Decrypt();
        assertEquals(true, testingDecrypt instanceof Decrypt);
    }

}