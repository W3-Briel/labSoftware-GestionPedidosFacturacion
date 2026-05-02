package ar.edu.unpaz.domain.descuentos;

import ar.edu.unpaz.domain.Pedido;

public interface ITipoDescuento {
    String getName();
    double aplicarDescuento(Pedido pedido);
}
