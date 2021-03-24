package hometask09.task4;

public class Movie {
    String title;
    String desc;
    int year;

    public Movie(String title, String desc, int year) {
        this.title = title;
        this.desc = desc;
        this.year = year;
    }

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        this.desc = "";  // либо без этого, но тогда будет не пустая строка, а null. Смотря что понимается под "пустой строкой"
    }
}
