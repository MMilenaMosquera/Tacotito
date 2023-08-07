
package Model;

import java.util.Objects;

public class TipoIngrediente {
    protected int idTipoIngrediente; 
    protected String detalle;
    protected int cantidadMax;

    /*contructores*/
    public TipoIngrediente(String detalle, int cantidadMax) {
        this.detalle = detalle;
        this.cantidadMax = cantidadMax;
    }   

    public TipoIngrediente(int idTipoIngrediente, String detalle, int cantidadMax) {
        this.idTipoIngrediente = idTipoIngrediente;
        this.detalle = detalle;
        this.cantidadMax = cantidadMax;
    }

    public TipoIngrediente() {

    }
    
    
   /*geters and seters*/
    
    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }

    public int getIdTipoIngrediente() {
        return idTipoIngrediente;
    }

    public void setIdTipoIngrediente(int idTipoIngrediente) {
        this.idTipoIngrediente = idTipoIngrediente;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idTipoIngrediente;
        hash = 79 * hash + Objects.hashCode(this.detalle);
        hash = 79 * hash + this.cantidadMax;
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
        final TipoIngrediente other = (TipoIngrediente) obj;
        if (this.idTipoIngrediente != other.idTipoIngrediente) {
            return false;
        }
        if (this.cantidadMax != other.cantidadMax) {
            return false;
        }
        return Objects.equals(this.detalle, other.detalle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ").append(idTipoIngrediente);
        sb.append(" - ").append(detalle);
        return sb.toString();
    }

}