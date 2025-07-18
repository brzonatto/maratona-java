package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Loading data from the file...");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from the file...");
    }
}
