public class Ejercicio_8 {
    public static void main(String[] args) {
        String[] empleados= {"Juan Perez", "Martin Lopez","Maria Mendez","Pablo Gonzales","Silvia Tunqui"};
        int[] horasTrabajadas={40,35,45,42,38};
        calcularPagoSemanal(empleados,horasTrabajadas);
    }
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas){
        int pago;
        for (int i = 0; i < empleados.length ; i++) {
            pago=horasTrabajadas[i]*15;
            System.out.println("El sueldo del empleado "+empleados[i]+" es de: "+pago);
        }
    }
}
