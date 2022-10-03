import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum=0.00;
        for (int i=1;i<=10; i++){

            System.out.printf("%8.2f", 1.00/i);
            sum+=1.00/i;
        }
        System.out.print("\nсумма: "+sum+'\n');
    }
}
// 10 элементов заполнить по разному и отсортировать