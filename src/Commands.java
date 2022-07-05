import java.util.Scanner;

public class Commands {


    private final Scanner scanner = new Scanner(System.in);

    private final String[] commands;

    private final String name;

    public Commands( String name, String[] commands) {
        this.commands = commands;
        this.name = name;
    }

    public void printMessage(String message){
        System.out.println(message);

    }

    public void printGreeting(){
        printMessage("\nBelow are the " + name + " commands.");
    }


    public void PrintCarParkGreeting(){
        printMessage("Welcome to the Car Park command line programme.");
    }

    public void printCommands(){
        for (int i = 0; i < commands.length; i++) {
            printMessage((i + 1) + ":" + commands[i]);

        }
    }

    public int getIntegerInput(){

        int input = 0; // TEMP VARIABLE
        boolean isActive = true; // WHILE LOOP

        while(isActive){
            printMessage("Enter a number between 1 - " + commands.length);
            int userInput = scanner.nextInt();

            if(userInput > 0 && userInput <= commands.length){
                isActive = false;
                input = userInput;
            } else {
                printMessage("Unable to understand input, try again");
            }
        }

        scanner.nextLine();

        return input;
    }






}
