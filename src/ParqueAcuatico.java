public class ParqueAcuatico {
    private double precioEntrada;
    private double precioComidaBuffet;
    private double precioEspectaculo;
    private double precioNadoDelfines;

    public ParqueAcuatico(double precioEntrada, double precioComidaBuffet, double precioEspectaculo, double precioNadoDelfines) {
        this.precioEntrada = precioEntrada;
        this.precioComidaBuffet = precioComidaBuffet;
        this.precioEspectaculo = precioEspectaculo;
        this.precioNadoDelfines = precioNadoDelfines;
    }

    public double calcularTotal(double precio) {
        return precio;
    }

    public double calcularTotal(double precio, String comidaBuffet) {
        return precio + precioComidaBuffet;
    }

    public double calcularTotal(double precio, String comidaBuffet, String espectaculoNocturno) {
        return precio + precioComidaBuffet + precioEspectaculo;
    }

    public double calcularTotal(double precio, String comidaBuffet, String espectaculoNocturno, String tipoNadoDelfines) {
        return precio + precioComidaBuffet + precioEspectaculo + precioNadoDelfines;
    }

    public double getPrecioEntrada() {
        return 0;
    }
}
