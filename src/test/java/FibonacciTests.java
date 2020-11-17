import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTests {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void testFibonacci(){
        Assertions.assertEquals(34, fibonacci.fib(9));
    }

    @Test
    void testFibonacciWithZero(){
        Assertions.assertEquals( 0, fibonacci.fib(0));
    }

    @Test
    void testFibonacciWithOne(){
        Assertions.assertEquals(1, fibonacci.fib(1));
    }

    @Test
    void testFibonacciWith2(){
        Assertions.assertEquals(1, fibonacci.fib(2));
    }

    @Test
    void testFibonacciExceptionThrown(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
                () -> fibonacci.fib(-1)
        );
        String actualExceptionMessage = exception.getMessage();
        String expectedExceptionMessage = "Input value should be more then 0";
        Assertions.assertEquals(expectedExceptionMessage, actualExceptionMessage);
    }
}
