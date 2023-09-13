import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database superoDatabase = new Database();
        /*ArrayList superheroNames = new ArrayList();
        superheroNames.add("Superman");
        superheroNames.add("Batman");
        superheroNames.add("Spiderman");


        System.out.println(superheroNames.get(0));
        System.out.println(superheroNames.get(1));
        System.out.println(superheroNames.get(2));*/

        System.out.println("Welcome to the SUPERHERO UNIVERSE!");

        Scanner scanner = new Scanner(System.in);

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("\nChoose your next step and enter a number:");
            System.out.println("1 Create");
            System.out.println("2 See complete list of superhero");
            System.out.println("9 Close");

            //int menuNumber = welcomeMenu.nextInt();
            int menuNumber = scanner.nextInt();

            if (menuNumber == 1) {
                Scanner superheroInput = new Scanner(System.in);


                //superheroInput.useDelimiter("[\\s,]+");

                //Hvordan sætter man input ind i array?

                System.out.println("Enter the superhero name: ");
                String superheroName = superheroInput.next();
                System.out.println("Enter the true name (first and last): ");
                String firstName = superheroInput.next();
                String lastName = superheroInput.next();
                System.out.println("Enter superpower: ");
                String abilities = superheroInput.next();
                System.out.println("Enter which kind of creature the superhero is: ");
                String type = superheroInput.next();
                System.out.println("You have entered: " + superheroName + " " + firstName + lastName + " " + abilities + " " + type);

                superoDatabase.addSuperhero(superheroName, firstName, lastName, abilities, type);

            } else if (menuNumber == 2) {
                ArrayList<Superhero> superheroListe = superoDatabase.getSuperheroListe();
                if (superheroListe.isEmpty()) {
                    System.out.println("Ingen superhelte.");
                } else {
                    System.out.println("Liste over superhelte:");
                    for (Superhero superhero1 : superheroListe) {
                        if (superhero1 != null)
                            System.out.println(" Superhero: "  + superhero1.getSuperheroName() + "\n" + " Name: " + superhero1.getFirstName() + " " + superhero1.getLastName() + "\n" + " Abilities: " + superhero1.getAbilities() + "\n" + " Type: " + superhero1.getType());
                    }
                }
            } else if (menuNumber == 9) {
                System.out.println("We hope to see you again soon");
                runProgram = false;

           /* } else if (menuNumber == 2) {
                String[] superhero = {0..10};
            }*/
                //else (menuNumber != 1 || 9)
            }

        }
    }
}


//String name  = scanner.nextLine()
// while (!scanner.hasNextInt()){
// sout "du skal indaaste et tal"}
//String name  = scanner.nextLine()