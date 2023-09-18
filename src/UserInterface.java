import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static final String BLUE_BOLD = "\033[1;34m";

    public void startProgram() {
        Database superheroDatabase = new Database();
        Scanner searchSuperhero = new Scanner(System.in);

        System.out.println("Welcome to the SUPERHERO UNIVERSE!");
        Scanner scanner = new Scanner(System.in);
        boolean runProgram = true;


        int menuNumber = 0;
        while (runProgram) {
            System.out.println("\nChoose your next step and enter a number:");
            System.out.println("1 Create");
            System.out.println("2 See complete list of superhero");
            System.out.println("3 Search for superhero(es)");
            System.out.println("4 Edit superhero");
            System.out.println("9 Close");

            menuNumber = scanner.nextInt();


            //Scanner searchSuperhero = null;
            String findSuperhero = null;
            if (menuNumber == 1) {
                Scanner superheroInput = new Scanner(System.in);

                System.out.println("Enter the superhero name: ");
                String superheroName = superheroInput.next();
                System.out.println("Enter the true name (first and last): ");
                String firstName = superheroInput.next();
                String lastName = superheroInput.next();
                System.out.println("Enter superpower: ");
                String abilities = superheroInput.next();
                System.out.println("Enter which kind of creature the superhero is: ");
                String type = superheroInput.next();
                System.out.println("The superhero you have added: " +
                        superheroName + " " +
                        firstName + lastName + " " +
                        abilities + " " + type);
                superheroInput.nextLine();

                superheroDatabase.addSuperhero(superheroName, firstName, lastName, abilities, type);

            } else if (menuNumber == 2) {

                ArrayList<Superhero> superheroList = superheroDatabase.getSuperheroList();
                if (superheroList.isEmpty()) {
                    System.out.println("No superhero found");
                } else {
                    System.out.println("Complete list of superheroes:");
                    for (Superhero superhero1 : superheroList) {
                        if (superhero1 != null)
                            System.out.println(BLUE_BOLD + " Superhero: " + superhero1.getSuperheroName() +
                                    "\u001B[0m" + "\n" +
                                    " Name: " + superhero1.getFirstName() + " " + superhero1.getLastName() + "\n" +
                                    " Abilities: " + superhero1.getAbilities() + "\n" +
                                    " Type: " + superhero1.getType());
                    }
                }
            } else if (menuNumber == 3) {
                System.out.println("Enter the superhero name");
                findSuperhero = searchSuperhero.next();

                //Superhero findSuperhero = superheroDatabase.superheroList();
                if (findSuperhero != null) {
                    System.out.println("Superhero found");
                    System.out.println("Name " + Superhero.getSuperheroName());
                    System.out.println("True Name " + findSuperhero.getFirstName() + " " + findSuperhero.getLastName());
                    System.out.println("Abilities " + findSuperhero.getAbilities());
                    System.out.println("Type " + findSuperhero.getType());

                } else {
                    System.out.println("Superhero not found");
                }






                /*System.out.println("Search for superheroes:");
                findSuperhero = searchSuperhero.next();

               if (searchSuperhero.hasNext()) {
               System.out.println(superheroDatabase.findSuperhero(findSuperhero));

            } else if (!searchSuperhero.hasNextShort()) {
                System.out.printf(findSuperhero + " not found  ");

            }*/

        }else if (menuNumber == 4) {
                //redigering
                System.out.println("Enter the name of the superhero you want to edit");
                String superheroList = searchSuperhero.next();

                Superhero editSuperhero = null;


                String findSuperhero = searchSuperhero.next();


                if (superheroList.isEmpty()){
                    System.out.println("This superhero does not exist in our superhero library.");

                }else if (findSuperhero.contains(findSuperhero)){

                }







                 /* if (superhero.getSuperheroName().toLowerCase().contains(findSuperhero.toLowerCase())) {
                       return searchSuperhero;*/

                      /* if (Superhero.getSuperheroName().toLowerCase().contains(findSuperhero.toLowerCase())) {
                           System.out.println(superhero.getSuperheroName() + "\n" +
                                   superhero.getFirstName() + superhero.getLastName() + "\n" +
                                   superhero.getAbilities() + "\n" +
                                   superhero.getType());
                   }
                   editSuperhero = searchSuperhero.getSuperhero();
                   searchSuperhero.nextLine();*/
               }

                // Superhero editSuperhero = superheroDatabase.findSuperhero(findSuperhero);


             else if (menuNumber == 9) {
                System.out.println("We hope to see you again soon");
                runProgram = false;
            }
        }
    }
}

