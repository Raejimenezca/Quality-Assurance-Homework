/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class StudentTest {
    
    public StudentTest() {
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student st1 = new Student(33, "Rumpa", 3.68);
        int expResult = 33;
        int result = st1.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFname method, of class Student.
     */
    @Test
    public void testGetFname() {
        System.out.println("getFname");
        Student st2 = new Student(19, "Samaria", 3.75);
        String expResult = "Samaria";
        String result = st2.getFname();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCgpa method, of class Student.
     */
    @Test
    public void testGetCgpa() {
        System.out.println("getCgpa");
        Student st3 = new Student(22, "Fahim", 3.76);
        double expResult = 3.76;
        double result = st3.getCgpa();
        assertEquals(expResult, result, 0.0);
    }
    
}
