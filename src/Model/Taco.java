package Model;

import java.util.List;
import java.util.Objects;

public class Taco {

    protected int numeroTaco;
    protected List<Ingrediente> ingredientes;
    protected int precioTotal;

    public Taco(int numeroTaco, List<Ingrediente> ingredientes, int precioTotal) {
        this.numeroTaco = numeroTaco;
        this.ingredientes = ingredientes;
        this.precioTotal = precioTotal;
    }

    public int getNumeroTaco() {
        return numeroTaco;
    }

    public void setNumeroTaco(int numeroTaco) {
        this.numeroTaco = numeroTaco;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }
    @Override
    public int hashCode() {
        int hash = 3;
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
        final Taco other = (Taco) obj;
        if (this.numeroTaco != other.numeroTaco) {
            return false;
        }
        return Objects.equals(this.ingredientes, other.ingredientes);
    }

    @Override
    public String toString() {
        return "*"+ numeroTaco +":" + "-"+  ingredientes + "["+precioTotal+"]"+ '*';
    }
}
