package lxz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    long startTime;
    long target = 50l;

    @Before
    public void countDown() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void countUp() {
        long endTime = System.currentTimeMillis();
        System.out.println("time used: " + (endTime - startTime));
    }

    @Test
    public void testCal1(){
        long answer = Fibonacci.cal1(target);
        System.out.println("the answer is: " + answer);
    }


    @Test
    public void tetCal2(){
        long result = Fibonacci.cal2(target);
        System.out.println("cal2 return: " + result);
    }
}
