package org.nowpat.springbootedu.configuration;

import org.nowpat.springbootedu.printer.Printer;
import org.nowpat.springbootedu.printer.PrinterLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterLongConfiguration {

    @Autowired
    private PrintersConfiguration printersConfiguration;

    @Bean
    public Printer printerLong() {
        return new PrinterLong(printersConfiguration);
    }
}
