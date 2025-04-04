// Subclasse de Veiculo

public class Caminhao extends Veiculo{
    int capacidadeCargaToneladas;

    public Caminhao(String marca, String modelo, int anoFabricacao, double preco, int capacidadeCargaToneladas){
        super(marca, modelo, anoFabricacao, preco);
        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }

    public void calcularDepreciacao(){
        double precoCaminhao = getPreco();
        int tempoDeDepreciacao = 2025 - getAnoFabricacao();
        for (int i = 0; i < tempoDeDepreciacao; i ++) {
            precoCarro = precoCarro * 0.92;
        }
        System.out.println("O preço do carro após a depreciaçao: " + precoCaminhao);
    }

    public void exibirDetalhes(){
        System.out.print("Informaçoes da Caminhão");
        System.out.print("Marca: " + getMarca());
        System.out.print("Modelo: " + getModelo());
        System.out.print("Ano de Fabricação: " + getAnoFabricacao());
        System.out.print("Preço: " + getPreco());
        System.out.print("Capacidade em Toneladas: " + capacidadeCargaToneladas);

    }


}