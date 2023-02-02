public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Федор", "Достоевский");
        Book book1 = new Book("Идиот", author1,1868);
        System.out.println(book1);
        Author author2 = new Author("Антон", "Чехов");
        Book book2 = new Book("Вишневый сад", author2, 1903);
        System.out.println(book2);
        Author author3 = new Author("Антон", "Чехов");
        Book book3 = new Book("Палата №6", author3, 1892);
        System.out.println(book3);
        System.out.println(book2.equals(book3));
    }
}