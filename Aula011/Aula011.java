public class Aula011 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
       
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println("Nome: " + v1.getNome());

        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(1111);
        a1.pagarMensalidade();
    }
}
