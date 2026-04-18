package modelos;

public class ProductoInventario {
    public String cod_producto;
    public String nomb_comercial;
    public String categoria;
    private double precio_unitario;
    private int stock_disponible;
    private int stock_minimo;

    public ProductoInventario(String cod_producto, String nomb_comercial, String categoria, double precio_unitario, int stock_disponible, int stock_minimo){
        this.cod_producto = cod_producto;
        this.categoria = categoria;
        this.nomb_comercial = nomb_comercial;
        this.precio_unitario = precio_unitario;
        this.stock_disponible = stock_disponible;
        this.stock_minimo = stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        if (stock_minimo < 0) {
            System.out.println("El stock no puede ser negativo");
            return;
        }
        this.stock_minimo = stock_minimo;
    }

    public void setStock_disponible(int stock_disponible) {
        if (stock_disponible < 0) {
            System.out.println("El stock no puede ser negativo");
            return;
        }
        this.stock_disponible = stock_disponible;
    }

    public void setPrecio_unitario(double precio_unitario) {
        if (precio_unitario <= 0) {
            System.out.println("El precio no puede ser menor o igual a cero");
            return;
        }
        this.precio_unitario = precio_unitario;
    }

    public double valorTotalInventario(){
        return stock_disponible * precio_unitario;
    }

    public String estadoStock(){
        if (stock_disponible == 0){
            return "Producto agotado";
        } else if (stock_disponible < stock_minimo){
            return "Requiere reposicion";
        } else {
            return "Stock suficiente";
        }
    }

    public void reporteFinal(){
        System.out.println("Codigo del producto: " + cod_producto);
        System.out.println("Nombre comercial: " + nomb_comercial);
        System.out.println("Categoria: " + categoria);
        System.out.println("Valor total del inventario: $: " + valorTotalInventario());
        System.out.println("Estado del stock: " + estadoStock());
        System.out.println("=========================================================");
    }
}
