import java.util.Scanner;

public class ss {
    public static String calcss(float num10,int ss){
        String xss="";
        String alf="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int int10;
        float dou10;
        int10=(int)num10;
        dou10=((float)num10)%1;
        //System.out.println(dou10);
        //System.out.println(int10+" "+dou10);
        while(int10!=0) {
            xss=alf.charAt(int10%ss)+xss;
            int10/=ss;
        }
        if(dou10!=0)
            xss+=".";
        int k=0;
        while((dou10%1!=0) && (k<10)) {
            //System.out.println((int)(dou10*ss));
            xss+=alf.charAt((int)(dou10*ss));
            dou10=dou10*ss%1;
            k++;

        }

        return (xss);
    }
    public static void main(String[] args) {

        int  ss;
        float num10;
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        num10= scan.nextFloat();
        System.out.println("Введите систему счисления в которую вы хотите перевести число");
        ss= scan.nextInt();

        System.out.println("В 2 системе счисления: "+calcss(num10,2));

        System.out.println("В "+ ss+" системе счисления: "+calcss(num10,ss));
        System.out.println("В "+ ss+" системе счисления: "+calcss(num10,16));


    }


}