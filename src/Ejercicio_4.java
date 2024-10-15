import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {

        String[] clientes={"Juan Perez", "Martin Lopez","Maria Mendez","Pablo Gonzales","Silvia Tunqui"};
        int[] compras={15,7,12,10,14};

        calcularDescuentos(clientes,compras);
    }
    public static void calcularDescuentos(String[]clientes,int[] compras){
        Scanner sc=new Scanner(System.in);
        double total,desc,totalDesc;
        for (int i = 0; i < clientes.length ; i++) {
            System.out.println("Indique el total de la compra");
            total=sc.nextDouble();
            if (compras[i]>10){
                desc=total*0.10;
                totalDesc=total-desc;
                System.out.println(clientes[i]+" tiene descuento");
                System.out.println(totalDesc);
            }
        }
    }
}
