package kent.android.mem.challenge;

import kent.android.mem.BaseTest;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author: Kent
 * Created on 2015-01-26.
 */
public class ChallengeTest extends BaseTest{

    @Test
    public void testGenerateOriginalMatrix() {
        Challenge challenge = new Challenge(GameLevel.Master,7);
        print2dArray(challenge.getOriginal());
    }
}
