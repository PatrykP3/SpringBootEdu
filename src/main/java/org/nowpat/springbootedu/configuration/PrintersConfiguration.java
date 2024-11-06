package org.nowpat.springbootedu.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("printers")
@ConfigurationPropertiesScan
@Getter
@Setter
public class PrintersConfiguration {

    private PrinterLong printerLong;
}
