public class Database {

    private Superhero[] superheroListe;
    int count = 0;

    public Database() {
    this.superheroListe = new Superhero[10];
    }

    public void addSuperhero(String superheroName, String name, String egenskaber, String art) {
        superheroListe[count++] = new Superhero(superheroName, name, egenskaber, art);
    }

}