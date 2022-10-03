package package7;

import java.util.Arrays;
import java.util.Vector;

public class bookTest {
    public static void main(String[] args) {

        Vector<Book> arr=new Vector<>();
        arr.add(new Book("Ремарк", "Три товарища",1936));
        arr.add(new Book("Ремарк", "Триумфальная арка",1945));
        arr.add(new Book("Фицджеральд", "Великий Гэтсби",1925));
        arr.add(new Book("Джек Лондон", "Мартин иден",1909));
        BookShelf a=new BookShelf(arr);
        System.out.println(a.max_year_book());
        System.out.println(a.min_year_book());

        a.sortBook();
        System.out.println(arr);
    }
}
