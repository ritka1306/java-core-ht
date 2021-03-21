package hometask09.task1;

public class Employee {
    String name;
    String email;
    int Experience;


    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        Experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return Experience;
    }

    @Override
    public String toString() {
        return "Employee: " +
                "name - " + name +
                "; email: " + email +
                "; Experienc - " + Experience + " years";
    }
}
