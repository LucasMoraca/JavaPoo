package Aula006;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Corrigido de isTocanod() para isTocando()
    public boolean isTocando() {
        return tocando;
    }

    // Corrigido de setTocanod() para setTocando()
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando()); // Chamada corrigida
        System.out.print("Volume: " + this.getVolume() + " ");
        // Loop for corrigido
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("[]");
        }
        System.out.println(); // Nova linha após o "gráfico" de volume
        System.out.println("----------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisValume() { // Atenção: o correto seria "maisVolume"
        if (this.isLigado()) {
            // Adicionado limite para o volume máximo
            if (this.getVolume() < 100) {
                this.setVolume(this.getVolume() + 1);
            }
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            // Adicionado limite para o volume mínimo
            if (this.getVolume() > 0) {
                this.setVolume(this.getVolume() - 1);
            }
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        // Se estiver ligado e no mudo (volume 0), volta para 50
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) { // Chamada corrigida
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) { // Chamada corrigida
            this.setTocando(false);
        }
    }
}