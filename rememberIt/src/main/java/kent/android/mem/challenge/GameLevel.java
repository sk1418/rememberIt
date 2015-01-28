package kent.android.mem.challenge;

/**
 * @author: Kent
 * Created on 2015-01-22.
 */
public enum GameLevel {
    Practice(true, true, 99),
    Easy(true, true, 99),
    Normal(false, true, 99),
    Expert(false, false, 99),
    Master(false, false, 999);

    //if numbers are only sequence number from 1
    private boolean sequenceNumOnly;
    //if provide number candidate when user tries to resolve the challenge
    private boolean provideCandidates;
    //max number could be used by challenge
    private int maxNum;

    GameLevel(boolean sequenceNumOnly, boolean provideCandidates, int maxNum) {
        this.sequenceNumOnly = sequenceNumOnly;
        this.provideCandidates = provideCandidates;
        this.maxNum = maxNum;
    }

    public boolean isSequenceNumOnly() {
        return sequenceNumOnly;
    }

    public void setSequenceNumOnly(boolean sequenceNumOnly) {
        if (this == Practice)
            this.sequenceNumOnly = sequenceNumOnly;
    }

    public boolean isProvideCandidates() {
        return provideCandidates;
    }

    public void setProvideCandidates(boolean provideCandidates) {
        if (this == Practice)
            this.provideCandidates = provideCandidates;
    }


    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        if (this == Practice)
            this.maxNum = maxNum;
    }
}
