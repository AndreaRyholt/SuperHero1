import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner welcomeMenu = new Scanner(System.in);

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Welcome to the SUPERHERO UNIVERSE!\n Choose your next step and enter a number:");
            System.out.println("1 Create");
            System.out.println("9 Close");

            int menuNumber = welcomeMenu.nextInt();

            if (menuNumber == 1) {
                Database superhero = new Database();
                Scanner superheroInput = new Scanner(System.in);
                superheroInput.useDelimiter("[\\s,]+");

                //Hvordan sætter man input ind i array?

                System.out.println("Enter the superhero name: ");
                String superheroName = superheroInput.next();
                System.out.println("Enter the true name: ");
                String name = superheroInput.next();
                System.out.println("Enter superpower: ");
                String abilities = superheroInput.next();
                System.out.println("Enter which kind of creature the superhero is: ");
                String type = superheroInput.next();
                System.out.println("You have entered: " + superheroName + " " + name + " " + abilities + " " + type);


                superhero.addSuperhero("Superman", "Clark Kent", "flyve", "menneske");
            }

            else if (menuNumber == 9) {
                System.out.println("We hope to see you again soon");
                runProgram = false;
            }
            //else (menuNumber != 1 || 9)
        }

    }
}
// while (!scanner.hasNextInt()){
// sout "du skal indaaste et tal"}