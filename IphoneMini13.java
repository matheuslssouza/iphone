

public class IphoneMini13 implements Iphone {
    
    @Override
    public void exibirDetalhes() {
        System.out.println(nomeIphone+ "\n" +
        "SO: " + sistemaOperacional +  
        "\nTela: " + telaPolegadas +
        "\n Processador: " + processador +
        "\nRAM: " + memoriaRam + "\n");
    }

    String nomeIphone = "IPhone 13 Mini";
    String sistemaOperacional = "iOS 15";
    String telaPolegadas = "5,4 polegadas";
    String processador = "A15";
    String memoriaRam = "4 GB";
}
