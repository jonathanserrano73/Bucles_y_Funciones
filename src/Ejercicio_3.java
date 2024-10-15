public class Ejercicio_3 {
    public static void main(String[] args) {
        String[] clientes={"Juan Perez", "Martin Lopez","Maria Mendez","Pablo Gonzales","Silvia Tunqui"};
        int[] facturasPendientes={550,450,700,650,300};

        enviarFacturas(clientes,facturasPendientes);
    }
    public static void enviarFacturas(String[]clientes, int[]facturasPendientes){
        System.out.println("Clientes con facturas pendientes");
        for (int i = 0; i < clientes.length ; i++) {
            if (facturasPendientes[i]>500){
                System.out.println(clientes[i]);
            }
        }
    }
}
