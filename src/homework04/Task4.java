package homework04;

public class Task4 {
    public static void main(String[] args) {
        int counter;
        counter = func (0);
        counter = func (counter);
        counter = func (counter);
        System.out.println(counter);
    }
    static int func(int count) {
        count++;
        return count;
    }
}

