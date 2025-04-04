// subclasse de Veiculo

public class Carro extends Veiculo{
    int numPortas;

    public Carro(String marca, String modelo, int anoFabricacao, double preco, int numPortas) {
        super(marca, modelo, anoFabricacao, preco);
        this.numPortas = numPortas;
    }

    public void calcularDepreciacao(){
        double precoCarro = getPreco();
        int tempoDeDepreciacao = 2025 - getAnoFabricacao();
        for (int i = 0; i < tempoDeDepreciacao; i ++) {
            precoCarro = precoCarro * 0.90;
        }
        System.out.println("O preço do carro após a depreciaçao: " + precoCarro);
    }


    public void exibirDetalhes(){
        System.out.print("Informaçoes do Carro");
        System.out.print("Marca: " + getMarca());
        System.out.print("Modelo: " + getModelo());
        System.out.print("Ano de Fabricação: " + getAnoFabricacao());
        System.out.print("Preço: " + getPreco());
        System.out.print("Número de portas: "+ numPortas);
    }
}