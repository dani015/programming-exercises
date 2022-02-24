package Problem3;

public class Student extends Human{
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        if(facultyNumber.trim().length() < 5 || facultyNumber.trim().length() > 10){
            throw new IllegalArgumentException("Invalid faculty number!");
        } else {
            this.facultyNumber = facultyNumber;
        }
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%n" +
                        "Last Name: %s%n" +
                        "Faculty number: %s",
                super.getFirstName(), super.getLastName(), this.getFacultyNumber());

    }
}
