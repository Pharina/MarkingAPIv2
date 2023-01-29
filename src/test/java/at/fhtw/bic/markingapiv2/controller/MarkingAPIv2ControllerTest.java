package at.fhtw.bic.markingapiv2.controller;

import at.fhtw.bic.markingapiv2.Controller.MarkingAPIv2Controller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MarkingAPIv2ControllerTest {
    @Test
    void calculateGrade() {
        var controller = new MarkingAPIv2Controller();
        var result1 = controller.calculateGrade(0);
        var result2 = controller.calculateGrade(50);
        var result3 = controller.calculateGrade(80);
        var result4 = controller.calculateGrade(110);

        assertEquals(result1, 5);
        assertEquals(result2, 4);
        assertEquals(result3, 2);
        assertNotEquals(result4, 1); //wrong input
    }

}
