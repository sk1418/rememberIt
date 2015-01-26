package kent.android.mem.challenge;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

/**
 * @author: Kent
 * Created on 2015-01-22.
 */

public class Challenge {
    private GameLevel level;
    private int length = 3;
    private String[][] original;
    private String[][] answer;


    public Challenge(GameLevel level, int length) {
        this.level = level;
        this.length = length;
        generateOrignalMatrix();
    }

    private void generateOrignalMatrix() {
        int max = level.isSequenceNumOnly()?length*length:level.getMaxNum();
        List<Integer> candidates = Lists.newArrayList();

        //get number list
        if (level.isSequenceNumOnly()) {
            for (int i = 1; i <= length * length; i++) {
                candidates.add(i);
            }
        }
        else {
            Random r = new Random();

			for (int i = 1; i <= length * length; i++) {
                int random = r.nextInt(max - 1) + 1;
                candidates.add(i);
            }
        }

        //fill the matrix
        Collections.shuffle(candidates, new Random() );
        Iterator<Integer> it = candidates.iterator();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
               original[i][j]  = String.valueOf( it.next());
            }
        }

    }
}
