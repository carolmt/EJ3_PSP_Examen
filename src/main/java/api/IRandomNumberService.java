package api;

import java.time.LocalDate;


public interface IRandomNumberService {

        int[] getRandomNumbers();
        int getRandomNumberWithDigits(int d);
        int getRandomNumberWithSameDigits(int numero);
}
