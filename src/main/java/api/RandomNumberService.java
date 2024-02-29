package api;
import java.time.LocalDate;
import java.util.Random;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

@Service
public class RandomNumberService implements IRandomNumberService {

    private Random random = new Random();

    @Override
    public int[] getRandomNumbers() {
        return IntStream.range(0, 100).map(i -> random.nextInt(100)).toArray();
    }

    @Override
    public int getRandomNumberWithDigits(int d) {
        int lowerBound = (int) Math.pow(10, d - 1);
        int upperBound = (int) Math.pow(10, d) - 1;
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }

    @Override
    public int getRandomNumberWithSameDigits(int numero){
        int digitos = (int) Math.log10(numero)+1;
        return getRandomNumberWithSameDigits(digitos);
    }
}