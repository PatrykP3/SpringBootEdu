package org.nowpat.springbootedu.printer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrinterLong implements Printer {

    @Value("${processors.long.length}")
    Integer minLength;

    @Override
    public boolean canPrint(int length) {
        return length > minLength;
    }

    @Override
    public void print(String s) {
        System.out.println("L: %s".formatted(s));
    }
}
