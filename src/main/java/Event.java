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

  public int guestCost(int userGuests) {
    int cost = 0;
    if (userGuests > 100) {
      cost += 1000;
    } else {
      cost += 250;
    }
    return cost;
  }

  public int foodCost(String userFood) {
    int cost = 0;
    if (userFood.equals("standard")) {
      cost += 1000;
    } else {
      cost += 2500;
    }
    return cost;
  }

  public int drinkCost(String userDrink) {
    int cost = 0;
    if (userDrink.equals("open")) {
      cost += 3000;
    } else {
      cost += 1000;
    }
    return cost;
  }

  public int entertainmentCost(String userEntertainment) {
    int cost = 0;
    if (userEntertainment.equals("dj")) {
      cost += 500;
    } else if (userEntertainment.equals("band")) {
      cost += 1000;
    } else {
      cost += 0;
    }
    return cost;
  }
}
