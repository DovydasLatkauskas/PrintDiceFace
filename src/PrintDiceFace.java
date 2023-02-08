import static helperClasses.checkInput.checkInput;
import static helperClasses.printDice.printDice;

/**
 * main class for running the application
 */
public class PrintDiceFace {
    /**
     * main method for running the app
     * @param args takes in a list of ints from 1 to 6 and prints dice faces one after another, skipping over any invalid input
     */
    public static void main(String[] args) {

        for (String argument:args){ // loops for each argument provided when running the app
            int input = checkInput(argument);
            if(input == 0){ // if invalid input we just skip this input
                continue;
            }
            else{
                printDice(input); // only receives int that is 1-6
            }

        }

    }
}

/* Open the TODO tab to help you see what needs doing.
            You can rename these comments to remove them from the list.
            This is better than deleting them because you can see what did need
            doing. Alternatively add "DONE" to the comment.
*/
//  Make multiple designs on paper
//  Compare designs
/*  Upload design(s) as images into the design folder,
            keeping file size small
*/
// todo 5 Code, test, and refine a design
// todo 6 Add comments and JavaDoc comments
/* todo 7 Generate the JavaDocs from Tools > Generate JavaDoc...
            Save in the javadoc directory
            Open javadoc/index.html in IntelliJ and use the in-built browser
            to view (the IJ logo that is left-most in the list of browsers)
*/
// todo 8 Optionally, start filling in writing.md
// todo 9 Maybe code, test, and refine a different design for comparison
// todo 10 Complete the reflections.md file