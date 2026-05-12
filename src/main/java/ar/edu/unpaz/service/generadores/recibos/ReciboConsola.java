package ar.edu.unpaz.service.generadores.recibos;

import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;

public class ReciboConsola extends GeneradorRecibo{
    @Override
    protected String generarInfo(Pedido pedido, ITipoDescuento descuento) {
        return String.format("sin descuento: %s, nombreDescuento: %s, total: %s", pedido.calcularTotal(), descuento.getName(), pedido.calcularDescuento(descuento));
    }

    @Override
    protected void exportar(String info) {
        System.out.println("mensaje de prueba -> " + info);
    }
}