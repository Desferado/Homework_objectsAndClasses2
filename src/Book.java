import java.util.Objects;

public class Book {
    private final String title;
    private final Author Author;
    private int year;

    public Book(String title, Author AuthorBook, int year) {
        this.title = title;
        this.Author = AuthorBook;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.Author;
    }
   /* public void printInfo() {
        System.out.println("Автор = " + Author.getFirstName() + " " + Author.getSecondName());
        System.out.println("Название = " + this.title);
        System.out.println("год = " + this.year);
    }*/
    @Override
    public String toString() {
        return "Автор = " + Author.getFirstName() + " " + Author.getSecondName() + ", Название = " + title + ", год = " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Author.toString().equals(book.Author.toString())||title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, Author.toString());
    }

    public int getYear() {
        return this.year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
