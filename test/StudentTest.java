/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian Camilo Guzmán Escobar
 * @author Rafael Enrique Jimenez Cabrera
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    /*
        Feature: Get student id
            Scenario: Verify id number of a student
                Given there is an student with id 33 and fname "Rumpa" and cgpa 3.68
                When asked for getId 
                Then I should get 33 id number
    */
    
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

    /*
        Feature: Get student fname
            Scenario: Verify fname of a student
                Given there is an student with id 19 and fname "Samaria" and cgpa 3.75
                When asked for getFname 
                Then I should get "Samaria" fname
    */
    
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
    
    /*
        Feature: Get student cgpa
            Scenario: Verify cgpa value of a student
                Given there is an student with id 22 and fname "Fahim" and cgpa 3.76
                When asked for getCgpa 
                Then I should get 3.76 cgpa value
    */
    
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
