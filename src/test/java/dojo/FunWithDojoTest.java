package dojo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunWithDojoTest {

    private FunWithDojo funWithDojo;

    @BeforeEach
    void setup() {
        funWithDojo = new FunWithDojo();
    }

    @Test
    void shouldGiveTheOnlyValidAnswer() {
        assertEquals("TDD!", funWithDojo.getBestPractice(), "Programming best practice");
    }

    @Test
    void shouldHaveNoDoubtsThatDojoIsFun() {
        assertTrue(funWithDojo.isDojoFun(), "Dojos should be fun");
    }

}
