package package4;

import java.util.Objects;
import java.util.Vector;

public class Shop {
    private Vector<String> computers=new Vector<String>();
    public void add_comp(String computer){
        computers.add(computer);
        //this.computers.addElement(computer);
    }
    public void delete_comp(String computer){
        this.computers.remove(computer);
    }
    public boolean find_comp(String computer){
        for (int i=0;i<this.computers.size();i++)
        {
            if(Objects.equals(this.computers.elementAt(i), computer)) {
                return true;
            }

        }
        return false;
    }
    public void print(){
        System.out.println("\n\nКомпьютеры: ");
        for(int i=0;i<this.computers.size();i++){
            System.out.println(this.computers.elementAt(i));
        }
    }


}
