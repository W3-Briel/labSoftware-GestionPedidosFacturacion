package ar.edu.unpaz.service;
import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;
import ar.edu.unpaz.service.generadores.recibos.*;

public class PedidoService {
    private GeneradorRecibo generador;
    public PedidoService(GeneradorRecibo generador){
        this.generador = generador;
    }

    public void mostrarRecibo(Pedido pedido, ITipoDescuento descuento){
        generador.recibo(pedido,descuento);
    }
}
