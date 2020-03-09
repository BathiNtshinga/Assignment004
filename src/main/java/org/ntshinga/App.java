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

        map.put("Bathi Ntshinga", "Bathi01");
        map.put("Fabian Botha", "password2020");
        map.put("Ncebakazi Dingwayo", "ncebsy1985");
        map.put("Sonwabo Glen", "summer@2");

        System.out.println(map);

    }
}


