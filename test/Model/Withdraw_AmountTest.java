
package Model;

import Model.Withdraw_Amount;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Naveed
 */
public class Withdraw_AmountTest {
    
    public Withdraw_AmountTest() {
    }
    Withdraw_Amount w;
    @Before
    public void setUp() {
        w = new Withdraw_Amount("7243");
    }
    @Test
    public void testWithraw() throws SQLException {
        assertEquals(9000,w.Withraw(1000, "Withdraw"));
    }
    
}
