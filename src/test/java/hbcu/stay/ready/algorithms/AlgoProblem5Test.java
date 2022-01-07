package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem5Test {

    @Test
    public void testOne(){
        AlgoProblem5 algoProblem5 = new AlgoProblem5();

        String expected = "Pfqjg Gzwi";
        String actual = algoProblem5.greatEncrypt("Kaleb Burd", 5);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem5 algoProblem5 = new AlgoProblem5();

        String expected = "Zgxow Nuuq";
        String actual = algoProblem5.greatEncrypt("Tariq Hook", 6);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem5 algoProblem5 = new AlgoProblem5();

        String expected = "Khoor, Zruog!";
        String actual = algoProblem5.greatEncrypt("Hello, World!", 3);

        Assertions.assertEquals(expected,actual);
    }



}
