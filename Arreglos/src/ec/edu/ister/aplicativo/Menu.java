
package ec.edu.ister.aplicativo;

import ec.edu.ister.arreglos.Arreglo;
import java.util.Scanner;

public class Menu {
    public void menu(){
        int op,valor;
         int []vector=new int[10];
         Arreglo arreglo=new Arreglo(vector);
        Scanner lee=new Scanner (System.in);
        do{
            System.out.println("1.- Ingresar ");
            System.out.println("2.- Imprimir ");
            System.out.println("3.- Buscar Elemento Menor ");
            System.out.println("4.- Buscar Elemento Mayor ");
            System.out.println("5.- Multiplicar por escalar ");
            System.out.println("6.- Salir ");
            System.out.println("\n\nDigite la opcion : ");
            op=lee.nextInt();
            switch(op){
                case 1:
            for(int i=0;i<10;i++){
            System.out.println("Ingrese el elemento "+ (i+1)+" : ");
            vector[i]=lee.nextInt();
        }
              
                    break;
                case 2:
                    arreglo.imprimir(vector);    
                    break;
                case 3:
                    int menor=arreglo.buscarMenor(vector);
                    System.out.println("El elemento menor es : "+menor);
                    break;
                    
                case 4:
                     int mayor=arreglo.buscarMayor(vector);
                    System.out.println("El elemento mayor es : "+mayor);
                        
                    break;
                case 5:
                  System.out.print("Ingrese el Escalar : ");
                  valor=lee.nextInt();      
                  arreglo.calcular(valor);
                  arreglo.imprimir(vector);
                    
                    break;
                case 6:
                    System.out.println("Gracias por usar el sistema!!!");
                    break;
            }
        }while(op!=6);
    }
    
}
