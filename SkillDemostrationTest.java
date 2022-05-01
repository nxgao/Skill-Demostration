import java.beans.Transient;
import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemostrationTest {
    
    @Test
    public void multi(){
        assertEquals(7, SkillDemostration.multi(3,2));
    }
}
