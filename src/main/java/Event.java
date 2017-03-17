public class Event {
  private int mGuests;
  private String mFood;
  private String mDrink;

  public Event(int userGuests, String userFood, String userDrink, String userEntertainment) {
    mGuests = userGuests;
    mFood = userFood;
    mDrink = userDrink;
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
}
