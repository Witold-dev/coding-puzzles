package projecteuler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Euler001Test {

    private final int EXPECTED_RESULT = 233_168;

    @Test
    void testCalculation() {
        assertEquals(EXPECTED_RESULT, new Euler001().calculate());
    }
}
