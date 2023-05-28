package dev.javaacademy;

import lombok.Builder;

@Builder
public class StudentBuilder {
    private long Id;
    private String firstName;
    private String lastName;

    /* Lombok Generated Code:

        StudentBuilder(long Id, String firstName, String lastName) {
            this.Id = Id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public static StudentBuilderBuilder builder() {
            return new StudentBuilderBuilder();
        }

        public static class StudentBuilderBuilder {
            private long Id;
            private String firstName;
            private String lastName;

            StudentBuilderBuilder() {
            }

            public StudentBuilderBuilder Id(long Id) {
                this.Id = Id;
                return this;
            }

            public StudentBuilderBuilder firstName(String firstName) {
                this.firstName = firstName;
                return this;
            }

            public StudentBuilderBuilder lastName(String lastName) {
                this.lastName = lastName;
                return this;
            }

            public StudentBuilder build() {
                return new StudentBuilder(this.Id, this.firstName, this.lastName);
            }

            public String toString() {
                return "StudentBuilder.StudentBuilderBuilder(Id=" + this.Id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ")";
            }
        }

     */
}
