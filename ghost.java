public class ghost {
    private String color;

    public ghost (String couleur) {
        setColor(couleur);
    }

    private void setColor(String couleur) {
        color = couleur;
    }

    private String getColor() {
        return "La couleur est " + color;
    }

    public static void main(String[] args) {
        ghost ghost = new ghost("Blanc");
        System.out.println(ghost.getColor());
    }
}