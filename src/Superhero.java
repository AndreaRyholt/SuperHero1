public class Superhero {

    private String superheroName;
    private String name;
    private String abilities;
    private String type;

    public Superhero(String superheroName, String name, String attributer, String art){
        this.superheroName = superheroName;
        this.name = name;
        this.abilities = attributer;
        this.type = art;
    }

    //GET-metode
    public String getSuperheroName() {
        return superheroName;
    }

    public String getName() {
        return name;
    }

    public String getAbilities() {
        return abilities;
    }

    public String getType() {
        return type;
    }



}
