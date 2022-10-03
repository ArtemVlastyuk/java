
import java.util.Arrays;
import java.util.Random;

public class class1 {
    public static void task1(){
        int [] arr=new int[10];
        Random rand=new Random();
        System.out.print("До сортировки: ");

        for (int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.print("\nПосле сортировки: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void task2(){
        int [] arr=new int[10];
        System.out.print("\nДо сортировки: ");

        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);

            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.print("\nПосле сортировки: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        class1.task1();
        class1.task2();
    }
}