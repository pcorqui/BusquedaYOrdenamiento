package BusquedaBinaria;

import java.util.Arrays;
import java.util.Random;

public class ArregloBinario {

    private int[] datos; //arreglo de valores
    private static Random generador = new Random();

    //crea un arreglo dee un tamanio dado y lo llena con enteros aleatorios
    public ArregloBinario (int tamanio){
        datos = new int[tamanio]; //crea espacio para el arreglo

        for (int i=0; i<tamanio; i++)
            datos[i] = 10 + generador.nextInt(90);
        Arrays.sort(datos); //ordena los datos de un array
    }

    //realiza una busqueda binaria en los elementos
    public int busquedaBinaria(int elementoBusqueda)
    {
        int inferior = 0; //extremo inferior del area de busqueda
        //se le resta uno para el indice superior del arreglo
        int superior = datos.length - 1;//extremo superior del area de busqueda
        int medio = (inferior + superior + 1)/2; //este es el indice medio
        int ubicacion = -1;

        do{
            System.out.println("medio" + medio);
            System.out.print(elementosRestantes(inferior, superior));

            //imprime espacios para alineacion
            for (int i = 0; i<medio; i++)
                System.out.print("   ");
            System.out.println(" * ");//indica el elemento medio actual

            //si el elemento se encuentra en medio
            if(elementoBusqueda == datos[medio])
                ubicacion = medio; //la ubicacion es el elemento medio actual
            else if(elementoBusqueda < datos[medio])
                superior = medio -1; //elimina la mitad superior
            else
                inferior = medio + 1; //elimina la mitad inferior
             medio = (inferior + superior + 1)/2; //recalcula el elemento medio

        }while((inferior<= superior) && ubicacion == -1);
        return ubicacion;
    }

    public String elementosRestantes(int inferior, int superior){
        StringBuilder temporal = new StringBuilder();

        //imprime espacios para alineacion
        for(int i = 0;i < inferior; i++)
            temporal = temporal.append("   ");

        //imprime los elementos que quedan en el arreglo
        for (int i = inferior; i <= superior; i++)
            temporal.append(datos[i] + " ");

        temporal.append("\n");
        return temporal.toString();
    }

    public String toString(){
        return elementosRestantes(0,datos.length -1 );
    }
}
