package pl.mpas.advanced_programing2.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) {
        AtomicInteger i = new AtomicInteger();

        Runnable job = () -> {
            i.incrementAndGet(); //++i
            i.getAndIncrement(); //i++

            int currentValue;
            do {
                currentValue = i.intValue();

            } while ( !i.compareAndSet(currentValue, currentValue + 2));
        };
    }
}
