By default, Spring Batch uses the [`SERIALIZABLE`][1] transaction isolation
level then inserting new records into its meta-data tables.

The Oracle Database appears to raise an [`ORA-08177`][2] error under some
circumstances, even after fixing [Spring Batch issue #1127][3].

# Building

    mvn package

# Running

1. Start the Oracle Database instance:

       docker compose up

2. Run the executable JAR file in an endless loop:

       while true; do
         java -jar target/spring-batch-oracle-serializable-transaction-0.0.1-SNAPSHOT.jar
       done

3. Wait until an `ORA-08177` error occurs.

[1]: https://docs.spring.io/spring-batch/docs/current/reference/html/job.html#txConfigForJobRepository
[2]: https://docs.oracle.com/en/database/oracle/oracle-database/21/errmg/ORA-07500.html#GUID-575AEF1D-083A-4CA9-A116-FF027599C86B
[3]: https://github.com/spring-projects/spring-batch/issues/1127
