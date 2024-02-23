package api;
import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class DateService implements IDateService
{
    private LocalDate systemDate = LocalDate.now();

    public LocalDate getCurrentDate() {
        return systemDate;
    }

    public LocalDate getDatePlusNDays(int n) {
        return systemDate.plusDays(n);
    }

    public void updateSystemDate(Date newDate) {
        int day = newDate.getDay();
        int month = newDate.getMonth();
        int year = newDate.getYear();

    }
}