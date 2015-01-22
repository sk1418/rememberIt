package kent.android.mem.challenge;

/**
 * @author: Kent
 * Created on 2015-01-22.
 */

public class Challenge {
    private GameLevel level;
    private int dimension = 3;
    private String[][] original;
    private String[][] answer;


    public Challenge(GameLevel level, int dimension) {
        this.level = level;
        this.dimension = dimension;
    }
}
