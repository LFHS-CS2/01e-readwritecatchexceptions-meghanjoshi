import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 * The test class TestMain.
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testReadWrite();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testReadWrite() {

        try {
            Main.main(null);
            Scanner in1 = new Scanner(new FileReader("test.in"));
            Scanner in2 = new Scanner(new FileReader("test.out"));

            while (in1.hasNextLine() && in2.hasNextLine()) {
                String temp1 = in1.nextLine();
                String temp2 = in2.nextLine();
                assertEquals(temp1, temp2);

            }
            assertEquals("number of lines does not match", in1.hasNextLine(), in2.hasNextLine());

            in1.close();
            in2.close(); 
        } catch (Exception e) {
            fail(e.toString());
        }
    }

    
}
