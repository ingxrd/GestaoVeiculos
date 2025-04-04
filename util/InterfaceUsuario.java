import model.*
import java.util.Scanner;
import java.util.array java

// Solicita informaçoes e exibe dados cadastrados.


public class InterfaceUsuario {
    
    // Instancia Scanner
    private Scanner scanner;
    public InterfaceUsuario() {this.scanner = new Scanner(System.in)}; 


    // Método Menu Seleção Cadastro de Veículos
    public int mostrarMenuCadastroVeiculos(){
        System.out.println("\n=== SELECIONE O TIPO DE VEÍCULO PARA CADASTRO");
        System.out.println("1 - Carro");
        System.out.println("2 - Caminhão");
        System.out.println("3 - Moto");
        System.out.println("0 - Sair");
        return scanner.nextInt();
    }


    // Guarda informaçoes dos veículos na Array para exibição posterior
    List<Veiculo> veiculos = new ArrayList<>;

    // Laço FOR para exibição.
    // Para exibição dos veículos, basta aplicar um laço de repetição for
    // É possível fazer um for por vez:


   /*mostra todos os Carros.
    for (Veiculo v : Veiculos) {
        if (v instanceof Carro) {
            v.exibirDetalhes();
        }
    }

    // mostra todos os Caminhões.
    for (Veiculo v : Veiculos) {
        if (v instanceof Caminhao) {
            v.exibirDetalhes();
        }
    }

    // Mostra Motos.
    // mostra todos os Carros.
    for (Veiculo v : Veiculos) {
        if (v instanceof Moto) {
            v.exibirDetalhes();
        }
    }
    */

    // Também é possível usar métodos auxiliares. Dessa forma, fica mais limpo
    private void listarPorTipoVeiculo(Class<?> tipo){
        for (Veiculo v : veiculos){
            if (tipo.isIstance)(v)){
                v.exibirDetalhes();
            }
        }
    }

    // chamando as listas
    listarPorTipoVeiculo(Carro.class);
    listarPorTipoVeiculo(Caminhao.class);
    listarPorTipoVeiculo(Moto.class);


    public Veiculo criarCadastroVeiculo(){
        int opcao = mostrarMenuCadastroVeiculos();
        if (opcao == 0) {
            return null;

            // usar switch chamando metodos
        }
    }
}
