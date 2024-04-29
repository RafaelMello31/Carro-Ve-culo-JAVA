public class Veiculo {

  protected String marca;
  protected String modelo;
  protected int ano;
  protected double valor;
  protected double imposto;
  
  public Veiculo(){
    
  }

  public Veiculo(String marca, String modelo, int ano, double valor){

    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.valor = valor;
    
  }

  public void calculaImposto(){

    int anoCalc = 2024 - this.ano;
            
    if(anoCalc <= 20) {

      this.imposto = (this.valor*1.04) - this.valor;
        System.out.println("Imposto a ser pago: R$ " + this.imposto);
    }
    else {
      System.out.println("Veículo isento de impostos.");
    }
  }
  

  
}
