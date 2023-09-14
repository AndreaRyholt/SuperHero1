import java.util.ArrayList;

public class Database {
    private int count = 0;

    private ArrayList<Superhero>superheroListe;
     public Database() {
         this.superheroListe = new ArrayList<>();


         //ArrayList<Superhero> superhero = new ArrayList<>();
         superheroListe.add(new Superhero("Superman", "Clark", " Kent", "Flight", "Human"));
         superheroListe.add(new Superhero("Batman", "Bruce", " Wayne", "Strong", "Human"));
         superheroListe.add(new Superhero("Spider Man", "Tom", " Holland", "Web", "Human"));

     }
    public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
            Superhero superhero = new Superhero(superheroName, firstName, lastName, abilities, creature);
            superheroListe.add(superhero);
        }


    public ArrayList<Superhero> getSuperheroListe() {
        return superheroListe;
    }
}

