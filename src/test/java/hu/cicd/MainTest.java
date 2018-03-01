package hu.cicd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test
    public void testAddShouldAddtwoNumbers(){
        // given
        int a = 1;
        int b = 2;

        int expected = 3;

        // when
        int result = main.add(a,b);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void testGonnaFail(){
        // given
        int a = 1;
        int b = 222;

        int expected = 223;

        // when
        int result = main.add(a,b);

        // then
        assertEquals(expected, result);
    }

}
