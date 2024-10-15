import java.util.Arrays;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int[] facturas={500,400,750,350,900};
        double[] resultado;
        resultado = calcularImpuesto(facturas);
        System.out.println("Las facturas con impuesto incluido: "+ Arrays.toString(resultado));
    }
    public static double[] calcularImpuesto(int[] facturas){
        double[] impuesto= new double[facturas.length];
        double imp,total;
        for (int i = 0; i < facturas.length ; i++) {
            imp=facturas[i]*0.21;
            total=facturas[i]+imp;
            impuesto[i]=total;
        }
        return impuesto;
    }
}
