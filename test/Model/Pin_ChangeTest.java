/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Pin_Change;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sheik
 */
public class Pin_ChangeTest {
    Pin_Change p ;
    
    public Pin_ChangeTest() {
    }
    
    @Before
    public void setUp() {
        p= new Pin_Change("7243");
    }


    /**
     * Test of Pin method, of class Pin_Change.
     */
    @Test
    public void testPin() throws SQLException {
        assertEquals("7243",p.Pin(""));
    }
    
}
