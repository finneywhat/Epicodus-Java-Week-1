public class Event {
  private int mGuests;
  private String mFood;

  public Event(int userGuests, String userFood, String userDrink, String userEntertainment) {
    mGuests = userGuests;
    mFood = userFood;
  }

  public int getGuests() {
    return mGuests;
  }

  public String getFood() {
    return mFood;
  }
}
