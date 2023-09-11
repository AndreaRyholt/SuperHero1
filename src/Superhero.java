public class Superhero {

    private String superheroName;
    private String name;
    private String egenskaber;
    private String art;

    public Superhero(String superheroName, String name, String attributer, String art){
        this.superheroName = superheroName;
        this.name = name;
        this.egenskaber = attributer;
        this.art = art;
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

    public String getArt() {
        return art;
    }


}
