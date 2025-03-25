public abstract class Veiculo {
    // Atributos da classe.
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double preco;

    // Construtor
    public Veiculo(String marca, String modelo, int anoFabricacao, double preco){
          this.marca = marca;
          this.modelo = modelo;
          this.anoFabricacao = anoFabricacao;
          this.preco = preco;
    }

    // Método getter

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    // Metodo abstrato: calcularDepreciacao
    public void calcularDepreciacao(){
    }

    // Método: exibirDetalhes
    public void exibirDetalhes(){
    }
}
