public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos personalizados
    public void estadoAtual(){
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo()); // Usando o getter
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        // Correção: Usar .equals() para comparar Strings
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        } else {
            System.out.println("Tipo de conta inválido. Use 'CC' para Conta Corrente ou 'CP' para Conta Poupança.");
            this.setStatus(false); // Não abre a conta se o tipo for inválido
            return; // Sai do método
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda tem crédito.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar em uma conta fechada.");
        }
    }

    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque de " + v + " realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque de " + v + ". Saldo atual: " + this.getSaldo());
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal(){
        int v = 0; // Correção: Inicializar 'v' para garantir que tenha um valor
        // Correção: Usar .equals() para comparar Strings
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        } else {
            System.out.println("Tipo de conta inválido, mensalidade não aplicável.");
            return; // Sai do método se o tipo não for reconhecido
        }

        if (this.getStatus()) {
            if (this.getSaldo() >= v) { // Verificar se há saldo para pagar
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade de R$" + v + " paga com sucesso por " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para pagar a mensalidade na conta de " + this.getDono());
            }
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta fechada!");
        }
    }

    //Métodos especiais (Construtor)
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }

    // Getters e Setters
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){ // Normalmente é isStatus() para booleanos
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}