package Practica_1;

public class PrimeraPractica {

    public static void main(String args[]){
     
        String[] nombres =  new String[5];
     
        nombres[0] = "Juan";
        nombres[1] = "Maria";
        nombres[2] = "Carlos";
        nombres[3] = "Luis";
        nombres[4] = "Ismael";
     
        for(String nombre : nombres) {
         
            System.out.println("Nombre: " + nombre);
         
        }
     
    }

}
