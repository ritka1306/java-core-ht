package hometask09.task1;

import java.util.Arrays;

public class DataAnalyst extends Employee {
    private boolean phd;
    String[] methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }


    @Override
    public String toString() {
        return "DataAnalyst: " +
                "phd is " + isPhd() +
                "; Methods " + Arrays.toString(getMethods()) +
                "; name - " + getName() +
                "; email:" + getEmail() +
                "; Experience - " + getExperience() + " years";
    }
}
