public class Ejercicio_2 {
    public static void main(String[] args) {
        String[] productos={"Celular","Televisor","Notebook","Parlante"};
        int[] stock={6,3,4,7};
        generarReporteBajoStock(productos,stock);
    }
    public static void generarReporteBajoStock (String[]productos, int[] stock){
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stock[i]<5){
                System.out.println(productos[i]+" tiene "+stock[i]+" unidades");
            }
        }
    }
}
