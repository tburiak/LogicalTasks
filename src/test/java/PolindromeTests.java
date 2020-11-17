import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolindromeTests {

    Polindrome polindrome = new Polindrome();

    @Test
    void testValidatePolindromeViaLoop(){
        Assertions.assertTrue(polindrome.isPolindromeViaLoop("radar"));
    }

    @Test
    void testValidatePolindromeViaLoopNegative(){
        Assertions.assertFalse(polindrome.isPolindromeViaLoop("ticket"));
    }

    @Test
    void testValidatePolindromeViaBuilder(){
        Assertions.assertTrue(polindrome.isPolindromeViaBuilder("radar"));
    }

    @Test
    void testValidatePolindromeViaBuilderNegative(){
        Assertions.assertFalse(polindrome.isPolindromeViaBuilder("ticket"));
    }

}
