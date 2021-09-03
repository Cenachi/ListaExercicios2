
import java.util.Scanner;

class Main {
    
    public static boolean validaPrimo(int numero) {
        
        for (int i = 2; i < numero; i++) {
            if(numero % i == 0){
                return false;
            }
        }        
        return true;
    }    

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero = teclado.nextInt();
        
        teclado.close();
        
        validaPrimo(numero);
        
       if(validaPrimo(numero) == true && numero!=1){
           System.out.println("primo");
       }else{
           System.out.println("nao e primo");
       }
    }
    
}
