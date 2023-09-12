
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class counter {

    public static void main(String[] args)
    {
        getWrite();
    }

    private static void getWrite(){
        String[] words = null;
        int counter = 0;

        try {
            // Création d'un fileReader pour lire le fichier
            FileReader fileReader = new FileReader("example.txt");


            BufferedReader reader = new BufferedReader(fileReader);


            String line = reader.readLine();
            String str;
            while (line != null) {

             words = line.split(" ");
             counter = counter+words.length;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("nombre de word dans le fichier "+counter);
    }

}

