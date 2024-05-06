import com.cfloresh.almacen.*;

public class mainProductos {

    private static final int MAX_PRODUCTS  = 8;

    public static void main(String[] args) {

        Producto[] productos = new Producto[MAX_PRODUCTS];

        /* Productos lacteos */
        productos[0] = new Lacteo("Leche", 24.12, 1, 8);
        productos[1] = new Lacteo("Crema", 17.99, 3, 10);

        /* Frutas */
        productos[2] = new Frutas("Manzana", 7.50, 0.075, "Rojo");
        productos[3] = new Frutas("Pera", 12.5, 0.09, "Verde");

        /* Limpieza */
        productos[4] = new Limpieza("Casa-Blanca", 23.50, "jabon", 2);
        productos[5] = new Limpieza("Lysol", 34.50, "Cloro", 1.5);

        /* No perecible */
        productos[6] = new NoPerecible("Jamon", 23.50, 250, 135);
        productos[7] = new NoPerecible("Hersheys", 12.50, 230, 95);

        for(Producto prod : productos) {
            System.out.println(prod);
        }
    }
}
