package api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping("/random")
public class RandomNumberController {
    private final IRandomNumberService randomNumberService;

    public RandomNumberController(IRandomNumberService randomNumberService) {
        this.randomNumberService = randomNumberService;
    }

    @GetMapping("/numeros")
    public int[] getRandomNumbers() {
        return randomNumberService.getRandomNumbers();
    }

    @GetMapping("/number/{d}")
    public int getRandomNumberWithDigits(@PathVariable int d) {
        return randomNumberService.getRandomNumberWithDigits(d);
    }

    @PutMapping("/number")
    public int getRandomNumberWithSameDigits(@RequestBody RandomNumber randomNumber) {
        return randomNumberService.getRandomNumberWithSameDigits(randomNumber.getRandom());
    }
}

