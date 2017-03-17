public class Event {
  private int mGuests;

  public Event(int userGuests, String userFood, String userDrink, String userEntertainment) {
    mGuests = userGuests;
  }

  public int getGuests() {
    return mGuests;
  }

}
