package org.ntshinga;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;


/**
 * ArrayList, HashMap and HashSet
 *
 */
public class App {
    public static void main(String[] args) {
    //create member object from Student class to populate data structure

        Student s1 = new Student(1, "Bathi Ntshinga");
        Student s2 = new Student(2, "Ncebakazi Dingwayo");
        Student s3 = new Student(3,"Fabian Botha");
        Student s4 = new Student(4,"Sonwabo Glen ");

        //create List and populate with member objects
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.print("Printing List data structure");
        System.out.println(studentList);
        System.out.println();

        System.out.print("Printing Collection Sort data structure");
        //Collections.sort(studentList);
        System.out.println(studentList);
        System.out.println();

        //create Set and populate with objects  from List data structure
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        System.out.print("Printing Set data structure");
        System.out.println(studentSet);
        System.out.println();

        //create Map and populate with objects from List data structure student Set
        HashMap<String, String> studentMap = new HashMap<>();

        studentMap.put("BathiNtshinga" , "Bathi01");
        studentMap.put("FabianBotha" , "password2020");
        studentMap.put("NcebakaziDingwayo" , "ncebsy1985");
        studentMap.put("SonwaboGlen" , "summer@2");

        System.out.print("Printing Map data structure");
        System.out.println(studentMap);
        System.out.println();

    }
}
