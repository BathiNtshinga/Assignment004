package org.ntshinga;
import java.util.*;
import java.util.Set.*;
import java.util.List;
import java.util.List.*;
/**
 * ArrayList, HashMap and HashSet
 *
 */
public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Bathi Ntshinga");
        Student s2 = new Student("Ncebakazi Dingwayo");
        Student s3 = new Student("Fabian Botha");
        Student s4 = new Student("Sonwabo Glen ");

        List<Student> studentList = new ArrayList<>();
        Set<Student> studentSet = new HashSet<>();
        HashMap<String, String> map = new HashMap<String, String>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println(studentList);

        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);

        System.out.println(studentSet);

        map.put("BathiNtshinga" , "Bathi01");
        map.put("FabianBotha" , "password2020");
        map.put("NcebakaziDingwayo" , "ncebsy1985");
        map.put("SonwaboGlen" , "summer@2");

        System.out.println(map);

        studentList.add(s1);
        System.out.println(studentList);
    }
}
