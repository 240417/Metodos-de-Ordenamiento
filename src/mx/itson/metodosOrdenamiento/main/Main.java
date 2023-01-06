/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.metodosOrdenamiento.main;

import java.util.Scanner;
import mx.itson.metodosOrdenamiento.negocios.Ordenar;

/**
 *
 * @author Alejandra Medina
 */
public class Main {

    /**
     * Utilizaremos el metodo burbuja para ordenar el vector
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
        int [] vector={10,1,7,5,3};
        Ordenar ordenar = new Ordenar();
        Scanner sr= new Scanner(System.in);

        System.out.println("---VECTOR SIN ORDENAR---");
        ordenar.imprimir(vector);
        
        System.out.println("");
        System.out.println("--METODOS DE ORDENAMIENTO--");
        System.out.println("");
        System.out.println("1.-Metodo BURBUJA(BUBBLESORT)");
        System.out.println("");
        System.out.println("2.-Metodo INSERCIÓN(INSERTIONSORT)");
        System.out.println("");
        System.out.println("3.-Metodo de SELECCIÓN(SELECTIONSORT)");
        System.out.println("");
        System.out.println("4.-");
        System.out.println("");
        System.out.println("5.-");
        System.out.println("SELECCIONA UNA OPCIÓN [1...5] :");
        int teclado = sr.nextInt();
        
        System.out.println("---VECTOR ORDENADO---");
        
        //Metodos
        switch(teclado){
            case 1: {
                
                ordenar.imprimir(ordenar.bubbleSort(vector)); 
                break;}
            case 2:{
                
                ordenar.imprimir(ordenar.insertionSort(vector));
                break;}
            case 3:{
                
                ordenar.imprimir(ordenar.selectionSort(vector));
                break;}
        }
    
        
    }
    
}
