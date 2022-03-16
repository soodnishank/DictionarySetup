import org.junit.Assert;
import org.junit.Test;

public class DictionaryTest {

        @Test
        public void validateExistingWord() {
            Assert.assertEquals("Existing", true, Dictionary.isEnglishWord("know"));
        }
        @Test
        public void validateNonExistingWord() {Assert.assertEquals("Non Existing", false, Dictionary.isEnglishWord("rabi"));}
        @Test
        public void validateStringNumbersValue() {Assert.assertEquals("Numbers", false, Dictionary.isEnglishWord("796"));}
        @Test
        public void validateSpecialCharactersValue() {Assert.assertEquals("Special characters", false, Dictionary.isEnglishWord("&*^%$"));}
        @Test
        public void validateEmptyValue() {
            Assert.assertEquals("Empty", false, Dictionary.isEnglishWord(""));
        }
        @Test
        public void validateSpacesValue() {Assert.assertEquals("Space", false, Dictionary.isEnglishWord("     "));}

    }
