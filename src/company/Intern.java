package company;

public class Intern extends Employee {

    private String university;

    public Intern(String name, String department, double salary, String university) {
        super(name, department, salary);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + ", University: " + university;
    }
}
