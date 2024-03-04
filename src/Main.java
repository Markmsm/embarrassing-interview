import check.word.WordChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(WordChecker.checkWord(scanner.next()));

        scanner.close();
    }
}