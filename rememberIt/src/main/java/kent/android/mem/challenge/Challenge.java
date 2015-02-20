package kent.android.mem.challenge;

import com.google.common.collect.Lists;

import java.io.Serializable;
import java.util.*;

/**
 * @author: Kent
 * Created on 2015-01-22.
 */

public class Challenge implements Serializable{

    private GameLevel level;
    private int length = 3;
    private String[][] original;
    private String[][] answer;
    private long duration;


    /**
     *
     * @param level GameLevel
     * @param length the length of the challenge matrix e.g. length =3 for a 3x3 matrix
     */
    public Challenge(GameLevel level, int length) {
        this.level = level;
        this.length = length;
        //generate the number matrix
        generateOrignalMatrix();
    }

    public boolean checkAnswer() {
        assert answer != null;
        return Arrays.equals(original, answer);
    }

    /**
     * generate random numbers and fill original matrix
     */
    private void generateOrignalMatrix() {
        int max = level.isSequenceNumOnly() ? length * length : level.getMaxNum();
        List<Integer> candidates = Lists.newArrayList();

        //get number list
        if (level.isSequenceNumOnly()) {
            for (int i = 1; i <= length * length; i++) {
                candidates.add(i);
            }
        } else {
            Random r = new Random();

            for (int i = 1; i <= length * length; i++) {
                int random = r.nextInt(max - 1) + 1;
                candidates.add(random);
            }
        }

        //fill the matrix
        Collections.shuffle(candidates, new Random());
        Iterator<Integer> it = candidates.iterator();
        original = new String[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                original[i][j] = String.valueOf(it.next());
            }
        }


    }


    public String[][] getOriginal() {
        return original;
    }

    public void setAnswer(String[][] answer) {
        this.answer = answer;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public int getLength() {
        return length;
    }
}
