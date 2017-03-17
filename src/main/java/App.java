import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("--------------------------------------");
    System.out.println("Welcome to Premier Event Planners.");
    System.out.println("Provide us with a few details about your event and we'll give you a cost estimate.");
    System.out.println("--------------------------------------\n");
    System.out.println("How many guests are you expecting?");
    System.out.println("--------------------------------------");
    int intGuestInput = Integer.parseInt(console.readLine());
    System.out.println("--------------------------------------\n");
    System.out.println("We provide two food buffet options - standard or deluxe. Please enter your choice as either standard or deluxe.");
    System.out.println("--------------------------------------");
    String intFoodInput = console.readLine().toLowerCase();
    System.out.println("--------------------------------------\n");
    System.out.println("We provide two drink options - open-bar or cash-bar. Please enter your choice as either open or cash.");
    System.out.println("--------------------------------------");
    String intDrinkInput = console.readLine().toLowerCase();
    System.out.println("--------------------------------------\n");
    System.out.println("Great! And finally, for entertainment, you can choose to between our house dj, live band, or skip the entertainment altogether.\nPlease enter your choice as either dj, band, or none.");
    System.out.println("--------------------------------------");
    String intEntInput = console.readLine().toLowerCase();
    System.out.println("--------------------------------------\n");

    Event newUserEvent = new Event(intGuestInput, intFoodInput, intDrinkInput, intEntInput);

    int totalCost = (newUserEvent.guestCost(intGuestInput) + newUserEvent.foodCost(intFoodInput) + newUserEvent.drinkCost(intDrinkInput) + newUserEvent.entertainmentCost(intEntInput));
    System.out.println("You selected the following options:");
    System.out.println("--------------------------------------\n");
    System.out.println("Number of guests: " + intGuestInput);
    System.out.println("Food choice: " + intFoodInput + "-buffet");
    System.out.println("Drink choice: " + intDrinkInput + "-bar");
    System.out.println("Entertainment: " + intEntInput + "\n");
    System.out.println("--------------------------------------");
    System.out.println("Based on these inputs, your total cost would be $" + totalCost + ".00");
    System.out.println("--------------------------------------");
  }

}
