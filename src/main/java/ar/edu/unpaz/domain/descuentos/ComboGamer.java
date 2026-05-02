package ar.edu.unpaz.domain.descuentos;

import ar.edu.unpaz.domain.Pedido;

public class ComboGamer implements ITipoDescuento{
    @Override
    public String getName() {
        return "Combo Gamer";
    }


    // aplicar 10% si hay un "cpu" o "procesador" entre los componentes
    @Override
    public double aplicarDescuento(Pedido pedido) {
        boolean agregoCpu = pedido.getComponentes().stream()
                .anyMatch(componente -> componente.getNombre().contains("cpu") || componente.getNombre().contains("procesador"));

        return agregoCpu ? pedido.calcularTotal() * 0.9 : pedido.calcularTotal();
    }
}
