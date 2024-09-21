package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testIsCubeEqualToThreeTimes() {
        App app = new App();

        // Test case: number 1, cube of 1 == 1 * 3 => 1 != 3
        assertFalse(app.isCubeEqualToThreeTimes(1), "Cube of 1 should not be equal to 3 times 1");

        // Test case: number 0, cube of 0 == 0 * 3 => 0 == 0
        assertTrue(app.isCubeEqualToThreeTimes(0), "Cube of 0 should be equal to 3 times 0");

        // Test case: number 3, cube of 3 == 27, 3 * 3 = 9 => 27 != 9
        assertFalse(app.isCubeEqualToThreeTimes(3), "Cube of 3 should not be equal to 3 times 3");

        // Test case: number -3, cube of -3 == -27, -3 * 3 = -9 => -27 != -9
        assertFalse(app.isCubeEqualToThreeTimes(-3), "Cube of -3 should not be equal to 3 times -3");
    }
}
