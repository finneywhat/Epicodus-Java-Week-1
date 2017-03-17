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

  @Test
  public void getEntertainment_returnUserEntertainmentInput_entertainment() {
    Event newEvent = new Event(100, "food", "drink", "entertainment");
    assertEquals("entertainment", newEvent.getEntertainment());
  }

  @Test
  public void guestSize_determinesIfNumberOfGuestsLessThanOneHundred_false() {
  Event newEvent = new Event(100, "standard", "open-bar", "dj");
  assertEquals(false, newEvent.guestSize(100));
  }

  @Test
  public void guestCost_returnCostForGuestSizeUnder100_1000() {
  Event newEvent = new Event(120, "standard", "open-bar", "dj");
  assertEquals(1000, newEvent.guestCost(120));
  }

  @Test
  public void foodCost_returnCostForFood_1000() {
  Event newEvent = new Event(120, "standard", "open-bar", "dj");
  assertEquals(1000, newEvent.foodCost("standard"));
  }
}
