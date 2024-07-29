package precofinal;
import java.util.Scanner;

// Escreva um programa em Java para calcular o preço final de um produto com desconto
public class PrecoFInal {
    public static void main(String[] args) {
        double preco, precoFinal;
        char fimProg = 'S';
        Scanner leia = new Scanner(System.in);
        
        while(fimProg == 'S'){ 
            // Solicite ao usuário que insira o valor original do produto
            System.out.println("Informe o preço do produto : ");
            preco = leia.nextDouble();

            // Se o valor do produto for superior a R$ 100, aplique um 
            // desconto de 15% ao produto
            // Caso contrário, se o valor do produto estiver entre R$ 50 e R$ 100, aplique um desconto de 10%.
            // Se o valor do produto for inferior a R$ 50, não aplique desconto

            if (preco >= 100) {
                precoFinal = preco - (preco * 0.15);
            }
            else if (preco >= 50 && preco < 100) {
                precoFinal = preco - (preco * 0.1);
            }
            else {
                precoFinal = preco;
            }

            // Exibe na tela o preço final do produto após o desconto
            System.out.println("Preço Final : "+precoFinal);

            System.out.println("Deseja informar outro produto? (S/N) ");
            fimProg = leia.next().toUpperCase().charAt(0);
            while (fimProg != 'S' && fimProg != 'N') {
            System.out.println("Opcao Invalida. (S/N)");
            fimProg = leia.next().toUpperCase().charAt(0);} 
            }
        }
}


