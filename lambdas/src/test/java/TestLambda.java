import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLambda {
    private final static String TEST_STRING="ПЕРВЫЙ МЕТОД";
    private final static double TEST_ONE1=2.0;
    private final static double TEST_ONE2=2.0;
    private final static double TEST_ONE3=4.0;
    private final static double DELTA = 1e-15;

    @Test
    public void oneTest(){
        Zero tZero = new Zero(){
            public String doSomething() {
                return TEST_STRING;
            }
        };
        assertEquals(TEST_STRING,tZero.doSomething());
    }
    @Test
    public void twoTest(){
        One tOne = new One(){
            public double doSomething1(double TEST_ONE1) {
                return Math.pow(TEST_ONE1,TEST_ONE2);
            }
        };
        assertEquals(TEST_ONE3,tOne.doSomething1(TEST_ONE1),DELTA);
    }
    @Test
    public void treeTest() {
        Two tTwo = new Two() {
            public double doSomething2(double TEST_ONE1, double TEST_ONE2) {
                return TEST_ONE1 + TEST_ONE2;
            }
        };
        assertEquals(TEST_ONE3, tTwo.doSomething2(TEST_ONE1, TEST_ONE2), DELTA);
        ;
    }
    @Test
    public void fourTest(){
       LambdaProgram.mOne(TEST_ONE1, (a)-> Math.pow(a,TEST_ONE2));
        }
    @Test
    public void fiveTest(){
        LambdaProgram.mTwo(TEST_ONE1,TEST_ONE2,(a,b)->a+b);
    }
}
