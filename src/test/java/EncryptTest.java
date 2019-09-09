import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EncryptTest {

    @Test
    public void testEncrypt_testWord_String(){
        Encrypt testingEncrypt = new Encrypt();
        assertEquals(true, testingEncrypt instanceof Encrypt);
    }

}
