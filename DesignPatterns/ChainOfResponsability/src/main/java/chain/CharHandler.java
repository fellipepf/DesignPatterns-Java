package chain;

public abstract class CharHandler {

    private CharHandler sucessor = null;

    public CharHandler(CharHandler sucessor) {
        this.sucessor = sucessor;
    }

    public int getStatistic(String phrase, char c) {
        int statistic = -1;

        if (sucessor != null) {
            statistic = sucessor.getStatistic(phrase, c);
        }
        return statistic;
    }

    public static CharHandler getCharHandler() {
        return new AHandler(new PointHandler(new SpaceHandler(null)));
    }

}
