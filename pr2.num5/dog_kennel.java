package package5;

import java.util.Scanner;
import java.util.Vector;

public class dog_kennel {
    private final Vector<Dog> dogs=new Vector<>();
    public void add_dogs(Vector<Dog> dogs){
        this.dogs.addAll(dogs);
    }
    public void print(){
        for (int i=0;i<dogs.size();i++)
            System.out.println(dogs.elementAt(i).toString());
    }
    public static void main(String[] args) {
        Vector<Dog> dogs1=new Vector<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите количество собак");
        int size= scan.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Введите имя собаки");
            String name= scan.next();
            System.out.println("Введите возраст собаки");
            int age= scan.nextInt();
            Dog dog=new Dog(name,age);
            dogs1.add(dog);
        }
        dog_kennel a=new dog_kennel();
        a.add_dogs(dogs1);
        a.print();
        System.out.println("Возраст второй собаки в человечских:");
        System.out.println(a.dogs.elementAt(1).age_to_human());

    }
}
