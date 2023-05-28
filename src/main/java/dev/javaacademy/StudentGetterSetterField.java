package dev.javaacademy;

import lombok.Getter;
import lombok.Setter;

public class StudentGetterSetterField {
    @Setter private long Id;
    @Getter private String firstName;
    @Getter @Setter private String lastName;

    /* Lombok Generated Code:

        public void setId(long Id) {
            this.Id = Id;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

     */
}
