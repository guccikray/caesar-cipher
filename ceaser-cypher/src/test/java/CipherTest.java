import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CipherTest {

    @Test
    @DisplayName("cipher method test")
    public void testCipherMethod() {
        String message = "something different";
        int offset = 3;
        String expectedResult = "vrphwklqj gliihuhqw";
        String result = CipherUtil.cipherMessage(message, offset);

        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("decipher method test")
    public void testDecipherMethod() {
        String message = "upnoathyl jovpy";
        int offset = 7;
        String expectedResult = "nightmare choir";
        String result = CipherUtil.decipherMessage(message, offset);

        assertEquals(expectedResult, result);
    }
}
