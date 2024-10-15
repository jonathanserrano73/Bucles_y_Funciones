import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int dias=30,resultado;
        int[] ventas= new int[dias];
        //Crea un bucle para añadir las ventas por dia en un arreglo
        for (int i = 0; i < dias; i++) {
            System.out.println("Indique las ventas del dia "+(i+1)+": ");
            ventas[i]= sc.nextInt();
        }
        //Llama a la funcion y la guarda en la variable resultado
        resultado= Ejercicio_1.calcularIngresosMensuales(ventas, dias);
        System.out.println("El total de las ventas del mes fueron: "+resultado);
    }
    public static int calcularIngresosMensuales(int venta[],int dia){
        int total=0;
        // Usamos un bucle para sumar las ventas de todos los dias de l mes
        for (int i = 0; i < dia ; i++) {
            total=total+venta[i];
        }
        return total;
    }
}
