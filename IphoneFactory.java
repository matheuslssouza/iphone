
import java.util.*;

public class IphoneFactory {
    final int ARRAYCONVERSAO = 1;

    public void criarIphone() {
        Scanner scanner = new Scanner(System.in);
        imprimirMenu();
        int opcaoEnum = scanner.nextInt();
        

        switch (TypeIphoneEnum.values()[(opcaoEnum - ARRAYCONVERSAO)]) {
            case IPHONE_9:
            Iphone iphone9 = new Iphone9();
            iphone9.exibirDetalhes();
            break;
            case IPHONE_X:
            Iphone iphoneX = new IphoneX();
            iphoneX.exibirDetalhes();
            break;
            case IPHONE_13_MINI:
            Iphone iphone13 = new IphoneMini13();
            iphone13.exibirDetalhes();
            break;

        }

      

    }

    public void imprimirMenu(){
        System.out.println("Insira qual Iphone deseja criar : \n 1 - Iphone X \t 2 - Iphone 9\t 3 - Iphone 13 Mini ");
    }

}