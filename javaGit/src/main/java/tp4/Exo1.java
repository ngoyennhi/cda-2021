package tp4;

public class Exo1 {
	public static void main(String[] args) {
        int i, n, som;
        som = 0;
        for (i = 0; i < 4; i++) {
            System.out.println(i+"-Donnez un entier");
            n = Clavier.lireInt();
            som += n;
        }
        System.out.println("Somme = " + som);
    }
}
