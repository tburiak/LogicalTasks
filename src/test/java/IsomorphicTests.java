import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsomorphicTests {

    Isomorphic isomorphic = new Isomorphic();

    @Test
    void testIsomorphic() {
        Assertions.assertTrue(isomorphic.isIsomorphic("egg", "add"));
    }

    @Test
    void testIsomorphicNegative() {
        Assertions.assertFalse(isomorphic.isIsomorphic("foo", "bar"));
    }

    @Test
    void testIsomorphicWithDifferentLength() {
        Assertions.assertFalse(isomorphic.isIsomorphic("stop", "create"));
    }
}
