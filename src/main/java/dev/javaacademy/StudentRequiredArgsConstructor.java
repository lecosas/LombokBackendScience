package dev.javaacademy;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentRequiredArgsConstructor {
    private final long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        public StudentRequiredArgsConstructor(long Id) {
            this.Id = Id;
        }

     */
}
