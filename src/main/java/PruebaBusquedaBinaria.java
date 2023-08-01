import java.util.Scanner;

public class PruebaBusquedaBinaria {
    public static void main(String[] args) {
        //crea un objeto Scanner para recibir datos de entrada
        Scanner entrada = new Scanner(System.in);

        int enteroABuscar; //clave busqueda
        int posicion; //ubicacion de la clave de busqueda en el arreglo

        //crea un arreglo y lo muestra en pantalla
        ArregloBinario arregloBusqueda = new ArregloBinario(16);
        System.out.println(arregloBusqueda);

        //obtiene la entrada del usuario
        System.out.println("Escriba un valor entero (-1 para salir)");
        enteroABuscar = entrada.nextInt();
        System.out.println();

        //recibe un entero como entrada en forma repetida; -1 termina el programa
        while(enteroABuscar != -1)
        {
            //usa la busqueda binaria para tratar de encontrar el entero
            posicion = arregloBusqueda. busquedaBinaria(enteroABuscar);

            //el valor de retorno -1 indica que no sse encontro el entero
            if(posicion == -1)
                System.out.println("El entero " + enteroABuscar + " no se encontro.\n");
            else
                System.out.println("El entero " + enteroABuscar + " se encontro en la posicion " + posicion + ".\n");

            //obtiene entrada del usuario
            System.out.println("Escriba un valor entero (-1 para salir): ");
            enteroABuscar = entrada.nextInt(); //lee un entero del usuario
            System.out.println();
        }
    }
}
