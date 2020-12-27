/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import college.employee;
import static java.lang.Thread.sleep;
/**
 *
 * @author Ashwini
 */
public class LogoutTest {
    
    public LogoutTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
        @Test
     public void hello() throws InterruptedException 
     {
         employee w=new employee();
         w.setVisible(true);
         sleep(20000);
         boolean st=w.Testcase1();
          assertEquals(st,true);
          sleep(10000);
         boolean st1=w.Testcase5();
          assertEquals(st1,true);
     }
}

