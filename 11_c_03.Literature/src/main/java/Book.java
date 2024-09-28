public class Book implements Comparable<Book> {
    private String title;
    private int age;

    public Book(String title, int age) {
        this.title = title;
        this.age = age;
    }

    @Override
    public String toString() {
        return title + " (recommended for " + age + " year-olds or older)";
    }

    @Override
    public int compareTo(Book other) {
        if (this.age == other.age) {
            return this.title.compareTo(other.title);
        }
        return this.age - other.age;
    }

}
