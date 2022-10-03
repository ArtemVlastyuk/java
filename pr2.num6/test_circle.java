package package6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test_circle {
    public static void main(String[] args) {
        System.out.println("Введите радиус окружности: ");
        Scanner scan=new Scanner(System.in);
        double r= scan.nextDouble();
        circle a=new circle(r);
        System.out.println("Площадь окружности: "+a.s()+"\nДлинна окружности: "+a.l());
        System.out.println("Получение радиуса: "+ a.getR() );

        System.out.println("Введите радиус второй окржуности");
        r= scan.nextDouble();
        circle b=new circle(r);
        System.out.println("Результат сравнеие окружностей:");
        if(a.comp(b)>0)
            System.out.println("Вторая окружность больше первой");
        else if (a.comp(b)==0)
            System.out.println("Окружности равны");
        else
            System.out.println("Первая окружность больше второй");
    }
}
