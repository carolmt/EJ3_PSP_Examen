package api;

import java.time.LocalDate;


public interface IDateService {

        LocalDate getCurrentDate();

        LocalDate getDatePlusNDays(int n);

        void updateSystemDate(Date newDate);
}
