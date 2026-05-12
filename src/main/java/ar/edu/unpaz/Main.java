package ar.edu.unpaz;

import ar.edu.unpaz.domain.Componente;
import ar.edu.unpaz.domain.Pedido;
import ar.edu.unpaz.domain.descuentos.ComboGamer;
import ar.edu.unpaz.domain.descuentos.ITipoDescuento;
import ar.edu.unpaz.domain.descuentos.Transferencia;
import ar.edu.unpaz.service.PedidoService;
import ar.edu.unpaz.service.generadores.recibos.GeneradorRecibo;
import ar.edu.unpaz.service.generadores.recibos.ReciboConsola;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Componente cpu = new Componente("cpu", 1000,1);
        Componente ram = new Componente("ram fachera 2gb", 500, 2);

        Pedido pedido1 = new Pedido("angel");
        pedido1.sumarComponente(cpu);
        pedido1.sumarComponente(ram);

        // descuentos
        ITipoDescuento comboGamer = new ComboGamer();
        ITipoDescuento transferencia = new Transferencia();

        // generadores
        GeneradorRecibo consolaRecibo = new ReciboConsola();

        //service
        PedidoService serviceConsola = new PedidoService(consolaRecibo);

        serviceConsola.mostrarRecibo(pedido1,transferencia);
    }
}