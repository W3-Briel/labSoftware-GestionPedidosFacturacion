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
        StringBuilder data = new StringBuilder("idCliente,sinDescuento,nombreDescuento,precio-final\n");
        data.append(pedido.getIdCliente()+",");
        data.append(pedido.calcularTotal()+",");
        data.append(descuento.getName()+",");
        data.append(pedido.calcularDescuento(descuento)+"\n");

        return data.toString();
    }

    @Override
    protected void exportar(String info) {
        this.repo.guardarRecibo(info);
    }
}
