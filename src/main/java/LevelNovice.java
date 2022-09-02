import java.util.Scanner;

public class LevelNovice {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++ ) {
            System.out.println("Happy Gilmore");
        }

        System.out.println(biggerThanZero("Happy Gilmore"));

        System.out.println(squareOfNumber(10));

        Scanner user = new Scanner(System.in);
        System.out.println("Please enter a name?");

        String yourName = user.nextLine();
        System.out.println("Hello " + yourName);
    }

    public static String biggerThanZero(String nameLength) {
        if (nameLength.length() > 0) {
            return "The length of " + nameLength + " is greater than 0";
        } else {
            return "The length of a blank name " + nameLength + " is 0";
        }
    }

    public static int squareOfNumber(int number) {
        return number * number;
    }
}

