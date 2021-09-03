
import java.util.Arrays;
import java.util.Scanner;

class Main {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int quant = teclado.nextInt();
        
        int vetor[] = new int[quant];
        
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }
        
        teclado.close();
        
        System.out.print("Numeros informados: ");
        for (int i = 0; i <vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        
        Arrays.sort(vetor);
        
        System.out.print("\n\nNumeros em ordem crescente: ");
        for (int i = 0; i <vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
}