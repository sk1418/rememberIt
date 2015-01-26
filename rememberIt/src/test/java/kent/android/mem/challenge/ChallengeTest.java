package kent.android.mem.challenge;

import kent.android.mem.BaseTest;
import org.junit.Test;
/**
 * @author: Kent
 * Created on 2015-01-26.
 */
public class ChallengeTest extends BaseTest{

    @Test
    public void testGenerateOriginalMatrix() {
        Challenge challenge = new Challenge(GameLevel.Master,10);
        print2dArray(challenge.getOriginal());
    }
}
