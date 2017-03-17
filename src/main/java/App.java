import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("\n--------------------------------------");
    System.out.println("Welcome to Premier Event Planners.");
    System.out.println("Let's get started. Please provide us with a few details about your event and we'll give you a cost estimate.");
    System.out.println("--------------------------------------\n");
    System.out.println("How many guests are you expecting?");
    System.out.println("\n");
    int intGuestInput = Integer.parseInt(console.readLine());
    System.out.println("--------------------------------------\n");
    System.out.println("We provide two food buffet options - standard or deluxe. Please enter your choice as either standard or deluxe.");
    System.out.println("\n");
    String intFoodInput = console.readLine().toLowerCase();
    System.out.println("--------------------------------------\n");
    System.out.println("We provide two drink options - open-bar or cash-bar. Please enter your choice as either open or cash.");
    System.out.println("\n");
    String intDrinkInput = console.readLine().toLowerCase();
    System.out.println("--------------------------------------\n");
    System.out.println("Great! And for entertainment, you can choose between our house dj, live band, or skip the entertainment altogether.\nPlease enter your choice as either dj, band, or none.");
    System.out.println("\n");
    String intEntInput = console.readLine().toLowerCase();
    System.out.println("--------------------------------------\n");

    Event newUserEvent = new Event(intGuestInput, intFoodInput, intDrinkInput, intEntInput);

    Integer totalCost = (newUserEvent.guestCost(intGuestInput) + newUserEvent.foodCost(intFoodInput) + newUserEvent.drinkCost(intDrinkInput) + newUserEvent.entertainmentCost(intEntInput));
    System.out.println("You selected the following options:");
    System.out.println("--------------------------------------\n");
    System.out.println("Number of guests: " + intGuestInput);
    System.out.println("Food choice: " + intFoodInput + "-buffet");
    System.out.println("Drink choice: " + intDrinkInput + "-bar");
    System.out.println("Entertainment: " + intEntInput + "\n");
    System.out.println("--------------------------------------");
    System.out.println("Based on these inputs, your total cost would be $" + totalCost + ".00");
    System.out.println("--------------------------------------\n");
    System.out.println("If you have a coupon code, please enter here:\n");
    String couponCode = console.readLine();
    // System.out.println("\n");
    System.out.println("--------------------------------------");
    if (couponCode.equals("fives")) {
      totalCost = totalCost - 500;
      System.out.println("With your coupon, your total cost would be $" + totalCost + ".00");
      System.out.println("--------------------------------------");
    } else if (couponCode.equals("bigguy")) {
      totalCost = totalCost - 1000;
      System.out.println("With your coupon, your total cost would be $" + totalCost + ".00");
      System.out.println("--------------------------------------");
    } else {
      System.out.println("Sorry, looks like you don't have an applicable coupon code.");
      System.out.println("Your total cost is still $" + totalCost + ".00. Thanks!");
      System.out.println("--------------------------------------");
    }
  }
}
