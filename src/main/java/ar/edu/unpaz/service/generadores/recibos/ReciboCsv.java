package ar.edu.unpaz.service.generadores.recibos;

import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;

public class ReciboCsv extends GeneradorRecibo{



    @Override
    protected String generarInfo(Pedido pedido, ITipoDescuento descuento) {
        return "";
    }

    @Override
    protected void exportar(String info) {

    }
}
