import java.util.ArrayList;

public class Superhero {

    private String superheroName;
    private String firstName;
    private String lastName;
    private String abilities;
    private String type;

    public Superhero(String superheroName, String firstName, String lastName, String abilities, String type){
        this.superheroName = superheroName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.abilities = abilities;
        this.type = type;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getAbilities() {
        return abilities;
    }

    public String getType() {
        return type;
    }



}
