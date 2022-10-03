import java.util.Scanner;

public class Test {
    private  Circle [] o;
    private int size;

    public Test(Circle[] a, int size) {
        this.o = a;
        this.size = size;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите количество элментов");
        int size=scan.nextInt();

        Circle [] o=new Circle[size];
        for(int i=0;i<size;i++){
            System.out.println("Введите центр окружности: ");
            int x=scan.nextInt();
            int y=scan.nextInt();
            System.out.println("Введите радус окружности: ");
            int r=scan.nextInt();
            Point b =new Point(x,y);
            o [i]=new Circle(b,r);
        }
    }

}
