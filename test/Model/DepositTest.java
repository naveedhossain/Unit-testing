/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Deposit;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sheik
 */
public class DepositTest {
    
    public DepositTest() {
    }
    Deposit s;
    @Before
    public void setUp() {
       s = new Deposit("7243");
    }
    /**
     * Test of Deposit method, of class Deposit.
     */
    @Test
    public void testDeposit() throws Exception {
        assertEquals("1000" , s.Deposit("1000","7243"));
    }
    
}
