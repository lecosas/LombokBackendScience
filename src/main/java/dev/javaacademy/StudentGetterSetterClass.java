package dev.javaacademy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentGetterSetterClass {
    private long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        public long getId() {
            return this.Id;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setId(long Id) {
            this.Id = Id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

     */
}
