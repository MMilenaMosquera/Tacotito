
package Controllers;
import Model.Pedido;
import Model.Taco;
 import java.util.ArrayList;
import java.util.List;

public class PedidoController {

    private static PedidoController instancia;

    private int numeroPedidoActual = 1;
    private List<Pedido> listaPedido;

    public PedidoController(){
        listaPedido = new ArrayList<>(); 
    }
    public static PedidoController obtenerInstancia() {
        if (instancia == null) {
            instancia = new PedidoController();
        }
        return instancia;
    }

    public Pedido crearPedido(List<Taco> listaTacos) {
        int precioTotalPedido = calcularPrecioTotalPedido(listaTacos);
        Pedido nuevoPedido = new Pedido(numeroPedidoActual, listaTacos, precioTotalPedido);
        listaPedido.add(nuevoPedido); 
        numeroPedidoActual++; 
        return nuevoPedido;
    }

    public int calcularPrecioTotalPedido(List<Taco> listaTacos) {
        int precioTotal = 0;
        for (Taco taco : listaTacos) {
            precioTotal += taco.getPrecioTotal();
        }
        return precioTotal;
    }

    
      
   public int calcularTacoMasCaro(List<Taco> listaTacos) {
    Taco tacoMasCaro = null;
    int maxPrecio = 0;
        for(Taco taco:listaTacos){
            if(taco.getPrecioTotal()>maxPrecio){
                maxPrecio = taco.getPrecioTotal();
                tacoMasCaro=taco;
            }
        
        }
    
    return tacoMasCaro.getNumeroTaco();
}


    public int calcularTacoMasEconomico(List<Taco> listaTacos) {
        Taco tacoMasEco= null;
        int minPrecio = Integer.MAX_VALUE;
           for(Taco taco:listaTacos){
            if(taco.getPrecioTotal()<minPrecio){
                minPrecio = taco.getPrecioTotal();
                tacoMasEco=taco;
            }
        }
    
    return tacoMasEco.getNumeroTaco();
}
    public int cantTacos(){
       return listaPedido.size();
    }
    public double calcularTacoPromedio(List<Taco> listaTacos) {
       return calcularPrecioTotalPedido(listaTacos)/ listaTacos.size();
      
    }
}



