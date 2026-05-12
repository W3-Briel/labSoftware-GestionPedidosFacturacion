package ar.edu.unpaz.service.generadores.recibos;

import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;
import ar.edu.unpaz.repo.ReciboRepository;

public class ReciboCSV extends GeneradorRecibo{
    ReciboRepository repo;
    public ReciboCSV(ReciboRepository repo){
        this.repo = repo;
    };

    @Override
    protected String generarInfo(Pedido pedido, ITipoDescuento descuento) {
        return "mono de mierda";
    }

    @Override
    protected void exportar(String info) {
        this.repo.guardarRecibo(info);
    }
}
