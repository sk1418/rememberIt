package kent.android.mem;

import org.junit.After;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author: Kent
 * Created on 2015-01-26.
 */
public class BaseTest {
    protected static final Logger log = LoggerFactory.getLogger(BaseTest.class);
    private long startTime = System.currentTimeMillis();

    protected void testInfo(final String methodName) {
        log.debug("");
        log.debug("============================");
        log.debug(" Testing " + methodName);
        log.debug("============================");
    }

    @Before
    public void prepare() {
        startTime = System.currentTimeMillis();
    }

    @After
    public void endTest() {
        log.info("Elapsed: " + (System.currentTimeMillis() - startTime) + " ms.");
    }

    protected void print2dArray(String[][] input) {
        assert input != null;
        for (int i = 0; i < input.length; i++) {
           log.debug(Arrays.toString(input[i]));
        }
    }
}
