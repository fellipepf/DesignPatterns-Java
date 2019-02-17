package chain;

public class AHandler extends CharHandler {

    public AHandler(CharHandler sucessor) {
        super(sucessor);
    }

    public int getStatistic(String phrase, char c) {
        //	System.out.println("buscando a");
        int statistic = 0;
        if (c == 'A' || c == 'a') {
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == 'A' || phrase.charAt(i) == 'a') {
                    statistic++;
                }
            }
        } else {
            statistic = super.getStatistic(phrase, c);
        }
        return statistic;
    }

}
