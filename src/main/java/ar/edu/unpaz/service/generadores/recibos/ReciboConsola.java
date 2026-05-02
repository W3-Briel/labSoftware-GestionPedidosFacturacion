package ar.edu.unpaz.service.generadores.recibos;

import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;

public class ReciboConsola extends GeneradorRecibo{
    @Override
    protected String generarInfo(Pedido pedido, ITipoDescuento descuento) {
        return "hola perri";
    }

    @Override
    protected void mostrar(String info) {
        System.out.println("mensaje de prueba");
    }
}
