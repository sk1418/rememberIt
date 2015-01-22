package kent.android.mem.challenge;

/**
 * @author: Kent
 * Created on 2015-01-22.
 */
public enum GameLevel {
    Practice(true, true, true, 99),
    Easy(true, true, true, 99),
    Normal(true, true, true, 99),
    Expert(true, true, true, 99),
    Master(false, false, false, 999);

    private boolean sequenceNumOnly;
    private boolean provideCandidates;
    private boolean provideNumOption;
    private int maxNum;

    GameLevel(boolean sequenceNumOnly, boolean provideCandidates, boolean provideNumOption, int maxNum) {
        this.sequenceNumOnly = sequenceNumOnly;
        this.provideCandidates = provideCandidates;
        this.provideNumOption = provideNumOption;
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

    public boolean isProvideNumOption() {
        return provideNumOption;
    }

    public void setProvideNumOption(boolean provideNumOption) {
        if (this == Practice)
            this.provideNumOption = provideNumOption;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        if (this == Practice)
            this.maxNum = maxNum;
    }
}
