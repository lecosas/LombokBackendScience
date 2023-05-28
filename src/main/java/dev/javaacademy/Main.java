package dev.javaacademy;

public class Main {

    public static void main(String[] args) {

        // How to instance a class that uses @Builder
        StudentBuilder studentBuilder = StudentBuilder.builder()
                .Id(123L)
                .firstName("Leandro")
                .lastName("Guandelini")
                .build();
    }
}