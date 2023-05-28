package dev.javaacademy;

import lombok.Data;

@Data
public class StudentData {
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

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof StudentData)) {
                return false;
            } else {
                StudentData other = (StudentData)o;
                if (!other.canEqual(this)) {
                    return false;
                } else if (this.getId() != other.getId()) {
                    return false;
                } else {
                    Object this$firstName = this.getFirstName();
                    Object other$firstName = other.getFirstName();
                    if (this$firstName == null) {
                        if (other$firstName != null) {
                            return false;
                        }
                    } else if (!this$firstName.equals(other$firstName)) {
                        return false;
                    }

                    Object this$lastName = this.getLastName();
                    Object other$lastName = other.getLastName();
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
            return other instanceof StudentData;
        }

        public int hashCode() {
            int PRIME = true;
            int result = 1;
            long $Id = this.getId();
            result = result * 59 + (int)($Id >>> 32 ^ $Id);
            Object $firstName = this.getFirstName();
            result = result * 59 + ($firstName == null ? 43 : $firstName.hashCode());
            Object $lastName = this.getLastName();
            result = result * 59 + ($lastName == null ? 43 : $lastName.hashCode());
            return result;
        }

        public String toString() {
            long var10000 = this.getId();
            return "StudentData(Id=" + var10000 + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ")";
        }

     */
}
