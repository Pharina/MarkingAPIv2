package at.fhtw.bic.markingapiv2.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkingAPIv2Controller {
    @GetMapping("api/marking")
    public int calculateGrade(@RequestParam int percentage) {
        if (0 <= percentage && percentage < 50) {
            return 5;
        }
        else if (percentage < 63) {
            return 4;
        }
        else if (percentage < 75) {
            return 3;
        }
        else if (percentage < 88) {
            return 2;
        }
        else if (percentage <= 100) {
            return 1;
        }
        return -1; // wrong input
    }
}
