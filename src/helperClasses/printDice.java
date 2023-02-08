package helperClasses;

public class printDice {
    public static void printDice(int input){
        switch (input){
            case 1:
                System.out.println("-----\n|   |\n| o |\n|   |\n-----");
                break;
            case 2:
                System.out.println("-----\n|o  |\n|   |\n|  o|\n-----");
                break;
            case 3:
                System.out.println("-----\n|o  |\n| o |\n|  o|\n-----");
                break;
            case 4:
                System.out.println("-----\n|o o|\n|   |\n|o o|\n-----");
                break;
            case 5:
                System.out.println("-----\n|o o|\n| o |\n|o o|\n-----");
                break;
            case 6:
                System.out.println("-----\n|o o|\n|o o|\n|o o|\n-----");
                break;
        }
    }
}
