package patterns.builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.StudentBuilder.getStudentBuilder()
                .firstName("Pobitra")
                .lastName("Pradhan")
                .age(27)
                .rollNo(101)
                .build();

        System.out.println(student);
    }
}
