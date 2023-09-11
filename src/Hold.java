public class Hold {

    private Superhero[] superheroListe;
    int count = 0;

    public Hold() {
    this.superheroListe = new Superhero[10];
    }

    public void tilføjSuperhero(String superheroName, String name, String egenskaber, String art) {
        superheroListe[count++] = new Superhero(superheroName, name, egenskaber, art);
    }

}
