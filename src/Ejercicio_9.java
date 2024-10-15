import java.util.Arrays;

public class Ejercicio_9 {
    public static void main(String[] args) {
        int[] preciosOriginales={100,600,500,900,300,400};
        double[] resultado;
        resultado=calcularPrecioFinal(preciosOriginales);
        System.out.println("Los precios finales son: "+ Arrays.toString(resultado));
    }
    public static double[] calcularPrecioFinal(int[] preciosOriginales){
        double[] precioFinal= new double[preciosOriginales.length];
        double precioDesc;
        for (int i = 0; i < preciosOriginales.length ; i++) {
            precioDesc=preciosOriginales[i]*0.10;
            precioFinal[i]=preciosOriginales[i]-precioDesc;
        }
        return precioFinal;
    }
}
