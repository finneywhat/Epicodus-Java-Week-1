import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    boolean programRunning = true;
    while (programRunning) {
      System.out.println("\n***********************************************");
      System.out.println("Welcome to Premier Event Planners.\n");
      System.out.println("If you would like to plan your next event with us, enter 'plan' now;\notherwise, type 'exit' to leave.");
      System.out.println("***********************************************");
      String navigationInput = console.readLine();

      if (navigationInput.equals("plan")) {
        System.out.println("***********************************************\n");
        System.out.println("Thank you for choosing Premier Event Planners!\nHow many guests are you expecting?");
        System.out.println("\n");
        Integer intGuestInput = Integer.parseInt(console.readLine());
        System.out.println("***********************************************\n");

        if (intGuestInput > 100) {
          System.out.println(intGuestInput + " guests! With a party that size, we'd love to help out with the costs. Enter the coupon code 'hundred' at checkout to apply a $100-off discount to your total. Press enter to move on to our drink options.");
        } else if (intGuestInput > 50) {
          System.out.println("With " + intGuestInput + " guests, we'd like to offer you a discount. Enter the coupon code 'fifty', when prompted, to receive $50 off your total today. Press enter to move on to our drink options.");
        } else {
          System.out.println("Great - " + intGuestInput + " guests - check. Now to feed this group, we offer the following options:\n\n-- hor-d'oeuvres,\n-- buffet,\n-- dinner.\n\nPlease select one.");
          System.out.println("\n");
        }

        String stringFoodInput = console.readLine().toLowerCase();
        System.out.println("***********************************************\n");
        System.out.println("Moving on to drinks, we offer the following options:\n\n-- non-alcoholic (sodas, spritzers, and juice),\n-- cash-bar,\n-- open-bar.\n\nPlease select one.");
        System.out.println("\n");
        String stringDrinkInput = console.readLine().toLowerCase();
        System.out.println("***********************************************\n");
        System.out.println("Everything looks good so far. Last up, we have our entertainment offers.\nChoose between the following:\n\n-- our house dj,\n-- live band,\n-- visual artists,\n-- skip the entertainment altogether.\n\nPlease enter your choice as either dj, band, visual artists, or none.");
        System.out.println("\n");
        String stringEntInput = console.readLine().toLowerCase();

        Event newUserEvent = new Event(intGuestInput, stringFoodInput, stringDrinkInput, stringEntInput);
        Integer totalCost = newUserEvent.calcEventPrice();

        System.out.println("***********************************************\n");
        System.out.println("You selected the following options:");
        System.out.println("***********************************************\n");
        System.out.println("Number of guests:\t" + newUserEvent.getGuests());
        System.out.println("Food choice:\t\t" + newUserEvent.displayFood());
        System.out.println("Drink choice:\t\t" + newUserEvent.displayDrink());
        System.out.println("Entertainment:\t\t" + newUserEvent.displayEnt() + "\n");
        System.out.println("***********************************************");
        System.out.println("Based on these inputs, your total cost would be $" + totalCost + ".00");
        System.out.println("***********************************************\n");
        System.out.println("If you have a coupon code, please enter here:\n");
        String couponCode = console.readLine();
        System.out.println("***********************************************");
        // Coupon Section
        if (couponCode.equals("fifty")) {
          totalCost = totalCost - 50;
          System.out.println("Awesome! You've entered our $50-off coupon, which brings your total to $" + totalCost + ".00");
          System.out.println("***********************************************");
          programRunning = false;
        } else if (couponCode.equals("hundred")) {
          totalCost = totalCost - 100;
          System.out.println("Excellent! You've entered our $100-off coupon, which brings your total to $" + totalCost + ".00");
          System.out.println("***********************************************");
          programRunning = false;
        } else {
          System.out.println("Unfortunately, that coupon code is no longer valid.\n");
          System.out.println("Your total cost is still the originally quoted $" + totalCost + ".00.");
          System.out.println("***********************************************");
          programRunning = false;
        }

      } else if (navigationInput.startsWith("e")) {
        System.out.println("\nThanks for stopping by Premier Event Planners. Come back soon!\n");
        programRunning = false;
      } else {
        System.out.println("\nDidn't quite catch that. Plan or exit?\n");
        programRunning = true;
      }
    }
  }
}
