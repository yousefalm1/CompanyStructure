package company;

import java.util.ArrayList;

public class Engineer extends Employee {

    private ArrayList<String> skills;

    public Engineer(String name, String department, double salary) {
        super(name, department, salary);
        skills = new ArrayList<>();
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(String skill) {
        skills.add(skill);

    }

    @Override
    public String toString() {
        return super.toString() + ", skills: " + skills;
    }
}

