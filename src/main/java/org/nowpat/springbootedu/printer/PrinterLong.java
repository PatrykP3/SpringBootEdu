package org.nowpat.springbootedu.printer;

public class PrinterLong implements Printer {
    @Override
    public boolean canPrint(int length) {
        return length > 3;
    }

    @Override
    public void print(String s) {
        System.out.println("L: %s".formatted(s));
    }
}
