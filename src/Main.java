import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hold superhero = new Hold();

        Scanner input = new Scanner(System.in);
        input.useDelimiter("[\\s,]+");

        //Hvordan sætter man input ind i array?

            System.out.println("Enter a superhero: ");
            String superheroName = input.next();
            String name = input.next();
            String egenskaber = input.next();
            String art = input.next();
            System.out.println("You have entered: " + superheroName + " " + name + " " + egenskaber + " " + art);



        superhero.tilføjSuperhero("Superman", "Clark Kent", "flyve", "menneske");



    }
}
