import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    private int count = 0;

    private ArrayList<Superhero> superheroList = new ArrayList<>();

    public Database() {
        this.superheroList = new ArrayList<>();

        superheroList.add(new Superhero("Superman", "Clark", " Kent", "Flight", "Human"));
        superheroList.add(new Superhero("Batman", "Bruce", " Wayne", "Strong", "Human"));
        superheroList.add(new Superhero("Spider Man", "Tom", " Holland", "Web", "Human"));

    }
    public String getSuperheroList();
    return superheroList;

    public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
        Superhero superhero = new Superhero(superheroName, firstName, lastName, abilities, creature);
        superheroList.add(superhero);
    }

    public ArrayList<String> findSuperhero(String superheroName) {
        ArrayList<String> searchSHN = new ArrayList<>();

        for (Superhero superhero : superheroList) {
            if (superhero.getSuperheroName().contains(superheroName)) {
                if (!searchSHN.contains(superhero.getSuperheroName()));
                searchSHN.add(superhero.getSuperheroName());
            }
        }
        return searchSHN;
        // return null;


        }
    }


    //Hvad er det her?
   /* public ArrayList<Superhero> getSuperheroList () {
        return superheroList;*/


//public Superhero searchSuperhero (String superheroName) {
//for (Superhero superhero : Superherolist) {
//if (superhero ! = null superhero.getsuperheroname
//return superhero;
}
