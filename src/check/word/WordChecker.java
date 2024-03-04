package check.word;

public class WordChecker {
    public static String checkWord(String word) {
        for (int i = 0; i < word.length(); i++) {
            if(((word.length() - i) % 2) != 0) continue;

            final String substringToCompare = word.substring(i, word.length());
            final String wordInitToCompare = substringToCompare.substring(0, (substringToCompare.length() / 2));
            final String wordEndToCompare = substringToCompare.substring(substringToCompare.length() / 2);

            if (isTwoStringsEqual(wordInitToCompare, wordEndToCompare)) {
                return word.substring(0, (word.length() - wordEndToCompare.length()));
            }
        }

        return word;
    }

    private static boolean isTwoStringsEqual(String a, String b) {
        return a.compareTo(b) == 0;
    }
}
