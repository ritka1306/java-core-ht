package hometask09.task1;

import java.util.Arrays;

public class Developer extends Employee {

    private String mainLanguage;
    private String[] skills;


    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Developer: " +
                "mainLanguage - " + getMainLanguage() +
                "; Skills " + Arrays.toString(getSkills()) +
                "; name - " + getName() +
                "; email: " + getEmail() +
                "; Experience - " + getExperience() + " years";
    }
}
