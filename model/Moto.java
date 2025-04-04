// Subclasse de Veiculo

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String marca, String modelo, int anoFabricacao, double preco) {
        super(marca, modelo, anoFabricacao, preco);
    }

    public void calcularDepreciacao(){
        double precoCarro = getPreco();
        int tempoDeDepreciacao = 2025 - getAnoFabricacao();
        for (int i = 0; i < tempoDeDepreciacao; i ++) {
            precoCarro = precoCarro * 0.88;
        }
        System.out.println("O preço do carro após a depreciaçao: " + tempoDeDepreciacao);
    }

    public void exibirDetalhes(){
        System.out.print("Informaçoes da Moto");
        System.out.print("Marca: " + getMarca());
        System.out.print("Modelo: " + getModelo());
        System.out.print("Marca: " + getAnoFabricacao());
        System.out.print("Marca: " + getPreco());
        System.out.print("Número de portas: " + cilindradas);

    }
}
