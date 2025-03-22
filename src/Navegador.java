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
        String paginaAnterior = historico.voltar();//retirado paginaAtual no ajuste
        if(paginaAnterior != null) {
            paginaAtual = paginaAnterior;
        } else {
            System.out.println("Não há páginas para voltar.");
        }
        mostrarEstado();// será usado para mostrar como esta o estado do navegador
    }

    //avancar para a proxima pagina
    public void avancar(){
        String paginaSeguinte = historico.avancar(paginaAtual);
        if(paginaSeguinte != null) {
            paginaAtual = paginaSeguinte;
        } else {
            System.out.println("Não há páginas para avancar.");
        }
        mostrarEstado();// será usado para mostrar como esta o estado do navegador
    }

    //funçãod e exibir o estado do navegador

    private void mostrarEstado() {
        if (paginaAtual == null) {
            System.out.println("PÁGINA ATUAL: Nenhuma");
        } else {
            System.out.println("PÁGINA ATUAL: " + paginaAtual);
        }

        if (historico.podeVoltar()) {
            System.out.println(" <-- BOTAO VOLTAR: Ativado");
        } else {
            System.out.println(" <-- BOTAO VOLTAR: Desativado");
        }

        if (historico.podeAvancar()) {
            System.out.println(" --> BOTAO AVANÇAR: Ativado");
        } else {
            System.out.println(" --> BOTAO AVANÇAR: Desativado");
        }
    }
}