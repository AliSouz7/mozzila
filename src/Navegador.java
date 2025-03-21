public class Navegador {
    private Historico historico;
    private String paginaAtual;

    public Navegador () {
        this.historico = new Historico();
        this.paginaAtual = null;
    }
}