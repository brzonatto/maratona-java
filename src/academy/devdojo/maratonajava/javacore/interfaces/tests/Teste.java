package academy.devdojo.maratonajava.javacore.interfaces.tests;

import academy.devdojo.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.interfaces.dominio.FileLoader;

public class Teste {
 public static void main(String[] args) {
    var fileLoader = new FileLoader();
    var databaseLoader = new DatabaseLoader();

    fileLoader.load();
    fileLoader.checkPermission();
    databaseLoader.load();
 }
}
