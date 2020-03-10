package org.ntshinga;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {


    @Test
    public void testStudentName(){
        Student s1 = new Student();
        s1.name = "Bathi Ntshinga";
        Student s2 = s1;
        Assert.assertEquals(s1, s2);
        Assert.assertSame(s1,s2);

        Student s3 = new Student();
        s3.name = "Fabian Botha";
        Assert.assertEquals(s1,s3);
        Assert.assertSame(s1,s3);
    }


}