
package Model;

import java.util.Objects;

public class Ingrediente {
    protected int id; 
    protected String nombreIngrediente;
    protected int precio;
    protected TipoIngrediente idTipoIngrediente;

    
    /*Constructures*/
    public Ingrediente() {
        
    }

    public Ingrediente(int id, String nombreIngrediente, int precio, TipoIngrediente idTipoIngrediente) {
        this.id = id;
        this.nombreIngrediente = nombreIngrediente;
        this.precio = precio;
        this.idTipoIngrediente = idTipoIngrediente;
    }
    
    public Ingrediente(String nombreIngrediente, int precio, TipoIngrediente idtipoIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
        this.precio = precio;
        this.idTipoIngrediente = idtipoIngrediente;
    }

    public Ingrediente(String nombreIngrediente, int precio) {
        this.nombreIngrediente = nombreIngrediente;
        this.precio = precio;
    }

      public Ingrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }
   

   
    /*geters and setters*/
    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public TipoIngrediente getTipoIngrediente() {
        return idTipoIngrediente;
    }

    public void setTipoIngrediente(TipoIngrediente tipoIngrediente) {
        this.idTipoIngrediente = tipoIngrediente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.nombreIngrediente);
        hash = 37 * hash + this.precio;
        hash = 37 * hash + Objects.hashCode(this.idTipoIngrediente);
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
        final Ingrediente other = (Ingrediente) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.precio != other.precio) {
            return false;
        }
        if (!Objects.equals(this.nombreIngrediente, other.nombreIngrediente)) {
            return false;
        }
        return Objects.equals(this.idTipoIngrediente, other.idTipoIngrediente);
    }
       
    /*toString*/

    @Override
    public String toString() {
        return "[" +nombreIngrediente +"("+ idTipoIngrediente+")" + ']';
    }

    public void addRow(Object[] fila) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
