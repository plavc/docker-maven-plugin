# Docker Maven Plugin

[![Build Status](https://travis-ci.org/plavc/docker-maven-plugin.svg?branch=develop)](https://travis-ci.org/plavc/docker-maven-plugin)

Docker Maven Plugin wraps Docker CLI and enables execution of docker commands with Maven. 
Commands are configured through plugin's configuration.

**Plugin usage:**

```$xml
<plugin>
    <groupId>net.plavcak</groupId>
    <artifactId>docker-maven-plugin</artifactId>
    <version>1.0.7-SNAPSHOT</version>
    <configuration>
        <build>
            <image>
                <tag>${project.name}:${project.version}</tag>
                <file>Dockerfile</file>
                <buildArgs>
                    <JAR_FILE>${project.basedir}/target/</JAR_FILE>
                </buildArgs>
            </image>
        </build>
        <save>
            <image>
                <tag>${project.name}:${project.version}</tag>
            </image>
        </save>
    </configuration>
</plugin>
```

**Goala execution:**

- mvn docker:build
- mvn docker:save