import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

import org.junit.jupiter.api.Test;

class PasswordGeneratorTest {

    private final PasswordSecurityChecker passwordSecurityChecker = new PasswordSecurityChecker("Secret");

    private final SetOfAlphabetsDigitsSpecialCharacters firstSetOfAlphabetsDigitsSpecialCharacters = new SetOfAlphabetsDigitsSpecialCharacters(true,false,false,false);
    private final SetOfAlphabetsDigitsSpecialCharacters secondSetOfAlphabetsDigitsSpecialCharacters = new SetOfAlphabetsDigitsSpecialCharacters(false,true,true,true);
    private final PasswordGenerator passwordGenerator = new PasswordGenerator(true,false,false,false);
//	private final PasswordSecurityChecker generatedPassword = passwordGenerator.GeneratePassword(4);

    @Test
    void test1() {
        assertEquals("Secret", passwordSecurityChecker.toString());
    }

    @Test
    void test2() {
        assertEquals(firstSetOfAlphabetsDigitsSpecialCharacters.getAlphabet(), SetOfAlphabetsDigitsSpecialCharacters.UPPERCASE_LETTERS);
    }

    @Test
    void test3() {
        assertEquals(secondSetOfAlphabetsDigitsSpecialCharacters.getAlphabet(), SetOfAlphabetsDigitsSpecialCharacters.LOWERCASE_LETTERS + SetOfAlphabetsDigitsSpecialCharacters.NUMBERS + SetOfAlphabetsDigitsSpecialCharacters.SYMBOLS);
    }

    @Test
    void test4() {
        assertEquals(passwordGenerator.setOfAlphabetsDigitsSpecialCharacters.getAlphabet(), SetOfAlphabetsDigitsSpecialCharacters.UPPERCASE_LETTERS);
    }

    @Test
    void test5() {
        assertEquals(passwordGenerator.setOfAlphabetsDigitsSpecialCharacters.getAlphabet().length(), 26);
    }

}
