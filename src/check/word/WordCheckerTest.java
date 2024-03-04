package check.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCheckerTest {

    @Test
    void wordCheckerShouldRemoveDuplicityInSanduicheWord() {
        // Given:
        final String incorrectWord = "sanduicheiche";
        final String expectedResult = "sanduiche";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInBarrilWord() {
        // Given:
        final String incorrectWord = "barrilarril";
        final String expectedResult = "barril";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInRatoWord() {
        // Given:
        final String incorrectWord = "ratoato";
        final String expectedResult = "rato";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInSolWord() {
        // Given:
        final String incorrectWord = "sol";
        final String expectedResult = "sol";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInColiseuWord() {
        // Given:
        final String incorrectWord = "coliseueu";
        final String expectedResult = "coliseu";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInQueijoWord() {
        // Given:
        final String incorrectWord = "queijoijo";
        final String expectedResult = "queijo";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInAstroWord() {
        // Given:
        final String incorrectWord = "astroastro";
        final String expectedResult = "astro";

        // When:
        final String result = WordChecker.checkWord(incorrectWord);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInAChar() {
        // Given:
        final String incorrectChar = "a";
        final String expectedResult = "a";

        // When:
        final String result = WordChecker.checkWord(incorrectChar);

        // Then:
        assertEquals(expectedResult, result);
    }

}