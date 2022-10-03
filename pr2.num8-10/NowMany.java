import java.util.Scanner;

public class NowMany {
    public static void main(String[] args) {
        String a=new String();
        Scanner scan=new Scanner(System.in);
        a= scan.nextLine();
        int k=0;
        if(a.length()>0) {
            k=1;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ')
                    k++;
            }
        }
        System.out.println("Количество слов: "+k);
    }
}
