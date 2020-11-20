

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Comp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Bike> al=new ArrayList<Bike>();

        al.add(new Bike("Yamaha",99530,"Gear",65,"Red"));

        al.add(new Bike("Hero Honda",7500,"Without gear",50,"Brown"));

        al.add(new Bike("Splender",98000,"Gear",76,"Blue"));

        Collections.sort(al );
        ListIterator<Bike> itr=al.listIterator();
        while(itr.hasNext())
        {
            System.out.println("Value" +itr.next());
        }


    }

}
class Bike implements Comparable{
    String name;
    int price;
    String type;
    int fuelcapacity;
    String color;

    Bike(String name,int price,String type,int fuelcapacity,String color)   {
        this.name=name;
        this.price=price;
        this.type=type;
        this.fuelcapacity=fuelcapacity;
        this.color=color;
    }

    public String toString(){
        return name+" "+price+" "+type+" "+" "+fuelcapacity+" "+color;
    }

    public int compareTo(Object b){
        int price1=this.price;
        Bike b1=(Bike)b;
        int price2=b1.price;
        if(price1 <price2)
        {
            return -1;
        }

        else if (price1 > price2)
        {
            return 1;
        }

        else{
            return 0;
        }
    }
}

