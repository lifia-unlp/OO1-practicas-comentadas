package oo1.balanza;

import java.time.LocalDate;

public class Ticket {

    private double pesoTotal;
    private double precioTotal;
    private int cantidadDeProductos;
    private LocalDate fecha;

    public Ticket(double pesoTotal, double precioTotal, int cantidadDeProductos) {
        this.pesoTotal = pesoTotal;
        this.precioTotal = precioTotal;
        this.cantidadDeProductos = cantidadDeProductos;
        this.fecha = LocalDate.now();
    }

    public double getPesoTotal() {
        return pesoTotal;
    }
    public double getPrecioTotal() {
        return precioTotal;
    }
    public int getCantidadDeProductos() {
        return cantidadDeProductos;
    }
    public LocalDate getFecha() {
        return fecha;
    }

    public double impuesto() {
        return this.precioTotal * 0.21;
    }
    
}
