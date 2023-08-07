
package Controllers;
import Model.Pedido;
import Model.Taco;
 import java.util.ArrayList;
import java.util.List;

public class PedidoController {

    private static PedidoController instancia;

    private int numeroPedidoActual = 1;
    private List<Pedido> listaPedido = new ArrayList<>(); 


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

    private int calcularPrecioTotalPedido(List<Taco> listaTacos) {
        int precioTotal = 0;
        for (Taco taco : listaTacos) {
            precioTotal += taco.getPrecioTotal();
        }
        return precioTotal;
    }

    
      
   public Taco calcularTacoMasCaro() {
    Taco tacoMasCaro = null;
    int maxPrecio = Integer.MIN_VALUE;
    for (Pedido pedido : listaPedido) {
        for (Taco taco : pedido.getTacos()) {
            System.out.println("Taco: " + taco.getNumeroTaco() + ", Precio: " + taco.getPrecioTotal());
            if (taco.getPrecioTotal() > maxPrecio) {
                maxPrecio = taco.getPrecioTotal();
                tacoMasCaro = taco;
            }
        }
    }
    return tacoMasCaro;
}


    public int calcularTacoMasEconomico() {
        int minPrecio = Integer.MIN_VALUE;
        for (Pedido pedido : listaPedido) {
            for (Taco taco : pedido.getTacos()) {
                if (taco.getPrecioTotal() < minPrecio) {
                    minPrecio = taco.getPrecioTotal();
                }
            }
        }
        return minPrecio;
    }

    public int calcularTacoPromedio() {
        int totalTacos = 0;
        int totalPrecio = 0;
        for (Pedido pedido : listaPedido) {
            for (Taco taco : pedido.getTacos()) {
                totalTacos++;
                totalPrecio += taco.getPrecioTotal();
            }
        }
        return totalTacos > 0 ? totalPrecio / totalTacos : 0;
    }
   
}


