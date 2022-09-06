package io.github.danilopiazza.spring.batch.oracle;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
    @Bean
    public Job job(JobBuilderFactory jobs, Step step) {
        return jobs.get("oracleSerializableTransactionJob")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
    }

    @Bean
    public Step step(StepBuilderFactory steps) {
        return steps.get("step")
                .tasklet(((contribution, chunkContext) -> null))
                .build();
    }
}
