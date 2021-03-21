package hometask09.task1;

import java.util.Arrays;

public class Developer extends Employee {

    String mainLanguage;
    String[] Skills;


    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return Skills;
    }

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        Skills = skills;
    }

    @Override
    public String toString() {
        return "Developer: " +
                "mainLanguage - " + mainLanguage +
                "; Skills " + Arrays.toString(Skills) +
                "; name - " + name +
                "; email: " + email +
                "; Experience - " + Experience + " years";
    }
}
