public class Superhero {

    private String superheroName;
    private String name;
    private String egenskaber;

    public Superhero(String superheroName, String name, String attributer){
        this.superheroName = superheroName;
        this.name = name;
        this.egenskaber = attributer;
    }

    //GET-metode
    public String getSuperheroName() {
        return superheroName;
    }

    public String getName() {
        return name;
    }

    public String getEgenskaber() {
        return egenskaber;
    }


}
