import java.util.Scanner;

public class Contador{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        try {
            
            System.out.println("Digite o primeiro número");
            int numeroUm = scanner.nextInt();
        
            System.out.println("Digite o segundo número");
            int numeroDois = scanner.nextInt();

            if (numeroUm > numeroDois) {

                throw new NumerosInvalidosException("O segundo número deve ser maior que o primeiro");

            }

            int quantidadeIteracoes = numeroDois - numeroUm;

            for (int i = 1; i <= quantidadeIteracoes; i++) {
                
                System.out.println("Imprimindo o número " + i);

            }

        } catch (NumerosInvalidosException e) {

            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {

            System.out.println("Por favor, forneça valores inteiros válidos.");

        } finally {

            scanner.close();

        }

   }
}
