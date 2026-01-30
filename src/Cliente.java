public class Cliente{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("TechSolutions SL", "B12345678", "Calle Industria 55");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(new Producto("Servidor Dell", 2500.0));
        pedido1.agregarProducto(new Producto("Windows Server", 800.0));
       
        servicioFacturacion.procesar(pedido1);

        Cliente cliente2 = new Cliente("Libreria Moderna", "A98765432", "Av. Diagonal 200, Barcelona");
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.agregarProducto(new Producto("Servidor Dell", 2500.0));
        pedido2.agregarProducto(new Producto("Windows Server", 800.0));
        
        servicioFacturacion.procesar(pedido2);
    }
}