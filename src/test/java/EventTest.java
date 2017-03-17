import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event newEvent = new Event(100, "food", "drink", "entertainment");
    assertEquals(true, newEvent instanceof Event);
  }

  @Test
  public void getGuests_returnNumberOfGuests_100() {
    Event newEvent = new Event(100, "food", "drink", "entertainment");
    assertEquals(100, newEvent.getGuests());
  }

  @Test
  public void getFood_returnUserFoodInput_food() {
    Event newEvent = new Event(100, "food", "drink", "entertainment");
    assertEquals("food", newEvent.getFood());
  }

  @Test
  public void getDrink_returnUserDrinkInput_drink() {
    Event newEvent = new Event(100, "food", "drink", "entertainment");
    assertEquals("drink", newEvent.getDrink());
  }
}
