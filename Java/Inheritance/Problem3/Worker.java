package Problem3;

public class Worker extends Human{
    private double weekSalary;
    private double workHoursPerDay;
    private double salaryPerHour;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary < 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        } else {
            this.weekSalary = weekSalary;
        }
    }

    public double getSalaryPerHour() {
        double dailySalary = weekSalary / 7;

        return dailySalary / workHoursPerDay;
    }

    public void setWorkHoursPerDay(double workHoursPerDay) {
        if(workHoursPerDay < 1 && workHoursPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        } else {
            this.workHoursPerDay = workHoursPerDay;
        }
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public double getWorkHoursPerDay() {
        return workHoursPerDay;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%n" +
                "Last Name: %s%n" +
                "Week salary: %.2f%n" +
                "Hours per day: %.2f%n" +
                "Salary per hour: %.2f%n",
                super.getFirstName(), super.getLastName(),
                this.getWeekSalary(), this.getWorkHoursPerDay(), this.getSalaryPerHour());
    }
}
