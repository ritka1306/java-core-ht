package hometask09.task1;

import java.util.Arrays;

public class DataAnalyst extends Employee {
    boolean phd;
    String[] Methods;

    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        Methods = methods;
    }

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return Methods;
    }

    @Override
    public String toString() {
        return "DataAnalyst: " +
                "phd is " + phd +
                "; Methods " + Arrays.toString(Methods) +
                "; name - " + name +
                "; email:" + email +
                "; Experience - " + Experience + " years";
    }
}
