import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompteurDeMots {

    public static void main(String[] args) {
        int totalMots = 0;

        try {

            File fichier = new File("fichier.txt");


            Scanner scanner = new Scanner(fichier);


            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine().trim();

                if (!ligne.isEmpty()) {

                    String[] mots = ligne.split("\\s+");


                    totalMots += mots.length;
                }
            }


            System.out.println("Nombre total de mots dans le fichier : " + totalMots);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : le fichier n'a pas été trouvé.");
        }
    }
}