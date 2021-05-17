/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Balance_Amount;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Naveed
 */
public class Balance_AmountTest {
    Balance_Amount b;
    public Balance_AmountTest() {
    }
    
    @Before
    public void setUp() {
        b = new Balance_Amount("7243");
    }

    /**
     * Test of Balance method, of class Balance_Amount.
     * @throws java.sql.SQLException
     */
    @Test
    public void testBalance() throws SQLException {
        assertEquals(104701,b.Balance(1,"Deposit"));
    }
}
