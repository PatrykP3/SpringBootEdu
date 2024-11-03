package org.nowpat.springbootedu.runner;

import java.util.List;
import org.nowpat.springbootedu.processor.Processor;
import org.nowpat.springbootedu.reader.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    Reader reader;

    @Autowired
    private Processor processor;

    @Override
    public void run(String... args) {
        List<String> lines = reader.readFile(args[0]);
        processor.process(lines);
    }
}
