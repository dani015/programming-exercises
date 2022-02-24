package Problem3;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setFirstName(String firstName) {
        if(!Character.isUpperCase(firstName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        } else if(firstName.trim().length() < 3){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");

        } else {
            this.firstName = firstName;
        }
    }

    private void setLastName(String lastName) {
        if(!Character.isUpperCase(lastName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        } else if(lastName.trim().length() < 2){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        } else {
            this.lastName = lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
