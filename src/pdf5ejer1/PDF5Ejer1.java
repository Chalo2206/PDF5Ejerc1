package pdf5ejer1;

import java.util.Scanner;

/**
 *
 * @author Gonzalo
 */
public class PDF5Ejer1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        String cadena="";
        System.out.print("Introduce la palabra : ");  
        cadena = sc.next();
        char []invertir=cadena.toCharArray();
        int cont;
        for(cont=cadena.length()-1;cont>=0;cont--){            
            System.out.print(invertir[cont]);
        }
    }
    
}
