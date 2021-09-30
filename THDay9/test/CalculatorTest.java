import com.torryharris.testing.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest(){
        Calculator calculator=new Calculator();
        Assert.assertEquals(6,calculator.add(2,4));
    }
    @Test
    public void subTest(){
        Calculator calculator=new Calculator();
        Assert.assertEquals(3,calculator.sub(7,4));
    }
    @Test
    public void mulTest(){
        Calculator calculator=new Calculator();
        Assert.assertEquals(16,calculator.mul(4,4));
    }
    @Test
    public void divTest(){
        Calculator calculator=new Calculator();
        Assert.assertEquals(3,calculator.divi(9,3));
    }

}
