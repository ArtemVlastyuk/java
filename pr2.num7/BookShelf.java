package package7;

import java.util.*;

import static java.util.Collections.swap;

public class BookShelf {
    public List<Book> arr=new ArrayList<>();

    public BookShelf(Vector<Book> arr) {
        this.arr = arr;
    }

    public BookShelf() {
    }

    public int min_year_book(){
        int min=2100;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getYear()<min)
                min=arr.get(i).getYear();
        }
        return min;
    };
    public int max_year_book(){
        int max=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i).getYear()>max)
                max=arr.get(i).getYear();
        }
        return max;
    };

    public void sortBook(){


            for (int out = arr.size() - 1; out >= 1; out--){  //Внешний цикл
                for (int in = 0; in < out; in++){       //Внутренний цикл
                    if(arr.get(in).getYear() > arr.get(in+1).getYear())               //Если порядок элементов нарушен
                        swap(arr,in, in + 1);             //вызвать метод, меняющий местами
                }
            }


    }
    public void print(){
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i).toString());
    }


}
