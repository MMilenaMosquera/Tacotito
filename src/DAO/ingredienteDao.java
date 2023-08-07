
package DAO;
import java.sql.*;
import DAO.tipoIngredienteDao;
import Model.Ingrediente;
import Model.TipoIngrediente;
import java.util.ArrayList;
import java.util.List;


public class ingredienteDao extends conexion{
    
    PreparedStatement ps;
    Statement st;
    tipoIngredienteDao tipDao = new tipoIngredienteDao();
    private static ingredienteDao instance ;
    
    public static ingredienteDao getInstance() throws SQLException {
        if ( instance == null ) {
            instance = new ingredienteDao();
        }
        instance.conectar();
        return instance;
    }
    
    public void guardarIngrediente(Ingrediente i) throws SQLException {
        if ( i.getId() == 0 ) {
            nuevoIngrediente(i);
        }
    }
   
    public void nuevoIngrediente(Ingrediente i) throws SQLException {
        String sql;
        sql = "INSERT INTO ingredientes (idTipoIngrediente, nombre, precio) VALUES (?, ?, ?)";    
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, i.getTipoIngrediente().getIdTipoIngrediente());
        ps.setString(2, i.getNombreIngrediente());
        ps.setInt(3, i.getPrecio());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if ( rs.next() ) {
            i.setId(rs.getInt(1));
        }
    }
     public void modificar(Ingrediente ing) throws SQLException {
        String sql = "UPDATE ingrediente set idTipoIngrediente = ?, nombre = ?, precio=? WHERE id= ?;";
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql);
        ps.setInt(1, ing.getTipoIngrediente().getIdTipoIngrediente());
        ps.setString(2, ing.getNombreIngrediente());
        ps.setInt(3, ing.getPrecio());
        ps.setInt(4, ing.getId());
        ps.executeUpdate();
    }
    public Ingrediente BuscarxId(int idIngrediente) throws SQLException {
        Ingrediente ing = null;
        String sql = "SELECT idTipoIngrediente, nombre, precio FROM ingredientes WHERE id = ?;";
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql);
        ps.setInt(1, idIngrediente);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int idTipoIngrediente;
            TipoIngrediente id = tipDao.BuscarxId(rs.getInt(1));
            ing = new Ingrediente();
            ing.setTipoIngrediente(id);
            ing.setNombreIngrediente(rs.getString(2));
            ing.setPrecio(rs.getInt(3));
           
            ing.setId(idIngrediente);
        }
        return ing;
     }
     
    public List<Ingrediente> listarIngredientes() throws SQLException {
        List<Ingrediente> salidaIngrediente = new ArrayList();
        Ingrediente i = null;
        if(con==null){
            this.conectar();
        }
        try {
           st = con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM ingredientes");
            while (rs.next()) {
                int idTipoIngrediente;
                TipoIngrediente id = tipDao.BuscarxId(rs.getInt(2));
                i = new Ingrediente();
                    i.setTipoIngrediente(id);
                    i.setNombreIngrediente(rs.getString(3));
                    i.setPrecio(rs.getInt(4));
                i.setId(rs.getInt(1));
                salidaIngrediente.add(i);
            }
        } catch (SQLException e) {
        }
        return salidaIngrediente;
    }
        public void borrar(Ingrediente ing) throws SQLException {
        String sql = "DELETE FROM ingredientes WHERE id= ?;";
         if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql);
        ps.setLong(1, ing.getId());
        ps.executeUpdate();
        ing.setId(0);
        ing = null;
    }

}