import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckStringLengthTest {
    @Test
    public void lttwentyCheck(){
        //Given
        String testString = "hhhhhhhggghhhhhhhhhhhhh";
        //when
        boolean result = CheckStringLengthApp.lttwenty(testString);
        //then
        assertEquals(true, result);
    }


    @Test
    public void additionof2numbers(){
        //Given
        int a=5;
        int b=5;
        //when
        int result = CheckStringLengthApp.sum(a, b);
        //then
        assertEquals(10, result);
    }

    @Test
    public void greater100(){
        //Given
        int a=101;
        int b=6;
        //when
        boolean result = CheckStringLengthApp.check100(a, b);
        //then
        assertEquals(true, result);
    }


}


