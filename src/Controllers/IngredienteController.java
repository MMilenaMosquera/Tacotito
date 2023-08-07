package Controllers;

import DAO.tipoIngredienteDao;
import DAO.ingredienteDao;
import Model.Ingrediente;
import java.sql.SQLException;
import Model.TipoIngrediente;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author María Milena Mosquera.
 *
 */
public class IngredienteController {

    private ingredienteDao ingDao;
    private tipoIngredienteDao TipoIngDao;
    static IngredienteController instance;

    /**
     * Constructor de la controladora, que instancia el DAO de tipo Ingrediente
     * e Ingrediente.
     */
    public IngredienteController() throws SQLException {
        this.TipoIngDao = tipoIngredienteDao.getInstance();
        this.ingDao = ingredienteDao.getInstance();

    }

    /**
     * @return instsncia de la controladora.
     * @throws SQLException
     */
    public static IngredienteController getInstance() throws SQLException {
        if (instance == null) {
            instance = new IngredienteController();
        }
        return instance;
    }

    /**
     * Método público para guardar un Tipo de ingrediente y persistirla la base
     * de datos.
     *
     * @param detalle String con el nombre del tipo de ingrediente.
     * @param cantMaxima int Indica la cantidad maxina que se le puede agregar
     * al taco.
     *
     */
    public void guardarTipoIngrediente(String detalle, int cantMaxima) throws SQLException {
        TipoIngrediente ting = new TipoIngrediente(detalle, cantMaxima);
        this.TipoIngDao.nuevoTipoIngrediente(ting);
    }

    /**
     * Método para crear un Nuevo tipo de Ingrediente.
     *
     * @param Detalle nombre del tipo de ingrediente
     * @param CantidadMax Indica la cantidad maxina que se le puede agregar al
     * taco.
     * @throws SQLException
     * @throws SQLException
     */
    public void nuevoTipoIngrediente(String Detalle, int CantidadMax) throws SQLException, SQLException {
        TipoIngrediente tip = null;
        this.TipoIngDao.guardarTipoIngrediente(tip);
    }

    /**
     * Método público para modificar los datos de un tipo de ingrediente
     * existente.
     *
     * @param Detalle nombre del tipo de ingrediente
     * @param CantidadMax Indica la cantidad maxina que se le puede agregar al
     * taco.
     */

    public void modificarTipoIngrediente(String detalle, int cantMax, int id) throws Exception {
        TipoIngrediente ting = TipoIngDao.BuscarxId(id);
        if (ting == null) {

        } else {
            ting.setDetalle(detalle);
            ting.setCantidadMax(cantMax);

            try {
                this.TipoIngDao.modificar(ting);
            } catch (SQLException ex) {
                Logger.getLogger(IngredienteController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            }
        }
    }

    /**
     * Método público para obtener la lista de todas los tipos de ingredientes y
     * mostrarlos en el comboBox de la interfaz de usuario.
     *
     * @return List<Tipo Ingrediente> con todos los tipos de ingredientes de la
     * base de datos.
     */
    public List<TipoIngrediente> listarTipoIngrediente() throws SQLException {

        return this.TipoIngDao.listarTipoIngrediente();
    }

    /**
     * Método público para obtener los datos de un único tipo de ingrediente por
     * su ID, suministrado desde la interfaz de usuario por medio de la
     * seleccion del comboBox.
     *
     * @param id int con el ID del tipo de ingrediente solicitado.
     * @return instancia del tipo de ingrediente correspondiente al ID o null si
     * no existía.
     */
    public TipoIngrediente buscarTipoIngredientePorId(int id) throws SQLException {
        return this.TipoIngDao.BuscarxId(id);
    }

    /**
     * Método público para eliminar un tipo de ingrediente según su ID.
     *
     * @param id int con el ID del tipo de ingrediente a eliminar
     *
     */
    public void eliminarTipoIngrediente(int id) throws Exception {
        TipoIngrediente ting = this.TipoIngDao.BuscarxId(id);
        if (ting == null) {
            throw new Exception("Tipo Ingrediente No encontrado");
        } else {
            this.TipoIngDao.borrar(ting);
        }
    }

    /**
     * --------------------------------- Controladora para el IngredienteDao
     * ------------------------------------------
     */
    /**
     * Método para guardar un ingrediente y persistirla la base de datos.
     *
     * @param nombreIngrediente nombre del ingrediente
     * @param precio indica el valor del ingrediente
     * @param idTipoIngrediente trae del objeto de tipo ingrediente su id.
     * @throws SQLException
     */
    public void guardarIngrediente(String nombreIngrediente, int precio, int idTipoIngrediente) throws SQLException {
        TipoIngrediente id;
        id = TipoIngDao.BuscarxId(idTipoIngrediente);
        if (id != null) {
            Ingrediente ing = new Ingrediente(nombreIngrediente, precio, id);
            this.ingDao.guardarIngrediente(ing);
        }
    }

    /**
     * Método para crear un Nuevo tipo de Ingrediente.
     *
     * @param @param nombreIngrediente nombre del ingrediente
     * @param precio indica el valor del ingrediente
     * @param idTipoIngrediente trae del objeto de tipo ingrediente su id.
     * @throws SQLException
     */
    public void nuevoIngrediente(String nombreIngrediente, int precio, int idTipoIngrediente) throws SQLException {
        Ingrediente i = null;
        this.TipoIngDao.BuscarxId(idTipoIngrediente).getIdTipoIngrediente();
        this.ingDao.nuevoIngrediente(i);
    }

    /**
     * Método público para obtener los datos de un único ingrediente por su ID.
     *
     * @param id codigo que identifica cada ingrediente
     * @return la búsqueda en la base de datos del ingrediente con ID
     * selesccionado.
     * @throws SQLException
     */
    public Ingrediente buscarIngredientePorId(int id) throws SQLException {
        return this.ingDao.BuscarxId(id);
    }

    /**
     * Método público para modificar los datos de un tipo de ingrediente
     * existente.
     *
     * @param n@param nombreIngrediente nombre del ingrediente
     * @param precio indica el valor del ingrediente
     * @param idTipoIngrediente trae del objeto de tipo ingrediente su id.
     * @param id codigo que identifica el ingrediente
     * @throws Exception
     */
    public void modificarIngrediente(String nombreIngrediente, int precio, int idTipoIngrediente, int id) throws Exception {
        Ingrediente ing = ingDao.BuscarxId(id);
        TipoIngrediente idt;
        idt = TipoIngDao.BuscarxId(idTipoIngrediente);
        if (ing == null) {

        } else {
            ing.setNombreIngrediente(nombreIngrediente);
            ing.setPrecio(precio);
            ing.setTipoIngrediente(idt);
            ing.setId(id);

            try {
                this.ingDao.modificar(ing);
            } catch (SQLException ex) {
                Logger.getLogger(IngredienteController.class.getName()).log(Level.SEVERE, null, ex);
                throw ex;
            }
        }

    }

    /**
     * Método público para eliminar un ingrediente según su ID.
     *
     * @param id codigo que identifica cada ingrediente.
     * @throws Exception
     */
    public void eliminarIngrediente(int id) throws Exception {
        Ingrediente ing = this.ingDao.BuscarxId(id);
        if (ing == null) {
            throw new Exception("Ingrediente No encontrado");
        } else {
            this.ingDao.borrar(ing);
        }
    }

    /**
     * Método público para obtener la lista de todas los ingredientes.
     *
     * @return la lista de ingredientes que trae desde la base de datos.
     */
    public List<Ingrediente> listarIngredientes() throws SQLException {

        return this.ingDao.listarIngredientes();

    }

    public List<Ingrediente> listarIngredientes(Ingrediente ingrediente) throws SQLException {

        return this.ingDao.listarIngredientes();

    }

    public int precioIng(int id) throws SQLException {
        Ingrediente ing = this.ingDao.BuscarxId(id);
        if (ing != null) {
            return ing.getPrecio();
        } else {
            throw new SQLException("Ingrediente no encontrado con el ID: " + id);
        }
    }
    
   


}
