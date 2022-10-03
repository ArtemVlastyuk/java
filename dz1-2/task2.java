import java.util.Scanner;
import java.util.*;
public class task2 {
    public static void main(String[] args){
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        size=scan.nextInt();
        int []arr=new int[size];
        System.out.println("size="+size);
        for (int i=0;i<size;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nВведите число которое хотите удалить");
        int del=scan.nextInt();
        int [] arr2=new int [size];
        int size2=0;
        for (int i=0;i<size;i++) {
            if (del != arr[i]){
                arr2[size2]=arr[i];
                size2++;
            }
        }
        System.out.println("size="+size2);
        for (int i=0;i<size2;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println("\nВведите число которое хотите удалить");
        int del2=scan.nextInt();
        int [] arr3=new int [size2];
        int size3=0;
        for (int i=0;i<size2;i++) {
            if (del2 != arr2[i]%10){
                arr3[size3]=arr2[i];
                size3++;
            }
        }
        System.out.println("size="+size3);
        for (int i=0;i<size3;i++){

            System.out.print(arr3[i]+" ");
        }

    }
}
