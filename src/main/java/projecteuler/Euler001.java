package projecteuler;

import java.util.stream.IntStream;

class Euler001 {
    int calculate() {
        return IntStream.range(1, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }
}
