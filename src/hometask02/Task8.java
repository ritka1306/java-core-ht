package hometask02;/*В следующей программе объясните, почему значение "6" печатается дважды подряд:
class PrePostDemo {
public static void main(String[] args){
int i = 3;
i++;
System.out.println(i); // "4"
++i;
System.out.println(i); // "5"
System.out.println(++i); // "6"
System.out.println(i++); // "6"
System.out.println(i); // "7"
}
}*/

public class Task8 {
    public static void main(String[] args) {
        int i = 3;
        i++; //зачение i увеличили до 4
        System.out.println(i); // вывели i=4
        ++i; // увеличили значение i до 5
        System.out.println(i); // вывели 5
        System.out.println(++i); // увеличили i до 6 и вывелил полученное значение
        System.out.println(i++); // сначала использовали i=6 а после использования увеличили значение до 7
        System.out.println(i); // вывели 7
    }
}

