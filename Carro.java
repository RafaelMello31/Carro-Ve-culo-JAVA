public class Carro extends Veiculo {

  int qtdPorta;
  String cor;
  String placa;
  
  public Carro() {
    
    super();
    
  }

  public Carro(String marca,String modelo, int ano, double valor,int qtdPorta, String cor, String placa){

    super(marca, modelo, ano, valor);
    this.qtdPorta = qtdPorta;
    this.cor = cor;
    this.placa = placa;
    
  }

  

}


