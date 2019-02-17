package chain;

public class SpaceHandler extends CharHandler {

    public SpaceHandler(CharHandler sucessor) {
        super(sucessor);
    }

    public int getStatistic(String phrase, char c) {
        int statistic = 0;
        if (c == ' ') {
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == ' ') {
                    statistic++;
                }
            }
        } else {
            statistic = super.getStatistic(phrase, c);
        }
        return statistic;
    }
}
