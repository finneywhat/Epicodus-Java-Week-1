import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Event {
  private int mGuests;
  private String mFood;
  private String mDrink;
  private String mEntertainment;

  //arrays to hold all the different options?

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

public Integer calcEventPrice() {
  Integer perGuestPrice = 0;
  Integer entertainmentPrice = 0;
  if (mFood.startsWith("hor")) { //could make equal to "1" intead
    perGuestPrice += 5;
  } else if (mFood.startsWith("buf")) { //equal to 2
    perGuestPrice += 9;
  } else if (mFood.startsWith("din")) {
    perGuestPrice += 15;
  } else {
    perGuestPrice = 0;
  }
  if (mDrink.startsWith("no")) {
    perGuestPrice += 5;
  } else if (mDrink.startsWith("ca")) {
    perGuestPrice += 10;
  } else if (mDrink.startsWith("op")){
    perGuestPrice += 20;
  } else {
    perGuestPrice = 0;
  }
  if (mEntertainment.equals("dj") || mEntertainment.startsWith("vis")) {
    entertainmentPrice += 500;
  } else if (mEntertainment.equals("band")) {
    entertainmentPrice += 1000;
  } else {
    entertainmentPrice = 0;
  }
  return mGuests * perGuestPrice + entertainmentPrice;
}

  public String displayFood() {
    String foodOutput = "";
    if (mFood.startsWith("hor")) {
      foodOutput = "hors-d'oeuvres";
    } else if (mFood.startsWith("buf")) {
      foodOutput = "buffet";
    } else if (mFood.startsWith("din")) {
      foodOutput = "dinner";
    }
    return foodOutput;
  }

  public String displayDrink() {
    String drinkOutput = "";
    if (mDrink.startsWith("non")) {
      drinkOutput = "non-alcoholic";
    } else if (mDrink.startsWith("ca")) {
      drinkOutput = "cash-bar";
    } else if (mDrink.startsWith("op")) {
      drinkOutput = "open-bar";
    }
    return drinkOutput;
  }

  public String displayEnt() {
    String entOutput = "";
    if (mEntertainment.startsWith("d")) {
      entOutput = "dj";
    } else if (mEntertainment.startsWith("b")) {
      entOutput = "band";
    } else if (mEntertainment.startsWith("vis")) {
      entOutput = "visual-artist";
    }
    return entOutput;
  }
}
