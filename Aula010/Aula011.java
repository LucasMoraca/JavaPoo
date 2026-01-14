package Aula010;

public class Aula011 {
    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(33);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Pedro");
        a1.setMatricula(111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(112);
        b1.setCurso("Administracao");
        b1.setIdade(17);
        b1.setSexo("M");
        b1.setBolsa(1000);
        b1.pagarMensalidade();
    }
}
