public class Articulo {

    private String codigo;
    private String descripcion;
    private double precio;
    private int cantidad;

    public Articulo(
        String codigo,
        String descripcion,
        double precio,
        int cantidad
    ) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio >= 0 ? precio : 0.0;
        this.cantidad = cantidad >= 0 ? cantidad : 0;
    }

    public void vender(int unidades) {
        if (unidades > 0 && this.cantidad >= unidades) {
            this.cantidad -= unidades;
        } else {
            System.out.println("No hay suficiente stock o cantidad inválida");
        }
    }

    public void reponer(int unidades) {
        if (unidades > 0) {
            this.cantidad += unidades;
        } else {
            System.out.println(
                "Error: La cantidad a reponer debe ser mayor a 0"
            );
        }
    }

    public void mostrar() {
        System.out.println(
            "Código: " +
                codigo +
                " // Descripcion: " +
                descripcion +
                " // Precio: " +
                precio +
                " // Cantidad: " +
                cantidad
        );
    }
}
