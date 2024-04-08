package com.tienda.facturacion;

import com.tienda.carrito.Carrito;
import com.tienda.clientes.Cliente;

public class FacturaConsFinal extends Factura{




    public FacturaConsFinal(Cliente cliente, Carrito carrito) {
        super(cliente, carrito) ;
        setTotal();
    }

    public double setTotal(){
        return super.getTotal()*(1 + super.getIva());
    }
    @Override
    public String mostrar() {
        return super.mostrar();
    }
}
