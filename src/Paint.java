/**
 * @author Zhenyang Li
 * @since 19 September 2017
 */

import java.util.Scanner;

/**
 * Paint class
 * @class Paint
 * @classdesc Prompt user for various parameters and outputs amount of paint needed
 */
public class Paint {
    private final static int PAINT_COVERAGE = 350, DOOR_COVERAGE = 20, WINDOW_COVERAGE = 15;
    private final static Scanner SCAN = new Scanner(System.in);


    public static void main(String[] args)
    {
        int length, width, height, door, window;
        double totalSqFt, paintNeeded;

        length = PromptInput("Room length: ");
        width = PromptInput("Room width: ");
        height = PromptInput("Room height: ");
        door = PromptInput("Amount of doors in the room: ");
        window = PromptInput("Amount of windows in the room: ");

        totalSqFt = (((width * height) * 2) + ((length * height) * 2)) - ((door * DOOR_COVERAGE) + (window * WINDOW_COVERAGE));
    }

    private static int PromptInput(String question)
    {
        while (!SCAN.hasNextInt()) {
            System.out.flush();

            System.out.print(question);

            SCAN.next();
        }

        return SCAN.nextInt();
    }
}
