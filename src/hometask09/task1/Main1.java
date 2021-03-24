package hometask09.task1;

public class Main1 {
    public static void main(String[] args) {
        String[] skills = {"git", "Scala", "JBoss", "UML"};
        Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);
        String[] mlMethods = {"neural networks", "decision tree", "bayesian algorithms"};
        DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);

        System.out.println(developer);
        System.out.println(analyst);
    }
}
