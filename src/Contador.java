import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor um: ");
        int valorum = scanner.nextInt();

        System.out.print("Digite o valor dois: ");
        int valordois = scanner.nextInt();

        try {
            int numeroDeInteracoes = calcularInteracoes(valorum, valordois);
            System.out.println("Número de interações: " + numeroDeInteracoes);
        } catch (IllegalArgumentException e) {
            System.out.println("O segundo valor deve ser maior que o primeiro!");
        }

        scanner.close();
    }

   
    public static int calcularInteracoes(int valorUm, int valorDois) {
        if (valorDois <= valorUm) {
            //Fiz uso de classe da biblioteca já existente para exceptions esse caso llegalArgumentException().
            throw new IllegalArgumentException(); 
        }
        int numeroDeInteracoes = valorDois - valorUm;

        
        for (int i = 0; i < numeroDeInteracoes; i++) {   
        }
        return numeroDeInteracoes;
    }
}
