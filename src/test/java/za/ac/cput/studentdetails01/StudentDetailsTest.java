
package za.ac.cput.studentdetails01;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;
/**
 *
 * @author Breyton Ernstzen
 */
public class EdricoTest1 {
    
    Report edrico = null;
    Report edrico2 = null;
    public EdricoTest1() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        edrico = new Report();
        edrico2 = new Report();
        edrico = edrico2;
    }
    
    @AfterEach
    public void tearDown() {
    }
       
    @Test
    public void equalityTest(){
        assertEquals(edrico, edrico2);
    }

    @Test
    public void identityTest(){

        assertSame(edrico, edrico2);
    }

    //failing test    
    @Test
    public void CellNumberVerifier(){
    
       boolean result = edrico.CellNumberVerifier("a0812831764");
       assertEquals(true, result);
    }
    @Test
    @Timeout (value = 1000)
    public void timeoutTest()
    {
        System.out.println("Checks timeout");   
    }

    @Test
    @Disabled
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
