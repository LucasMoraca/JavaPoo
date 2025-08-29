

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //Método Construtor (Corrigido)
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, String categoria, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        // Chama o setPeso para que a categoria seja definida na criação do objeto
        this.setPeso(peso); 
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //Métodos Públicos
    public void apresentar() {
        System.out.println("-------------------------------------------");
        System.out.println("Chegou a hora! Apresentamos o lutador: " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        // Corrigido: Adicionado espaço antes de "Anos"
        System.out.println(this.getIdade() + " Anos e " + this.getAltura() + "m de altura"); 
        System.out.println("Pesando " + this.getPeso() + " Kg");
        // Corrigido: Adicionado espaço antes de "vitórias"
        System.out.println(this.getVitorias() + " vitórias"); 
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("-------------------------------------------");
    }

    public void status() {
        // Método status preenchido
        System.out.println("===== STATUS DO LUTADOR =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("===========================");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    //Métodos Especiais (Getters e Setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        //Sempre que o peso é modificado, a categoria é reavaliada
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    
    // Corrigido: O método precisava receber um parâmetro inteiro
    public void setEmpates(int empates) { 
        this.empates = empates;
    }
}