package org.ntshinga;
import java.util.*;
import java.util.Arrays.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Bathi");
        list.add("Fabian");
        list.add("Ncebakazi");

        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
