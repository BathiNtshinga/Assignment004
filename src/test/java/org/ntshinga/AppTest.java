package org.ntshinga;

import org.junit.Rule;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.*;
import static org.hamcrest.CoreMatchers.hasItems;
/**
 * Unit test for simple App.
 */
public class AppTest {

    private Student studentName;
    private Student stud;

    @Rule
    public Timeout globalTimeout = new Timeout(2000);

    @Test
    public void testList(){
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

        assertThat(studentList,hasItems(s1, s2, s3, s4));
    }
    @Test
    public void testSet(){
        Student s1 = new Student(1, "Bathi Ntshinga");
        Student s2 = new Student(2, "Ncebakazi Dingwayo");
        Student s3 = new Student(3,"Fabian Botha");
        Student s4 = new Student(4,"Sonwabo Glen ");

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);

        assertThat(studentSet, hasItems(s1,s2, s3, s4));
    }
    @Test
    public void testMap(){
        Student s1 = new Student(1, "Bathi Ntshinga");
        Student s2 = new Student(2, "Ncebakazi Dingwayo");
        Student s3 = new Student(3,"Fabian Botha");
        Student s4 = new Student(4,"Sonwabo Glen ");

        HashMap<String, String> studentMap = new HashMap<>();
        studentMap.put("BathiNtshinga" , "Bathi01");
        studentMap.put("FabianBotha" , "password2020");
        studentMap.put("NcebakaziDingwayo" , "ncebsy1985");
        studentMap.put("SonwaboGlen" , "summer@2");

        HashMap<String, String> testing = new HashMap<>();
        testing.put("NcebakaziDingwayo" , "ncebsy1985");
        testing.put("BathiNtshinga" , "Bathi01");
        testing.put("SonwaboGlen" , "summer@2");
        testing.put("FabianBotha" , "password2020");

        assertThat(studentMap, is(testing));
    }

@Test
    public void testDisable(){
        System.out.println("The test will not execute");
    }

}