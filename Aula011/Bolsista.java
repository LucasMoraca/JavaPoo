public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa do bolsista " + this.getNome());
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade com desconto do bolsista " + this.getNome());
    }

    public float getBolsa() {
        return bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
