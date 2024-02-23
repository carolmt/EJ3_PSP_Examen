package api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


@RestController
public class DateController
{
    @Autowired
    private IDateService productService;

    @GetMapping(value = "/api/date")
    public LocalDate getCurrentDate() {
        return productService.getCurrentDate();
    }

    @GetMapping(value = "/api/date/{n}")
    public LocalDate getDatePlusNDays(int n) {
        return productService.getDatePlusNDays(n);
    }

    @PostMapping(value = "/api/date")
    public void updateSystemDate(Date newDate) {
        productService.updateSystemDate(newDate);
    }
}