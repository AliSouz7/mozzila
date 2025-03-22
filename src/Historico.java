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
    public String voltar() {
        if (pilhaVoltar != null && !pilhaVoltar.isEmpty()) {
            if (pilhaAvancar == null) {
                pilhaAvancar = new Stack<>();
            }
            // Pegamos a página atual e jogamos na pilha de avançar
            String paginaAtual = pilhaVoltar.pop();
            pilhaAvancar.push(paginaAtual);

            // Se ainda houver páginas na pilha de voltar, retorna a nova página atual
            return pilhaVoltar.isEmpty() ? paginaAtual : pilhaVoltar.peek();

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
            // Recupera a página seguinte e atualiza a pilha corretamente
            String paginaSeguinte = pilhaAvancar.pop();
            return paginaSeguinte;
        }
        return paginaAtual; // Mantém a página atual caso não haja página para avançar
    }

    //metodo de consulta
    public boolean podeVoltar() {
        return pilhaVoltar != null && !pilhaVoltar.isEmpty();
    }

    public boolean podeAvancar() {
        return pilhaAvancar != null && !pilhaAvancar.isEmpty();
    }
}
