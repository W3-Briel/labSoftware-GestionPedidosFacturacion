package ar.edu.unpaz.domain.descuentos;

import ar.edu.unpaz.domain.Pedido;

public class Transferencia implements ITipoDescuento{
    @Override
    public String getName() {
        return "";
    }

    // 5% de descuento si el total de la compra es mayor a 200
    @Override
    public double aplicarDescuento(Pedido pedido) {
        return pedido.calcularTotal() > 200 ? pedido.calcularTotal() * 0.95 : pedido.calcularTotal();
    }
}
