import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event newEvent = new Event(100, "food", "drink", "entertainment");
    assertEquals(true, newEvent instanceof Event);
  }
}
