import java.util.ArrayList;

public class Database {

    private Superhero[] superheroListe;
    int count = 0;

    public Database() {
    this.superheroListe = new Superhero[10];
    }


    ArrayList<Superhero> superhero = new ArrayList<>();
    Superhero superman = new Superhero("Superman", "Clark"," Kent", "Flight", "Human");
    Superhero batman = new Superhero("Batman", "Bruce", " Wayne", "Strong", "Human" );
    Superhero spiderman = new Superhero("Spider Man", "Tom", " Holland", "Web", "Human" );

    //ArrayList<Superhero> superhero = new ArrayList<>();


    public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
        superheroListe[count++] = new Superhero(superheroName, firstName, lastName, abilities, creature);
    }

}
