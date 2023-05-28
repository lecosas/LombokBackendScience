package dev.javaacademy;

import lombok.ToString;

@ToString
public class StudentToString {
    private long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        public String toString() {
            return "StudentToString(Id=" + this.Id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
        }

     */
}
