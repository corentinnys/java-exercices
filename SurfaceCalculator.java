import java.util.Scanner;

public class SurfaceCalculator {

    public static void main(String[] args) {

        int value1 = 0;
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez la longueur ?");
        String longueur = clavier.nextLine();
        System.out.println("Entrez la largeur  ?");
        String largeur = clavier.nextLine();

        String[] longueurArray = longueur.split(" ");
        String[] largeurArray = largeur.split(" ");

        if (longueurArray.length != 2 || largeurArray.length != 2) {
            System.out.println("Veuillez entrer une valeur suivie d'une unité (par exemple, '10 cm').");
            return;
        }

        int longueurValue = Integer.parseInt(longueurArray[0]);
        String longueurUnit = longueurArray[1];
        int largeurValue = Integer.parseInt(largeurArray[0]);
        String largeurUnit = largeurArray[1];

        float longueurEnMetres = convertisseur(longueurValue, longueurUnit);
        float largeurEnMetres = convertisseur(largeurValue, largeurUnit);

        float surface = longueurEnMetres * largeurEnMetres;

        System.out.println("La surface est : " + surface + " m²");
    }

    private static float convertisseur(int number, String unit) {
        float result = 0.0f;

        if (unit.equalsIgnoreCase("cm")) {
            result = number / 100.0f;
        } else if (unit.equalsIgnoreCase("mm")) {
            result = number / 1000.0f;
        } else {
            System.out.println("Unité non reconnue : " + unit);
        }

        return result;
    }
}
