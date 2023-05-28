package dev.javaacademy;

import lombok.ToString;

@ToString
public class StudentToStringExclude {
    @ToString.Exclude private long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        public String toString() {
            return "StudentToStringExclude(firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
        }

     */
}
