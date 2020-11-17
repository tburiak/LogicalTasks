public class Fibonacci {

    public long fib(int indexOf){
        if (indexOf < 0)
            throw new IllegalArgumentException("Input value should be more then 0");
        else if (indexOf == 0)
            return 0;
        else if (indexOf == 1)
            return 1;
        else
            return fib(indexOf - 1) + fib(indexOf - 2);
    }

}
