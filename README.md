# dojo-template
This template can be used as a starting point for coding dojos, especially regarding test driven development.

## Write Tests
Test classes have to be named as configured in the pom.xml file. Otherwise `mvn clean test` will not pick up and run the tests.
```
<plugin>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>${maven.surefire.plugin}</version>
    <configuration>
        <includes>
            <include>**/Test*.java</include>
            <include>**/*Test.java</include>
            <include>**/*Tests.java</include>
            <include>**/*TestCase.java</include>
        </includes>
        <excludes>
            <exclude>**Main**</exclude>
        </excludes>
    </configuration>
</plugin>
```

## Run Tests
To run tests, either use IntelliJ built in test runner, or use `mvn clean test` which picks up all tests as configured in the pom.xml file.

## Java Version
This template project is configured to use Java 11.
