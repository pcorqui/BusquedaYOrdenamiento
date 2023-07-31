import java.util.Scanner;

public class PruebaBusquedaLineal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int enteroBusqueda;//clave busqueda
        int posicion; //ubicacion de la clave dee busqueda en el arreglo

        //crea el arreglo y lo muestra en pantalla
        ArregloLineal arregloBusqueda = new ArregloLineal(10);
        System.out.println(arregloBusqueda); //imprime el arreglo

        System.out.print("Escriba un valor entero (-1 para terminar): ");
        enteroBusqueda = entrada.nextInt();

        while (enteroBusqueda != -1){
            //realiza una busqueda lineal
            posicion = arregloBusqueda.busquedaLineal(enteroBusqueda);

            if( posicion == -1) //no se encontro el entero
                System.out.println("El entero " + enteroBusqueda + " no se encontro");
            else
                System.out.println("El entero " + enteroBusqueda + " se econtro en la posicion " + posicion + ".\n");


            //obtiene la entrada del usuario
            System.out.println("Escriba un valor entero (-1 para terminar): ");
            enteroBusqueda = entrada.nextInt(); //lee el siguiente entero del usuario
        }
    }
}
