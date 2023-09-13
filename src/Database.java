import javax.annotation.processing.SupportedOptions;
import java.util.ArrayList;

public class Database {

    //private Superhero[] superheroListe;
    private int count = 0;

    /*public Database() {
    this.superheroListe = new Superhero[10];*/
    private ArrayList<Superhero>superheroListe;
     public Database() {
         this.superheroListe = new ArrayList<>();


         //ArrayList<Superhero> superhero = new ArrayList<>();
         superheroListe.add(new Superhero("Superman", "Clark", " Kent", "Flight", "Human"));
         superheroListe.add(new Superhero("Batman", "Bruce", " Wayne", "Strong", "Human"));
         superheroListe.add(new Superhero("Spider Man", "Tom", " Holland", "Web", "Human"));

     }
    //ArrayList<Superhero> superhero = new ArrayList<>();


   /* public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
        if (count < superheroListe.length) {
            superheroListe[count++] = new Superhero(superheroName, firstName, lastName, abilities, creature);
        } else {
            System.out.println("full");
        }*/

    public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
            Superhero superhero = new Superhero(superheroName, firstName, lastName, abilities, creature);
            superheroListe.add(superhero);
        }


    public ArrayList<Superhero> getSuperheroListe() {
        return superheroListe;
    }
}

