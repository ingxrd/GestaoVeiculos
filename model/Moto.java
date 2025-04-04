// Subclasse de Veiculo

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, double preco, int cilindradas) {
        super(marca, modelo, anoFabricacao, preco);
        this.cilindradas = cilindradas;
    }

    public void calcularDepreciacao(){
        double precoMoto = getPreco();
        int tempoDeDepreciacao = 2025 - getAnoFabricacao();
        for (int i = 0; i < tempoDeDepreciacao; i ++) {
            precoCarro = precoCarro * 0.88;
        }
        System.out.println("O preço do carro após a depreciaçao: " + precoMoto);
    }

    public void exibirDetalhes(){
        System.out.print("Informaçoes da Moto");
        System.out.print("Marca: " + getMarca());
        System.out.print("Modelo: " + getModelo());
        System.out.print("Ano de Fabricação: " + getAnoFabricacao());
        System.out.print("Preço: " + getPreco());
        System.out.print("Cilindradas: " + cilindradas);
    }

    public Veiculo criarCadastroVeiculo() {
        int opcao = mostrarMenuCadastroVeiculos();
        scanner.nextLine(); // Evita problemas com nextInt()

        System.out.print("Digite a marca: ");
        String marca = scanner.nextLine();
        System.out.print("Digite o modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite o ano de fabricação: ");
        int ano = scanner.nextInt();
        System.out.print("Digite o preço: ");
        double preco = scanner.nextDouble();

        switch (opcao) {
            case 1:
                System.out.print("Digite o número de portas: ");
                int numPortas = scanner.nextInt();
                return new Carro(marca, modelo, ano, preco, numPortas);

            case 2:
                System.out.print("Digite a capacidade de carga (toneladas): ");
                int capacidadeCarga = scanner.nextInt();
                return new Caminhao(marca, modelo, ano, preco, capacidadeCarga);

            case 3:
                System.out.print("Digite as cilindradas: ");
                int cilindradas = scanner.nextInt();
                return new Moto(marca, modelo, ano, preco, cilindradas);

            case 0:
                System.out.println("Saindo...");
                return null;

            default:
                System.out.println("Opção inválida!");
                return null;
        }
    }

}
