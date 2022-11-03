/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.metodosOrdenamiento.negocios;

/**
 * Se ingresara una lista de datos
 * @author Alejandra Medina
 * regresara la lista ordenada con distintos metodos
 */

public class Ordenar {
    //ordenara el vector con el metodo burbuja
    public int [] bubbleSort(int vector[]){
        //Creamos un bucle del tamaño del vector -1 para comparar todos los numeros
        for(int i =0; i<vector.length-1;i++){
            
            //Guardaremos el Vector [j] de ser necesario para cambiarlo de lugar
            int auxiliar;
            
            //Creamos otro bucle para comparar numero por numero
            for(int j=0; j<vector.length -1;j++){
                
                //Si el vector[j] es mayor que el vector[j+1] cambiaran lugares
                if(vector[j]>vector[j+1]){
                    auxiliar=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=auxiliar;
                    
                }
            }
        }
        
        return vector;
    }
    
    //Imprimira tanto el vector desordenado como el ordenado
    public void imprimir(int vector []){
        for (int i=0; i<vector.length;i++){
            
            System.out.println("Vector: "+"["+i+"] = "+vector[i]);
            
        }
    }
    
    //Metodo de ordenamiento por Inserción
    public int [] insertionSort(int vector[]){
        //Creamos un bucle que tomara el primer valor de el conjunto de datos
        for(int i=1;i<vector.length;i++){
            //Lo guardara en la variable para intercambiarlo
            int auxiliar=vector[i];
            /*Usamos un for con condicionales para validar 3 cosas
            1.-Sea el numero anterior a 'i'
            2.-Sea mayar o igual a 0
            3.-Sea mayor al auxiliar*/
            for(int j=i-1;j>=0 && vector[j]>auxiliar;j--){
                vector[j+1]=vector[j];
                vector[j]=auxiliar;
            }
        }
        
        return vector;
    }
}
