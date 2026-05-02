package ar.edu.unpaz.domain;

import ar.edu.unpaz.domain.exceptions.ErrorComponente;

public class Componente {
    private String nombre;
    private double precioUnidad;
    private int cantidad;

    public Componente(String nombre, double precioUnidad, int cantidad) {
        if (precioUnidad <= 0) throw new ErrorComponente("el componente debe valer almenos 1 peso");
        if (nombre == null || nombre.isBlank() ) throw new ErrorComponente("el componente debe tener un nombre valido");
        if (cantidad <= 0 ) throw new ErrorComponente("la cantidad del componente debe ser mayor a 0");

        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public double getPrecioUnidad() {
        return this.precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
