package patterns.builder;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final int rollNo;

    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.rollNo = builder.rollNo;
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private int rollNo;

        public static StudentBuilder getStudentBuilder() {
            return new StudentBuilder();
        }

        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder rollNo(int rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "FirstName: " + firstName + ", LastName: " + lastName + ", Age: " + age + ", Address: " + address +
                ", RollNo: " + rollNo;
    }
}
