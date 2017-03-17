import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event {
  private int mGuests;
  private String mFood;
  private String mDrink;
  private String mEntertainment;

  public Event(int userGuests, String userFood, String userDrink, String userEntertainment) {
    mGuests = userGuests;
    mFood = userFood;
    mDrink = userDrink;
    mEntertainment = userEntertainment;
  }

  public int getGuests() {
    return mGuests;
  }

  public String getFood() {
    return mFood;
  }

  public String getDrink() {
    return mDrink;
  }

  public String getEntertainment() {
    return mEntertainment;
  }

  public boolean guestSize(int userGuests) {
    return mGuests > 100;
  }

  int cost;
  public int guestCost(int userGuests) {
    if (userGuests > 100) {
      cost += 1000;
    } else {
      cost += 250;
    }
    return cost;
  }

  public int foodCost(int userFood) {
    return 0;
  }
}


// method to calculate cost for guestSize input
// method to calculate cost for food input
// method to calculate cost for drink input
// method to calculate cost for entertainment input
