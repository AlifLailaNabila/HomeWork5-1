package HomeWork5;

import java.util.HashMap;
import java.util.Iterator;

public class useOfHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> students=new HashMap<Integer, String>();
        students.put(101,"Pamelaa");
        students.put(102,"Nasrin apa");
        students.put(104,"fahmida apa");
        students.put(106,"setu apa");
        students.put(103,"siddika vabi");

        Iterator it= students.entrySet().iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());

        }


    }
}
