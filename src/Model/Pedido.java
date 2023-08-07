package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Pedido {

    private int numeroPedido;
    private List<Taco> tacos;
    private int precioTotalPedido;

    public Pedido(int numeroPedido, List<Taco> tacos, int precioTotalPedido) {
        this.numeroPedido = numeroPedido;
        this.tacos = tacos;
        this.precioTotalPedido = precioTotalPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    public void agregarTaco(Taco taco) {
        tacos.add(taco);
    }

    public void eliminarTaco(Taco taco) {
        tacos.remove(taco);
    }

    public int getPrecioTotalPedido() {
        return precioTotalPedido;
    }

    public void setPrecioTotalPedido(int precioTotalPedido) {
        this.precioTotalPedido = precioTotalPedido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.numeroPedido;
        hash = 43 * hash + Objects.hashCode(this.tacos);
        hash = 43 * hash + this.precioTotalPedido;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (this.numeroPedido != other.numeroPedido) {
            return false;
        }
        if (this.precioTotalPedido != other.precioTotalPedido) {
            return false;
        }
        return Objects.equals(this.tacos, other.tacos);
    }

    @Override
    public String toString() {
        return "Pedido" + numeroPedido + tacos +  precioTotalPedido;
    }
    
}
