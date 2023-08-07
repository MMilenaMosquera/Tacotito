package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.TipoIngrediente;

public class tipoIngredienteDao extends conexion {
   
    PreparedStatement ps;
    Statement st;
    private static tipoIngredienteDao instance;
     
     public static tipoIngredienteDao getInstance() throws SQLException {
        if ( instance == null ) {
            instance = new tipoIngredienteDao();
        }
        instance.conectar();
        return instance;
    }

    public void guardarTipoIngrediente(TipoIngrediente tip) throws SQLException {
        if (tip.getIdTipoIngrediente()== 0 ){
            nuevoTipoIngrediente(tip);
        }
    }
    public void nuevoTipoIngrediente(TipoIngrediente tip) throws SQLException {
        String sql;
        sql = "INSERT INTO tipoingrediente (Detalle, cantMaxima) VALUES(?, ?);";
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, tip.getDetalle());
        ps.setInt(2, tip.getCantidadMax());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if ( rs.next() ) {
            tip.setIdTipoIngrediente(rs.getInt(1));
        }
    } 
    
    public void modificar(TipoIngrediente ting) throws SQLException {
        String sql = "UPDATE tipoingrediente set Detalle = ?, CantidadMax = ? WHERE id = ?;";
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql);
        ps.setString(1, ting.getDetalle());
        ps.setInt(2, ting.getCantidadMax());
        ps.setInt(3, ting.getIdTipoIngrediente());
        ps.executeUpdate();
    }
    
    public TipoIngrediente BuscarxId(int idTipoIngrediente) throws SQLException {
        TipoIngrediente ting=null;
        String sql = "SELECT Detalle, cantMaxima FROM tipoingrediente WHERE idTipoIngrediente = ?;";
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql);
        ps.setInt(1, idTipoIngrediente);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            ting = new TipoIngrediente(rs.getString(1), rs.getInt(2));
            ting.setIdTipoIngrediente(idTipoIngrediente);
        }
        return ting;
    }
    public List<TipoIngrediente> listarTipoIngrediente() throws SQLException {
        List<TipoIngrediente> salidaIngrediente = new ArrayList();
        TipoIngrediente tipoIng;
         if(con==null){
            this.conectar();
        }
        try {
            st = con.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM tipoingrediente");
            while (rs.next()) {
                tipoIng = new TipoIngrediente(rs.getString(2),
                                              rs.getInt(3));
                tipoIng.setIdTipoIngrediente(rs.getInt(1));
                salidaIngrediente.add(tipoIng);
            }
        } catch (SQLException e) {
        }
        return salidaIngrediente;
    }
     
     public void borrar(TipoIngrediente ting) throws SQLException {
        String sql = "DELETE FROM tipoingrediente WHERE idTipoIngrediente = ?;";
        if(con==null){
            this.conectar();
        }
        ps = con.prepareStatement(sql);
        ps.setLong(1, ting.getIdTipoIngrediente());
        ps.executeUpdate();
        ting.setIdTipoIngrediente(0);
        ting = null;
    }
    
    
    
   
}
     
     
     
     
     
     

