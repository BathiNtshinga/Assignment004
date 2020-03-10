package org.ntshinga;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.rules.Timeout;
import static org.hamcrest.core.Is.is;
/**
 * Unit test for simple App.
 */
public class AppTest {

    private Student studentName;
    private Student stud;

    @Rule
    public Timeout globalTimeout = new Timeout(2000);

    @Test
    public void testIdentity(){
        Student studentName = new Student();
        Student stud = new Student();
        Assert.assertNotSame(studentName, stud);
    }

    @Test
    public void testFail(){
        int i; i=(3*2);
        assertThat(String.valueOf(3*2),6,is(i));
    }

    public void testDisable(){
        System.out.println("The test will not execute");
    }

}