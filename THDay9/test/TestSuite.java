import com.torryharris.testing.Calculator;
import com.torryharris.testing.ChangeStringCaseTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
// list the all test classes
@Suite.SuiteClasses({
        CalculatorTest.class,
        ChangeStringCaseTest.class
})
public class TestSuite {


}
