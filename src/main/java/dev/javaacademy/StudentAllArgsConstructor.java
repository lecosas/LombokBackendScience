package dev.javaacademy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StudentAllArgsConstructor {
    private final long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        public StudentAllArgsConstructor(long Id, String firstName, String lastName) {
            this.Id = Id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

     */
}
