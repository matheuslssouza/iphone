
public class Iphone9 implements Iphone {
   
    @Override
    public void exibirDetalhes() {
        System.out.println(nomeIphone+ "\n" +
        "SO: " + sistemaOperacional +  
        "\nTela: " + telaPolegadas +
        "\n Processador: " + processador +
        "\nRAM: " + memoriaRam + "\n");
    }

    String nomeIphone = "IPhone 9";
    String sistemaOperacional = "iOS 10";
    String telaPolegadas = "3,4 polegadas";
    String processador = "A11";
    String memoriaRam = "2 GB";
}
