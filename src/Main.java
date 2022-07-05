public class Main {
    public static void main(String[] args) {

        Car Fiat = new Car("fiat", "car", "c-1");
        System.out.println(Fiat.toString());
        Van Volkswagen = new Van("volkswagen", "van", "v-1");
        System.out.println(Volkswagen.toString());
        Motorcycle Yamaha = new Motorcycle("yamaha", "motorcycle", "m-1");
        System.out.println(Yamaha.toString());
        System.out.println(Volkswagen.getTotalAvailableSpace());




        Commands currentCommands = new Commands("Home", new String[]{"Park Vehicle", "Available Parking Space", "Quit"});
        currentCommands.PrintCarParkGreeting();
        currentCommands.printGreeting();
        currentCommands.printCommands();
        int userInput = currentCommands.getIntegerInput();

        String nextCommands = "home";
        boolean isActive = true;
        while (isActive) {
            switch (nextCommands) {
                case "home":

                    if (userInput == 1) {
                        nextCommands = "Park Vehicle";
                        //currentCommands.printMessage("Buy Product");
                    } else if (userInput == 2) {
                        nextCommands = "Available Parking Space";
                        // currentCommands.printMessage("Refill Vending Machine");
                    } else {
                        nextCommands = "";
                    }

                    break;

                case "Park Vehicle":
                    currentCommands = new Commands("Park Vehicle", new String[]{"Car", "Van", "Motorcycle"});
                    currentCommands.printGreeting();
                    currentCommands.printCommands();
                    userInput = currentCommands.getIntegerInput();
                    if (userInput == 1) {
                        currentCommands.printMessage("10 car spots");
                    } else if (userInput == 2) {
                        currentCommands.printMessage("5 van spots");
                    } else {
                        currentCommands.printMessage("0 motorcycle spots");

                    }
                    nextCommands = "";
                    break;

                case "Available Parking Space":
                    //currentCommands.printMessage()
                    currentCommands.printMessage("Car spaces: " + Volkswagen.getTotalAvailableSpace() );
                    currentCommands.printMessage("Motorcycle spaces: 0");
                    nextCommands = "";
                    break;

                default:
                    isActive = false;
            }
            }
        }
    }