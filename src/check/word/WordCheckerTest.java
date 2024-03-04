package check.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCheckerTest {

    @Test
    void wordCheckerShouldRemoveDuplicityInSanduicheWord() {
        // Given:
        final String sanduiche = "sanduicheiche";
        final String expectedResult = "sanduiche";

        // When:
        final String result = WordChecker.checkWord(sanduiche);

        // Then:
        assertEquals(expectedResult, result);
    }

    @Test
    void wordCheckerShouldRemoveDuplicityInBarrilWord() {
        // Given:
        final String sanduiche = "barrilarril";
        final String expectedResult = "barril";

        // When:
        final String result = WordChecker.checkWord(sanduiche);

        // Then:
        assertEquals(expectedResult, result);
    }
}