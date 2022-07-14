import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest
{
    @Mock
    ICalculator mcalc;
    @InjectMocks
    Calculator calc = new Calculator(mcalc);
    @Test
    public void testCalcAdd()
    {
        doReturn(15.0).when(mcalc).add(10.0, 5.0);

        assertEquals(calc.add(10.0, 5.0), 15.0, 0);
        verify(mcalc).add(10.0, 5.0);

        //#2
        int cnt =
                Mockito.mockingDetails(mcalc)
                        .getInvocations()
                        .size();
        System.out.println(cnt);
        //#3
        RuntimeException exception = new RuntimeException ("Division by zero");
        doThrow(exception).when(mcalc).divide(15.0, 0);
        assertEquals(calc.divide(15.0, 0), 0.0, 0);
        verify(mcalc).divide(15.0, 0);
        //#4
        //when(calc.secret(10.0, 20.0)).thenReturn(230.0);
    }

}
