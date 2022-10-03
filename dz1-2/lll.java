

import java.util.Scanner;
public class lll {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int var_num;
        System.out.print("Введите число: ");
        var_num=scan.nextInt();

        int [] arr;
        arr=new int[var_num];
        for (int i=0;i<var_num; i++) {
            arr[i]=scan.nextInt();

        }
        int sum=0;
        for (int i=0;i<var_num; i++) {
            sum+=arr[i];
        }
        System.out.print("сумма: "+sum+'\n');
        int i=0;
        sum=0;
        while(i<var_num) {
            sum+=arr[i];
            i=i+1;
        }
        System.out.print("сумма: "+sum+'\n');
        i=0;
        sum=0;

        do {
            sum+=arr[i];
            i=i+1;
        } while (i<var_num);
        System.out.print("сумма: "+sum);
    }


}

