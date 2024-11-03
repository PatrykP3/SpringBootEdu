package org.nowpat.springbootedu.printer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrinterShort implements Printer {

    @Value("${processors.short.length}")
    Integer maxLength;

    @Override
    public boolean canPrint(int length) {
        return length < maxLength;
    }

    @Override
    public void print(String s) {
        System.out.println("S: %s".formatted(s));
    }
}
