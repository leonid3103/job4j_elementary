package tracker;

interface Input {
    String askStr(String answer);

    int askInt(String question);
    int askInt(String question, int max);

}