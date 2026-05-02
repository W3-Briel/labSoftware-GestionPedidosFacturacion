package ar.edu.unpaz.service.generadores.recibos;

import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;
import ar.edu.unpaz.service.generadores.exceptions.ErrorRecibos;

public abstract class GeneradorRecibo {

    public void recibo(Pedido pedido,ITipoDescuento descuento){
        this.validar(pedido);
        this.mostrar(this.generarInfo(pedido,descuento));
        this.mensajeCompletado();
    }

    protected abstract String generarInfo(Pedido pedido, ITipoDescuento descuento);
    protected abstract void mostrar(String info);

    public void validar(Pedido pedido) {
        if (pedido.getComponentes().isEmpty()) throw new ErrorRecibos("Solo se hacen recibos con pedidos con almenos un componente");
    }

    public void mensajeCompletado(){
        System.out.println("\n\n=== el recibo fue generado correctamente ===\n\n");
    }
}
