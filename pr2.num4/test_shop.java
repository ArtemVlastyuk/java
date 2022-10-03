package package4;

import java.util.Scanner;

public class test_shop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите количество компьютеров");
        int k=scan.nextInt();
        Shop a=new Shop();

        System.out.println("Введите название компьютеров: ");
        for (int i=0;i<k;i++){
            String comp=scan.next();
            a.add_comp(comp);
        }
        a.print();
        System.out.println("\n\n\nВведите название компьютера, который вы хотите удалить");
        String comp=scan.next();
        a.delete_comp(comp);
        a.print();
        System.out.println("\n\n\nВведите название компьютера, который вы хотите найти");
        comp=scan.next();
        if (a.find_comp(comp))
            System.out.println("Компьютер найден");
        else
            System.out.println("Компьютер не найден");


    }

}
