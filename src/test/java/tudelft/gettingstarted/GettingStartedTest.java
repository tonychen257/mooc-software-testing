package tudelft.gettingstarted;

import org.junit.jupiter.api.*;

public class GettingStartedTest {

    GettingStarted g;
    @BeforeEach
    public void setup() {
        g = new GettingStarted();
    }

    @Disabled
    @Timeout(1000)
    @Test
    public void addFiveTo20() {
        int result = g.addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = g.addFive(0);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void addFiveToMinus20() {
        int result = g.addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
