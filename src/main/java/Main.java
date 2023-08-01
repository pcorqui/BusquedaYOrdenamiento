public class Main {
    public static void main(String[] args) {
        int array[] = new int[5];

        for(int i = 0;i<array.length;i++)
            array[i] = i;

        for (int i = 0;i<=array.length;i++)
            System.out.println(array[i]);

        //length imprime la longitud del arreglo
        System.out.println("longitud: " + array.length);
    }
}
