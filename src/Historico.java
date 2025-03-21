import java.util.Stack;

public class Historico {
    private Stack<String> pilhaVoltar;
    private Stack<String> pilhaAvancar;

    public Historico() {
        this.pilhaVoltar = null; // a pilha começa vazia
        this.pilhaAvancar = null;
    }

    //Adicionar uma nova pagina e ativar o botão de voltar

    public void adicionarPagina(String paginaAtual) {
        if(pilhaVoltar == null){
            pilhaVoltar = new Stack<>(); //Novaa pilha
        }
        pilhaVoltar.push(paginaAtual);
        pilhaAvancar = null; //elinmina a pilha de Avancar ao visitar nova pagina

    }

    //Voltar para a pagina aanterior
    public String voltar(String paginaAtual) {
        if (pilhaAvancar != null && !pilhaVoltar.isEmpty()) {
            if (pilhaAvancar == null) {
                pilhaAvancar = new Stack<>();
            }
        }
    }
}
