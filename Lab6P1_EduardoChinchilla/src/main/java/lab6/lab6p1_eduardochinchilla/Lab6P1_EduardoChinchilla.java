
package lab6.lab6p1_eduardochinchilla;

import java.util.Random;

import java.util.Scanner;

public class Lab6P1_EduardoChinchilla {
    
static Scanner read = new Scanner(System.in);

static Random rand = new Random();

    public static void main(String[] args) {
        int opcion = 0;
        
        do{
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Suma de Arreglos ");
            System.out.println("2.  Vocales y Consonantes");
            System.out.println("3. Floor and Ceiling");
            System.out.println("4. Salir");
            
            opcion = read.nextInt();
            
            switch (opcion){
                case 1:{
                    System.out.println("Ingrese el tamaño del arreglo: ");
                    int tam1 = read.nextInt();
                    
                    
                    int [] array = new int[tam1];
                    
                    array = llenado1(tam1);
                    System.out.println("Notas estudiante 1: ");
                    imprimir(array);
                    System.out.println("");
                    
                    System.out.println("Ingrese el tamaño del arreglo: ");
                    int tam2 = read.nextInt();
                    
                    int [] array2 = new int [tam2];
                    
                    array2 = llenado1(tam2);
                    System.out.println("Notas estudiante 2: ");
                    imprimir(array2);
                    System.out.println("");
                    System.out.println("Suma 1: ");
                    imprimir(suma1(array,array2));
                    System.out.println("");
                    System.out.println("suma final: ");
                    
                   
                    
                    break;
                }
                case 2:{
                    System.out.println("Ingrese cadena:");
                    String s = read.next();
                    cadena(s);
                    System.out.println("La cadena es: "+cadena(s));
                    break;
                }
                case 3:{
                    System.out.println("Ingrese la lista de alturas:");
                    int tam1 = read.nextInt();
                    
                    int [] array = new int [tam1];
                    
                    imprimir(llenado(tam1));
                    System.out.println("");
                    System.out.println("La altura mayor y menor son: ");
                    imprimir(mayormenor(array));
                
                    break;
                }
                case 4:{
                    System.out.println("Ha salido del menu");
                    break;
                }
                
                
                
                
                
                default:
            }
        }
        while (opcion !=4);
    }
    public static void imprimir(int [] array){
        for (int i =0; i<array.length;i++){
            System.out.print("["+array[i]+"]");
        }
    }
    public static int[] llenado1 (int  tam1){
        int [] temp = new int [tam1];
        for (int i = 0; i<tam1;i++){
            temp [i] = rand.nextInt(101);
        }
        return temp;
       }
    public static int[] llenado (int  tam1){
        int [] temp = new int [tam1];
        for (int i = 0; i<tam1;i++){
            temp [i] = 1000+rand.nextInt(1570);
        }
        return temp;
       }
    public static int [] mayormenor(int [] alturas){
        int [] temp = new int [2];
        int max = alturas[1];
        int min = alturas[1];
        for (int i = 1; i < alturas.length;i++){
              if(alturas[i]>max){
                  max = alturas[i];
              } else if (alturas[i]<min){
                  min = alturas[i];
              }
              
        }
        System.out.println("menor es: "+min);
        System.out.println("mayor es: "+max);
        return temp;
    }
    public static char [] cadena (String s){
        char [] temp = new char[5];
        char let;
        int voc;
        String vocales ="";
        String consonantes = "";
        String candenaord="";
        for (int i = 0; i < s.length();i++){
            let = s.charAt(i);
            voc = let;
            if(voc=='a'|| voc=='e'|| voc=='i'||voc=='u'||voc=='o'|| voc=='A'||voc=='E'||voc=='I'||voc=='U'||voc=='O'){
                vocales = vocales + voc;
            } else {
                consonantes = consonantes + let; 
            }
        }
        return temp;
    }
    public static int[] suma1(int []arreglo1,int [] arreglo2){
        int suma = 0;
        int [] temp = new int[arreglo1.length];
        for (int i =0;i<arreglo1.length;i++){
            
            temp[i] += arreglo1[i]+arreglo2[i];
            suma += temp[i];
        }
        return temp;
    }
    public static int[] suma2(int []arreglo2,int []arreglo1){
       int suma = 0;
       int [] temp = new int [arreglo2.length];
       for(int i =0; i<arreglo2.length;i++){
           suma += arreglo2[i];
           temp [i] = suma;
        }
     return temp;
    }
}
