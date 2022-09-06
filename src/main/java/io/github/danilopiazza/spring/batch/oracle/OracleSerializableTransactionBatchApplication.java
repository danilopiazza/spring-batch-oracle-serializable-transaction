package io.github.danilopiazza.spring.batch.oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OracleSerializableTransactionBatchApplication {
    public static void main(String[] args) {
        System.exit(SpringApplication.exit(SpringApplication.run(OracleSerializableTransactionBatchApplication.class, args)));
    }
}
