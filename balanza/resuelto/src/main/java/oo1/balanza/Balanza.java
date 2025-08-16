package oo1.balanza;

public class Balanza {

    private double pesoTotal;
    private double precioTotal;
    private int cantidadDeProductos;

    public Balanza() {
        pesoTotal = 0;
        precioTotal = 0;
        cantidadDeProductos = 0;
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

    public void ponerEnCero() {
        pesoTotal = 0;
        precioTotal = 0;
        cantidadDeProductos = 0;        
    }

    public void agregarProducto(Producto producto) {
        cantidadDeProductos = cantidadDeProductos + 1;
        precioTotal = precioTotal + producto.getPrecio();
        pesoTotal = pesoTotal + producto.getPeso();
    }

    public Ticket emitirTicket() {
        return new Ticket(pesoTotal, precioTotal, cantidadDeProductos);
    }

    

}
