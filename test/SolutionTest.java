/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Christian Camilo Guzmán Escobar
 * @author Rafael Enrique Jimenez Cabrera
 */
public class SolutionTest {
    
    public SolutionTest() {
    }
    
    
    /* 
        Feature: Sort student information list

        Scenario Outline: Unordered student information list
            Given a list with elements st1 st2 st3 st4 st5 in that order
            When asked to sort the input list 
            Then the elements in of the sorted list should be st2 <sorted-list> in that order

            Examples:
                |     sorted list     |
                | st2 st5 st4 st3 st1 |
                | st1 st2 st5 st4 st3 |
                | st2 st3 st4 st1 st5 |
    */
    
    /**
     * Test of sortList method, of class Solution.
     */
    @Test
    public void testSortList1() {
        
        System.out.println("sortList 1");
        
        List<Student> list = new ArrayList();
        
        Student st1 = new Student(33, "Rumpa", 3.68);
        Student st2 = new Student(85, "Ashis", 3.85);
        Student st3 = new Student(56, "Samiha", 3.75);
        Student st4 = new Student(19, "Samara", 3.75);
        Student st5 = new Student(22, "Fahim", 3.76);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        List<Student> expResult = new ArrayList();
        expResult.add(st2);
        expResult.add(st5);
        expResult.add(st4);
        expResult.add(st3);
        expResult.add(st1);
        
        List result = Solution.sortList(list);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sortList method, of class Solution.
     */
    @Test
    public void testSortList2() {
        
        System.out.println("sortList 2");
        
        List<Student> list = new ArrayList();
        
        Student st1 = new Student(35, "Karina", 4.22);
        Student st2 = new Student(16, "Ashis", 3.85);
        Student st3 = new Student(58, "Johan", 3.16);
        Student st4 = new Student(21, "Johan", 3.16);
        Student st5 = new Student(22, "Fahim", 3.76);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        
        List<Student> expResult = new ArrayList();
        expResult.add(st1);
        expResult.add(st2);
        expResult.add(st5);
        expResult.add(st4);
        expResult.add(st3);
        
        
        List result = Solution.sortList(list);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of sortList method, of class Solution.
     */
    @Test
    public void testSortList3() {
        
        System.out.println("sortList 3");
        
        List<Student> list = new ArrayList();
        
        Student st1 = new Student(1, "Jefferson", 2.56);
        Student st2 = new Student(2, "Adriana", 3.12);
        Student st3 = new Student(3, "Dario", 3.12);
        Student st4 = new Student(4, "Fernanda", 3.12);
        Student st5 = new Student(5, "Yamile", 1.14);
        
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        
        List<Student> expResult = new ArrayList();
        expResult.add(st2);
        expResult.add(st3);
        expResult.add(st4);
        expResult.add(st1);
        expResult.add(st5);
        
        List result = Solution.sortList(list);
        assertEquals(expResult, result);
    }
    
}
