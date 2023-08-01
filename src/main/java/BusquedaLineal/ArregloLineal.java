package BusquedaLineal;

import java.util.Random;

public class ArregloLineal {
    private int[] datos; //arreglo de valores
    private static Random generador = new Random();

    //crea un arreglo de un tama;o dado, y lo rellena con enteros aleatorios
    public ArregloLineal(int tamanio){
        datos = new int [tamanio];

        //llena el arreglo con valores int aleatorios, en el rango de 10 a 99
        for (int i = 0; i< tamanio; i++)
            datos[i] = 10 + generador.nextInt(90);
    }

    //realiza una busqueda lineal en los datos
    public int busquedaLineal(int claveBusqueda){
        //itera atravez del arreglo en forma secuencial
        for(int indice = 0; indice < datos.length; indice++)
            if(datos[indice] == claveBusqueda)
                return indice;
        return -1;
    }

    //metodo para imprimir los valores del arreglo
    public String toString(){
        StringBuilder temporal = new StringBuilder();
        //itera atravez del arreglo
        for (int elemento: datos)
            temporal.append(elemento + " ");
        temporal.append("\n");
        return temporal.toString();
    }
}
