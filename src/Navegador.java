public class Navegador {
    private Historico historico;
    private String paginaAtual;

    public Navegador () {
        this.historico = new Historico();
        this.paginaAtual = null;
    }

    //visitar uma nova pagina
    public  void visitarPagina(String url) {
        if (paginaAtual != null) {
            historico.adicionarPagina(paginaAtual);
        }
        paginaAtual = url;
        mostrarEstado(); // será usado para mostrar como esta o estado do navegador
    }

    //voltar para a pagina anterior
    public void voltar() {
        String paginaAnterior = historico.voltar(paginaAtual);
        if(paginaAnterior != null) {
            paginaAtual = paginaAnterior;
        } else {
            System.out.println("Não há páginas para voltar.");
        }
        mostrarEstado();// será usado para mostrar como esta o estado do navegador
    }
}