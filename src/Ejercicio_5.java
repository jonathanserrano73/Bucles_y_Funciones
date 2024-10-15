public class Ejercicio_5 {
    public static void main(String[] args) {
        int[] califi={4,5,3,4,4,3};
        double resultado;
        resultado=calcularPromedio(califi);
        System.out.println("El promedio de las calificaciones es: "+resultado);
    }
    public static double calcularPromedio(int[] califi){
        double suma=0,promedio;
        for (int i = 0; i < califi.length ; i++) {
            suma=suma+califi[i];
        }
        promedio=suma/califi.length;
        return promedio;
    }
}
