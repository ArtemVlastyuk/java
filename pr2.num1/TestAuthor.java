import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author a=new Author("Артём","cvlstyuk@mail.ru",'m');
        System.out.println(a.toString());
        System.out.println("Измение email: ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите новый email: ");
        String n=scan.nextLine();
        a.setEmail(n);
        System.out.println(a.toString());


    }
}
