import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testAtRiskStudent() {
        Student s = new Student("Test", 2.0, 60);
        assertTrue(s.getGpa() < 2.5 && s.getAttendance() < 75);
    }
}
