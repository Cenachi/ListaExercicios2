
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        
        int vetor[] = new int[5];
                
        for (int i = 0; i < 5; i++) {
           vetor[i] = teclado.nextInt();            
        }
        
        teclado.close();
        
        System.out.print("Vetor inicial: ");
        for (int i = 0; i <5; i++) {
            System.out.print(vetor[i]+" ");   
        }
        
        for (int i = 0; i < 5; i++) {
            if(i%2==0){
                vetor[i] += (vetor[i]*0.02);
            }else{
                vetor[i] += (vetor[i]*0.05);
            }
        }
       
        System.out.print("\n\nVetor resultante: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i]+" ");
        }        
    }    
}
