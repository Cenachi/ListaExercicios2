
import java.util.Scanner;

class Main {

    public static boolean validaPalindromo(int vetor[]){
        
        boolean palindrom = false;
        
        if(vetor.length % 2 ==0){
            for (int i = 0; i < vetor.length/2-1; i++) {
                if(vetor[i] != vetor[vetor.length-i-1]){
                    return false;
                }else{
                    palindrom = true;
                }
            }
        }else{
            for (int i = 0; i < (vetor.length-1)/2-1; i++) {
                if(vetor[i] != vetor[vetor.length-i-1]){
                    return false;
                }
                palindrom = true;
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
