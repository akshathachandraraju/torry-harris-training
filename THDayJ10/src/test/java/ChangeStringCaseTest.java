import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChangeStringCaseTest extends TestCase {
    ChangeStringCase stringCase=new ChangeStringCase();
@Before
    public void setUp() throws Exception {
        super.setUp();
    System.out.println("Before Test Case");
    stringCase =new ChangeStringCase();
    }
@After
    public void tearDown() throws Exception {
    System.out.println("End Test Case");
    }
@Test
    public void testToCapitalLetter() {
    Assert.assertEquals("ABC",stringCase.toCapitalLetter("abc"));
    }
@Test
    public void testToSmallLetter() {
    Assert.assertEquals("abc",stringCase.toSmallLetter("ABC"));
    }
}