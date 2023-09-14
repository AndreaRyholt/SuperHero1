import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final String BLUE_BOLD = "\033[1;34m";  // blå
    public static void main(String[] args) {
       Database superheroDatabase = new Database();
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
            System.out.println("3 Search superhero");
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

                superheroDatabase.addSuperhero(superheroName, firstName, lastName, abilities, type);

                // superhelte bliver tilføjet og kan vises på liste, men gemmes ikke i programmet til at køre igen

            } else if (menuNumber == 2) {
                ArrayList<Superhero> superheroListe = superheroDatabase.getSuperheroListe();
                if (superheroListe.isEmpty()) {
                    System.out.println("No superhero found");
                } else {
                    System.out.println("Complete list of superheroes:");
                    for (Superhero superhero1 : superheroListe) {
                        if (superhero1 != null)
                            System.out.println(BLUE_BOLD + " Superhero: "  + superhero1.getSuperheroName() + "\u001B[0m" + "\n" + " Name: " + superhero1.getFirstName() + " " + superhero1.getLastName() + "\n" + " Abilities: " + superhero1.getAbilities() + "\n" + " Type: " + superhero1.getType());
                    }
                }
            } else if (menuNumber == 9) {
                System.out.println("We hope to see you again soon");
                runProgram = false;
            }

          //  public Superhero searchByName(superhero)
                //else (menuNumber != 1 || 9)
            }

        }
    }



//String name  = scanner.nextLine()
// while (!scanner.hasNextInt()){
// sout "du skal indaaste et tal"}
//String name  = scanner.nextLine()