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
public class Paint
{
    /**
     * PAINT_COVERAGE - Amount of square feet can a gallon of paint cover
     * DOOR_COVERAGE - Amount of square feet a door takes up
     * WINDOW_COVERAGE - Amount of square feet a window takes up
     */
    private final static int PAINT_COVERAGE = 350, DOOR_COVERAGE = 20, WINDOW_COVERAGE = 15;
    /**
     * SCAN - Interprets console input
     */
    private final static Scanner SCAN = new Scanner(System.in);


    /**
     * Primary paint method that does all the calculations
     * @param {Buffer} args
     * @return {Void}
     */
    public static void main(String[] args) {
        int length, width, height, door, window;
        double totalSqFt, paintNeeded;

        length = PromptInput("Room length: ");
        width = PromptInput("Room width: ");
        height = PromptInput("Room height: ");
        door = PromptInput("Amount of doors in the room: ");
        window = PromptInput("Amount of windows in the room: ");

        totalSqFt = (((width * height) * 2) + ((length * height) * 2)) - ((door * DOOR_COVERAGE) + (window * WINDOW_COVERAGE));
        paintNeeded = totalSqFt / PAINT_COVERAGE;

        System.out.println("Total gallons of paint needed: " + (int) Math.ceil(paintNeeded) + " gallons.");
    }

    /**
     * Prompt user to enter an integer based on the question, and loop until integer only.
     * @param {Buffer} question
     * @return {Integer} User input
     */
    private static int PromptInput(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextInt()) {
            System.out.flush();

            System.out.print("Whole number only: ");

            SCAN.next();
        }

        return SCAN.nextInt();
    }
}
