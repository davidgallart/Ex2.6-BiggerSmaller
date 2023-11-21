

package ex2.pkg6.biggersmaller;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Ex26BiggerSmaller {

    
    public static void main(String[] args) {
        
    // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program can give you the biggest and smallest number of three");
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write another number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the third number");
        int variable_3 = scanner.nextInt();
        int small, big, variable = 0;
        
        
        if(variable_1 > variable_2 && variable_1 > variable_3){
             big = variable_1;
            if(variable_2 > variable_3){
            
                 small = variable_3;
                }else{
                    
                 small = variable_3;
                }
            System.out.println("The biggest number is " + big + " The smallest number is:" + small );            
        }
        
        if(variable_2 > variable_1 && variable_2 > variable_3){
            big= variable_2;
            if(variable_1 > variable_3){
                    
            small = variable_3;
                }else{
                
                int medio = variable_3;
                small = variable_1;
            }
            System.out.println("The biggest number is " + big + "The smallest number is:" + small);        
            
        }
        
        if(variable_3 > variable_1 && variable_3 > variable_2){
            big= variable_3;
            if(variable_2 > variable_1){
           
            small = variable_1;
                }else{
                    
                    
                    small = variable_2;
                }
                    
            System.out.println("The biggest number is " + big + "The smallest number is:" + small);        
          
        } 
        
  
    
}
} 
    /*
     Primero seria cambiar la variable small de un String a un entero y luego eliminamos los variables int small porque ahora es una variable general del main
     Luego hacemos lo mismo con la variable big la creamos fuera de los bucles y eliminamos las inicializaciones
    Luego cambiamos los operadores del tercer if anidado para que hagan referencia el tercer numero
    Y por ultimo en el ultimo if anidado la primera variable small le ponemos que se asigne bien el valor al primer numero
*/