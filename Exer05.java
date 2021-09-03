
import java.util.Scanner;

class Main {
    
    public static boolean validaPalindromo(int vetor[]){
        
        boolean palindrom = true;
        
        for (int i = 0; i <vetor.length; i++) {
            if(vetor[i] != vetor[vetor.length-i-1]){
                palindrom = false;
            }
        }        
        return palindrom;        
    }
   
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int quant = teclado.nextInt();
        
        int vetor[] = new int[quant];
        
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }
        
        teclado.close();
        
        System.out.println(validaPalindromo(vetor));
        
    }    
}