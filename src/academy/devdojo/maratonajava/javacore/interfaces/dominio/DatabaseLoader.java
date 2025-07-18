package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from the database...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the database...");
    }

}
