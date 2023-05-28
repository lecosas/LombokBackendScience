package dev.javaacademy;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class StudentEqualsAndHashCode {
    private long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof StudentEqualsAndHashCode)) {
                return false;
            } else {
                StudentEqualsAndHashCode other = (StudentEqualsAndHashCode)o;
                if (!other.canEqual(this)) {
                    return false;
                } else if (this.Id != other.Id) {
                    return false;
                } else {
                    Object this$firstName = this.firstName;
                    Object other$firstName = other.firstName;
                    if (this$firstName == null) {
                        if (other$firstName != null) {
                            return false;
                        }
                    } else if (!this$firstName.equals(other$firstName)) {
                        return false;
                    }

                    Object this$lastName = this.lastName;
                    Object other$lastName = other.lastName;
                    if (this$lastName == null) {
                        if (other$lastName != null) {
                            return false;
                        }
                    } else if (!this$lastName.equals(other$lastName)) {
                        return false;
                    }

                    return true;
                }
            }
        }

        protected boolean canEqual(Object other) {
            return other instanceof StudentEqualsAndHashCode;
        }

        public int hashCode() {
            int PRIME = true;
            int result = 1;
            long $Id = this.Id;
            result = result * 59 + (int)($Id >>> 32 ^ $Id);
            Object $firstName = this.firstName;
            result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
            Object $lastName = this.lastName;
            result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
            return result;
        }

     */
}
