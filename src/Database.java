import java.lang.reflect.Array;
import java.util.ArrayList;

public class Database {
    private int count = 0;

    public ArrayList<Superhero> superheroList = new ArrayList<>();

    public Database() {
        this.superheroList = new ArrayList<>();

        superheroList.add(new Superhero("Superman", "Clark", " Kent", "Flight", "Human"));
        superheroList.add(new Superhero("Batman", "Bruce", " Wayne", "Strong", "Human"));
        superheroList.add(new Superhero("Spiderman", "Peter", " Parker", "Web", "Human"));

    }
    public String getSuperheroList();
    return superheroList;

    public void addSuperhero(String superheroName, String firstName, String lastName, String abilities, String creature) {
        Superhero superhero = new Superhero(superheroName, firstName, lastName, abilities, creature);
        superheroList.add(superhero);
    }

    public ArrayList<String> findSuperhero(String findSuperheroName) {
        ArrayList<String> searchSHN = new ArrayList<>();

        for (Superhero superhero : superheroList) {
            if (superhero.getSuperheroName().toLowerCase().contains(findSuperheroName.toLowerCase())) {
                if (!searchSHN.contains(superhero.getSuperheroName()));
                searchSHN.add(superhero.getSuperheroName());
            }
        }
        return searchSHN;

        }
    }