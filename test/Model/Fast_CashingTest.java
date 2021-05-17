/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Fast_Cashing;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Naveed
 */
public class Fast_CashingTest {
    Fast_Cashing f;
    public Fast_CashingTest() {
    }
    
    @Before
    public void setUp() {
        f = new Fast_Cashing("7243");
    }

    /**
     * Test of Fast method, of class Fast_Cashing.
     */
    @Test
    public void testFast() {
        assertEquals(8000,f.Fast(2000));
    }
}
