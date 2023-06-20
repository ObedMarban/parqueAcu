public class Main {
    public static void main(String[] args) {
        ParqueAcuatico parque = new ParqueAcuatico(50.0, 10.0, 20.0, 30.0);

        Compra compra1 = new Compra("Cliente 1");
        compra1.realizarCompra(parque);
        System.out.println(compra1.obtenerResumenCompra());

        Compra compra2 = new Compra("Cliente 2");
        compra2.realizarCompra(parque);
        System.out.println(compra2.obtenerResumenCompra());
    }
}

