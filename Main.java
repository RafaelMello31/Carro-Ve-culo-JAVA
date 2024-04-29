public class Main{

  public static void main(String[] args) {

    Carro carro = new Carro("Ford", "Ka", 2020, 20000.00, 4, "Branco", "ABC-1234");
    carro.calculaImposto();

    Carro c1 = new Carro("Chevrolet", "Celta", 2010, 19000.00, 4, "Vermelho", "DRU-0B77");
    c1.calculaImposto();   
    
  }
}
