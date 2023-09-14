import java.util.ArrayList;

public class Database {
    private int count = 0;

    private ArrayList<Superhero> superheroList;
     public Database() {
         this.superheroList = new ArrayList<>();


         //ArrayList<Superhero> superhero = new ArrayList<>();
         superheroList.add(new Superhero("Superman", "Clark", " Kent", "Flight", "Human"));
         superheroList.add(new Superhero("Batman", "Bruce", " Wayne", "Strong", "Human"));
         superheroList.add(new Superhero("Spider Man", "Tom", " Holland", "Web", "Human"));

     }
    public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
            Superhero superhero = new Superhero(superheroName, firstName, lastName, abilities, creature);
            superheroList.add(superhero);
        }


    public ArrayList<Superhero> getSuperheroList() {
        return superheroList;
    }
}

