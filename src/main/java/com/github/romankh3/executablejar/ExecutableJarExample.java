package com.github.romankh3.executablejar;

import org.apache.commons.lang3.StringUtils;

/**
 * Main class for Maven Executable Jar.
 */
public class ExecutableJarExample {

    public static final String JAVA_REPOSITORY_TEMPLATE = "executable-jar-example";

    public static void main(String[] args) {
        System.out.println("Hello world, This is s a sample OpenShift/Kubernetes job");
        System.out.println("Value for the SAMPLE_ENV environment variable: " + System.getenv("SAMPLE_ENV"));
    }
}
