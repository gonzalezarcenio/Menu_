
package ec.edu.ister.arreglos;
public class Arreglo {
    private int vector[]=new int[10];
    
    
    public Arreglo(int []vector) {
        this.vector=vector;
    }
    public int[] getVector() {
        return vector;
    }
    public void setVector(int[] vector) {
        this.vector = vector;
    }
    public void imprimir(int vector[]){
        for(int i=0;i<10;i++){
            System.out.print(vector[i]+" -> ");
        }
    }
    public int buscarMenor(int []vector){
        int aux=vector[0];
        int i=1,p=0;
        do{
            if(aux>vector[i]){
                aux=vector[i];
                p=i;
            }
            i++;
        }while(i<vector.length);
        System.out.println("el elemento menor se encuentra en la pocision : " +(p+1));
        return aux;
    }
    public int buscarMayor(int []vector){
        int aux=vector[0];
        int i=1,p=0;
        do{
            if(aux<vector[i]){
                aux=vector[i];
                p=i;
            }
            i++;
        }while(i<vector.length);
        System.out.println("\nel elemento mayor se encuentra en la pocision : " +(p+1));
        return aux;
    }
    public void calcular(int valor){
        for(int i=0;i<10;i++){
            vector[i]=vector[i]*valor;
        }
    }
}
