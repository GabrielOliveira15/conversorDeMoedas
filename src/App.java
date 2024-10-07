import java.util.Scanner;

import Models.RespostaBuscaCotacao;
import Services.BuscaCotacao;

public class App {
    public static void main(String[] args) throws Exception {

        BuscaCotacao buscaCotacao = new BuscaCotacao();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        String daMoeda = "";
        String paraMoeda = "";
        double valor = 0;
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("\n\n=============================================================");
            System.out.println("Seja bem-vindao/a ao Conversão de moedas :)\n");
            System.out.println("Escolha a moeda que seja inserida o valor: ");
            System.out.println("1 - Real (BRL)");
            System.out.println("2 - Dólar (USD)");
            System.out.println("3 - Euro (EUR)");
            System.out.println("4 - Libra Esterlina (GBP)");
            System.out.println("5 - Iene (JPY)");
            System.out.println("6 - Franco Suíço (CHF)");
            System.out.println("7 - Rand (ZAR)");
            System.out.println("8 - Dólar Canadense (CAD)");
            System.out.println("9 - Colombian Peso (COP)");
            System.out.println("10 - Peso Argentino (ARS)");
            System.out.println("0 - Sair");
            System.out.println("=============================================================");

            opcao = scanner.nextInt();
            if (opcao == 0) { 
                break;             
            }

            switch (opcao) {
                case 1:
                    daMoeda = "BRL";
                    break;
                case 2:
                    daMoeda = "USD";
                    break;
                case 3:
                    daMoeda = "EUR";
                    break;
                case 4:
                    daMoeda = "GBP";
                    break;
                case 5:
                    daMoeda = "JPY";
                    break;
                case 6:
                    daMoeda = "CHF";
                    break;
                case 7:
                    daMoeda = "ZAR";
                    break;
                case 8:
                    daMoeda = "CAD";
                    break;
                case 9:
                    daMoeda = "COP";
                    break;
                case 10:
                    daMoeda = "ARS";
                    break;
                default:
                    break;
            }
            System.out.println("\nDigite o valor que deseja converter: ");
            valor = scanner.nextDouble();

            System.out.println("\n=============================================================");
            System.out.println("Seja bem-vindao/a ao Conversão de moedas :)\n");
            System.out.println("Escolha a moeda para que seja convertido: ");
            System.out.println("1 - Real (BRL)");
            System.out.println("2 - Dólar (USD)");
            System.out.println("3 - Euro (EUR)");
            System.out.println("4 - Libra Esterlina (GBP)");
            System.out.println("5 - Iene (JPY)");
            System.out.println("6 - Franco Suíço (CHF)");
            System.out.println("7 - Rand (ZAR)");
            System.out.println("8 - Dólar Canadense (CAD)");
            System.out.println("9 - Colombian Peso (COP)");
            System.out.println("10 - Peso Argentino (ARS)");
            System.out.println("0 - Sair");
            System.out.println("=============================================================");

            opcao = scanner.nextInt();
            if (opcao == 0) { 
                break;             
            }

            switch (opcao) {
                case 1:
                    paraMoeda = "BRL";
                    break;
                case 2:
                    paraMoeda = "USD";
                    break;
                case 3:
                    paraMoeda = "EUR";
                    break;
                case 4:
                    paraMoeda = "GBP";
                    break;
                case 5:
                    paraMoeda = "JPY";
                    break;
                case 6:
                    paraMoeda = "CHF";
                    break;
                case 7:
                    paraMoeda = "ZAR";
                    break;
                case 8:
                    paraMoeda = "CAD";
                    break;
                case 9:
                    paraMoeda = "COP";
                    break;
                case 10:
                    paraMoeda = "ARS";
                    break;
                default:
                    break;
            }

            RespostaBuscaCotacao resposta = buscaCotacao.buscarCotacao(daMoeda, paraMoeda, valor);
            System.out.println("\n\nResultado da conversão: "+ valor + "["+daMoeda+"] corresponde a " + resposta.conversion_result() + "["+paraMoeda+"]");
            System.out.println("\n\nDeseja realizar outra conversão?");
            System.out.println("1 - Sim");
            System.out.println("0 - Não");
            opcao = scanner.nextInt();
        }

        if (opcao == 0) {
            System.out.println("\nObrigado por utilizar o Conversão de moedas :)\nSaindo...\n");
        }
    }
}
