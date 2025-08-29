public class Aula07 {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6];

        l [0] = new Lutador("Josias", "França", 31, 1.75f, 68.9f, "Leve", 11, 2, 1);
        l[0].apresentar();
        l[0].status();

        l [1] = new Lutador("Lucas", "França", 25, 1.85f, 89.9f, "Leve", 14, 0, 0);
        l[1].apresentar();
        l[1].status();
    }
}
