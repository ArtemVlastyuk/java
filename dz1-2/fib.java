import java.util.Scanner;
public class fib {
    public static void main(String[] args){
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        size=scan.nextInt();
        System.out.print("Введите число: ");
        int k=scan.nextInt();
        int n2=0,n1=1,n;
        if (k==1){
            System.out.println("n="+n2);
            System.out.println("n="+n1);
        }
        if (k==2){
            System.out.println("n="+n1);
        }
        for(int i=3;i<k+size;i++) {
            n=n1+n2;
            n2=n1;
            n1=n;
            if(i>k){
                System.out.println("n="+n);
            }

        }
    }

}
// написать программу которая сгенерировать целочисленный массив с элментами от 0 до 100
//кол-во вводим сами, потом оканчивающиеся на это число
