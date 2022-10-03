package Pocker;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class pocker {
    public static void main(String[] args) {
        String[] suit = {
                "Пики", "Бубе", "Черви", "Трефа"
        };
        System.out.println("Введите количество игроков:");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"
        };
        Vector<String> cards=new Vector<String>();

        for (int i=0;i<13;i++){
            for (int i1=0;i1<4;i1++) {

                cards.add(rank[i]+" "+suit[i1]);
            }
        }
        int k=52;
        Random rand=new Random();
        String [] cards2=new String[52];
        while (k!=0){
            int r=rand.nextInt(k);

            cards2[52-k]=cards.elementAt(r);
            cards.remove(r);
            k--;
        }
        System.out.println("");
        for (int i=0;i<n;i++){
            for (int i1=0;i1<5;i1++) {
                System.out.print(cards2[i + i1 * n]+" | ");
            }
            System.out.println();
        }

    }
}
