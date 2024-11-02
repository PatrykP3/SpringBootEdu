package org.nowpat.springbootedu.printer;

public class PrinterShort implements Printer {

    @Override
    public boolean canPrint(int length) {
        return length < 3;
    }

    @Override
    public void print(String s) {
        System.out.println("S: %s".formatted(s));
    }
}
