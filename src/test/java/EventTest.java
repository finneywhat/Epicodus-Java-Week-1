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
  public void calcEventPrice_returnPriceForOptionsBasedOnGuests_700() {
    Event testEvent = new Event(20, "hors-d'oeuvres", "non-alcoholic", "dj");
    assertEquals(700, testEvent.calcEventPrice());
  }

  @Test
  public void displayFood_displayFoodSelectionEvenIfUserMisspells_dinner() {
    Event thisEvent = new Event(20, "din", "non-alcoholic", "dj");
    assertEquals("dinner", thisEvent.displayFood());
  }

  @Test
  public void displayDrink_displayDrinkSelectionEvenIfUserMisspells_cash() {
    Event thisEvent = new Event(20, "din", "cass-bar", "dj");
    assertEquals("cash-bar", thisEvent.displayDrink());
  }

  @Test
  public void displayEnt_displayEntertainmentSelectionEvenIfUserMisspells_band() {
    Event thisEvent = new Event(20, "din", "non-alcoholic", "badn");
    assertEquals("band", thisEvent.displayEnt());
  }
}
