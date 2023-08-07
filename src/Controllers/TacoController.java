
package Controllers;

import DAO.ingredienteDao;
import DAO.tipoIngredienteDao;
import Model.Ingrediente;
import Model.Taco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TacoController {
    private IngredienteController ingredienteController;
    private List<Taco> listaTacos; // Agrega una lista de tacos para almacenarlos

    private static TacoController instance;

    public TacoController() throws SQLException {
        ingredienteController = new IngredienteController();
        listaTacos = new ArrayList<>(); // Inicializa la lista de tacos vacía
    }

    public static TacoController getInstance() throws SQLException {
        if (instance == null) {
            instance = new TacoController();
        }
        return instance;
    }

    public Taco cargarTaco(List<Ingrediente> ingredientes, int precioTotal) {
        int numeroTaco = listaTacos.size() + 1; // Asigna un número único a cada taco
        Taco taco = new Taco(numeroTaco, new ArrayList<>(ingredientes), precioTotal);
        listaTacos.add(taco); // Agrega el nuevo taco a la lista
        return taco;
    }

    public List<Taco> listarTacosConDetalles() {
        return listaTacos; // Devuelve la lista de tacos almacenados
    }
}

  
        
        
        
        

