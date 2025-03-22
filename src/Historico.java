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
            pilhaAvancar.push(paginaAtual);
            String paginaAnterior = pilhaVoltar.pop();//Remove o item que está no topo da pilha

            if(pilhaVoltar.isEmpty()){
                pilhaVoltar = null; // elimina pilha vazia
            }
            return paginaAnterior;
        }
        return null;
    }

    //Avançar proxima pagina
    public String avancar(String paginaAtual) {
        if (pilhaAvancar != null && !pilhaAvancar.isEmpty()) {
            if (pilhaVoltar == null) {
                pilhaVoltar = new Stack<>();
            }
            pilhaVoltar.push(paginaAtual);
            String paginaSeguinte = pilhaAvancar.pop();//Remove item que está no topo da pilha

            if (pilhaAvancar.isEmpty()) {
                pilhaAvancar = null; //elimina pilha vazia
            }
            return paginaSeguinte;
        }
        return null;
    }

    //metodo de consulta
    public boolean podeVoltar() {
        return pilhaVoltar != null && !pilhaVoltar.isEmpty();
    }

    public boolean podeAvancar() {
        return pilhaAvancar != null && !pilhaAvancar.isEmpty();
    }
}
