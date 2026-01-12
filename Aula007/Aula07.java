public class Aula07 {
    public static void main(String[] args) {
        Lutador l [] = new Lutador[6];

        l [0] = new Lutador("Josias", "França", 31, 1.75f, 88.9f, "Leve", 11, 2, 1);
        l[0].apresentar();
        l[0].status();

        l [1] = new Lutador("Lucas", "França", 25, 1.85f, 87.9f, "Leve", 14, 0, 0);
        l[1].apresentar();
        l[1].status();

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();

    }
}
