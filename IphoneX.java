

public class IphoneX  implements Iphone {
    
    @Override
    public void exibirDetalhes() {
        System.out.println(nomeIphone+ "\n" +
        "SO: " + sistemaOperacional +  
        "\nTela: " + telaPolegadas +
        "\n Processador: " + processador +
        "\nRAM: " + memoriaRam + "\n");
    }

    String nomeIphone = "IPhone X";
    String sistemaOperacional = "iOS 9";
    String telaPolegadas = "6,1 polegadas";
    String processador = "A20";
    String memoriaRam = "6 GB";
}