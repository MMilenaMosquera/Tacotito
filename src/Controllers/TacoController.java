
package Controllers;

import DAO.ingredienteDao;
import DAO.tipoIngredienteDao;
import Model.Ingrediente;
import Model.Pedido;
import Model.Taco;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TacoController {
    
    private static TacoController instance;
    private IngredienteController ingredienteController;
    private List<Taco> listaTacos; 
    private int numeroTaco = 1; 

    public TacoController() throws SQLException {
        ingredienteController = new IngredienteController();
        listaTacos = new ArrayList<>(); 
    }
    public static TacoController getInstance() throws SQLException {
        if (instance == null) {
            instance = new TacoController();
        }
        return instance;
    }

    public Taco cargarTaco(List<Ingrediente> ingredientes) {
        int precioTotal = calcularPrecioTotal(ingredientes) ;
        Taco nuevotaco = new Taco(numeroTaco, ingredientes, precioTotal);
        listaTacos.add(nuevotaco); 
        numeroTaco++;
        return nuevotaco;
    }

    public List<Taco> listarTacosConDetalles() {
        return listaTacos; 
    }
    
    public int calcularPrecioTotal(List<Ingrediente> listaIngredientes) {
        int precioTotal = 0;
        for (Ingrediente ing : listaIngredientes) {
            precioTotal += ing.getPrecio();
        }
        return precioTotal;
    }
    
    
    
}

  
        
        
        
        

