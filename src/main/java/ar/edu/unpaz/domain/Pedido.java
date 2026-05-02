package ar.edu.unpaz.domain;

import ar.edu.unpaz.domain.exceptions.ErrorPedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Componente> componentes;
    private String idCliente;

    public Pedido(String idCliente) {
        if(idCliente == null || idCliente.isBlank()) throw new ErrorPedido("no se cargo correctamente un cliente al pedido");
        this.idCliente = idCliente;
        this.componentes = new ArrayList<>();
    }

    public double calcularTotal(){
        return this.componentes.stream()
                .mapToDouble((componente)-> componente.getCantidad() * componente.getPrecioUnidad())
                .sum();
    };

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void sumarComponente(Componente componente) {
        this.componentes.add(componente);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
