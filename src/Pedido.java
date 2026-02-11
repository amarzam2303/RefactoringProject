import java.util.ArrayList;

public class Pedido{

    private Cliente cliente;
    private static final double DESCUENTO = 0.95;
    private static final double IVA = 0.21;
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Pedido(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }

    public Cliente getCliente(){
        return cliente;
    }

    public ArrayList<Producto> getlistaProductos(){
        return listaProductos;
    }

    public double calcularSubtotal(){
        double subtotal = 0; 

        /*
        for (int i = 0; i < listaProductos.size(); i++) {
            subtotal = subtotal + listaProductos.get(i).getPrecio();
        }
        */

        //Lee cada producto de la lista de productos y suma su precio al subtotal
        for(Producto producto : listaProductos){
            subtotal = subtotal + producto.getPrecio();
        }
        return subtotal;
    }

    public double carlcularDescuento(){
        //creo una variable llamada subtotal, la cual vale el resultado de calcularSubtotal
        double subtotal = calcularSubtotal();

        subtotal = subtotal * DESCUENTO;            
        return subtotal;
    }

    public boolean esDescuento(){
        double subtotal = calcularSubtotal();

        if (subtotal > 3000) {
            return true;
        } else{
            return false;
        }
    }

    public double aplicarSubtotalConIVA(){
        double subtotal = calcularSubtotal();
        subtotal = subtotal + (subtotal * IVA);
        return subtotal;
    }
}