public class package8 {



    public static void main(String[] args){

        String[] a={"a","b","c","d","e","f"};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;



        for (int i = 0; i < n/2; i++) {
            String aa = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = aa;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }

}
