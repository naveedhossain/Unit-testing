/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Login_Page;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Naveed
 */
public class Login_PageTest {
    Login_Page p;
    
    public Login_PageTest() {
    }
    
    @Before
    public void setUp() {
        p = new Login_Page();
    }

    /**
     * Test of LoginSuccess method, of class Login_Page.
     */
    @Test
    public void testLoginSuccess() throws SQLException {
        assertEquals(true , p.LoginSuccess("5040936059841718","7243"));
    }  
}
