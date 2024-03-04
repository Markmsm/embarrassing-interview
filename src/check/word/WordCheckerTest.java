package check.word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordCheckerTest {

    @Test
    void wordCheckerShouldRemoveDuplicityOfSanduicheWord() {
        // Given:
        String sanduiche = "sanduicheiche";
        String expectedResult = "sanduiche";

        // When:
        String result = WordChecker.checkWord(sanduiche);

        // Then:
        assertEquals(expectedResult, result);
    }
}