public class Main {

    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("P001", "Coca-Cola", 1200.00, 4);
        Articulo articulo2 = new Articulo("P002", "Papas Lays", 3400.00, 5);

        articulo1.vender(8);
        articulo1.mostrar();

        articulo1.vender(2);
        articulo1.mostrar();

        articulo1.reponer(-10);
        articulo1.mostrar();

        articulo1.reponer(10);
        articulo1.mostrar();

        System.out.println("Articulo 2");

        articulo2.vender(8);
        articulo2.mostrar();

        articulo2.vender(2);
        articulo2.mostrar();

        articulo2.reponer(-10);
        articulo2.mostrar();

        articulo2.reponer(10);
        articulo2.mostrar();
    }
}
