public class Ejercicio_7 {
    public static void main(String[] args) {
        int[] compras={800,400,600,700,200};
        aplicarDescuento(compras);
    }
    public static void aplicarDescuento(int[] compras){
        double desc,totalDesc;
        for (int i = 0; i < compras.length ; i++) {
            if(compras[i]>500){
                desc=compras[i]*0.15;
                totalDesc=compras[i]-desc;
                System.out.println("El total de su compra es de "+totalDesc);
            }else {
                System.out.println("El total de su compra es de "+compras[i]);
            }
        }
    }
}
