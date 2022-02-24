package person;

public class CollegeStudent extends Student{
    private String collegeName;

    CollegeStudent(String studentName, String collegeName) {
        super(studentName);

        this.collegeName = collegeName;

        System.out.println(super.getName());
    }
}
