public class Compra {
    private String cliente;
    private double precioTotal;

    public Compra(String cliente) {
        this.cliente = cliente;
    }

    public void realizarCompra(ParqueAcuatico parque) {
        // Ejemplo de compra: Entrada + Comida buffet + Espectáculo nocturno + Nado con delfines
        double precio = parque.calcularTotal(parque.getPrecioEntrada(), "Hamburguesa", "VIP", "Extra");
        this.precioTotal = precio;
    }

    public String obtenerResumenCompra() {
        return "Cliente: " + cliente + "\n" +
                "Precio total: " + precioTotal;
    }
}

