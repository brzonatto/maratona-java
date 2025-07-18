package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 1000;
    
    void load();
    
    default void checkPermission() {
        System.out.println("Checking permission to load data...");       
    }
}
