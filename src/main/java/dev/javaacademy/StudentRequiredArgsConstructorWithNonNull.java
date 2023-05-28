package dev.javaacademy;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentRequiredArgsConstructorWithNonNull {
    private final long Id;

    @NonNull
    private String firstName;

    private String lastName;

    /* Lombok Generated Code:

        public StudentRequiredArgsConstructorWithNonNull(long Id, @NonNull String firstName) {
            if (firstName == null) {
                throw new NullPointerException("firstName is marked non-null but is null");
            } else {
                this.Id = Id;
                this.firstName = firstName;
            }
        }

     */
}
