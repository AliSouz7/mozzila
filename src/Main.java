import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        Navegador navegador = new Navegador();

    //O menu vai se repetir até que a opcão de sair seja selecionada

        while (true) {
            System.out.println("MENU - NAVEGADOR");
            System.out.println("1 - Nova pagina");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avancar");
            System.out.println("4 - Sair");
            System.out.print(" ESCOLHA UMA OPCAO: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    navegador.visitarPagina(url);
                    break;
                case 2:
                    navegador.voltar();
                    break;
                case 3:
                    navegador.avancar();
                    break;
                case 4:
                    System.out.println("Navegador encerrado");
                    scanner.close();
                    return;
                default: System.out.println("Opcao invalida, tente novamente.");
            //default usado caso o usuario selecionar alguma opcao fora do indicado.
            }

        }
    }
}