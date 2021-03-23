package hometask09.task1;

public class Employee {
    private String name;
    private String email;
    private int experience;


    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name - " + getName() +
                "; email: " + getEmail() +
                "; Experienc - " + getExperience() + " years";
    }
}
