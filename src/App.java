import java.util.Scanner;

public class App {
    
    // Início do Programa
    public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double tempo_aproximado;
        double megabytes;
        double megabits;

        // Solicitação de Dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o tamanho do aquivo para download em MB " );
        megabytes = teclado.nextDouble();
        System.out.println ("Informe a velocidade de um link de internet em Mbps " );
        megabits = teclado.nextDouble();

        // Fazer o Calculo do Tempo Aproximado
        tempo_aproximado = megabytes / megabits / 60;


        // Exibir a Resposta para o Usuário
        System.out.println ("O tempo aproximado do download é de " + tempo_aproximado + "minutos");

    }
}
