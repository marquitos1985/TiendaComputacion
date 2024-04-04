package com.tienda.facturacion;

import com.tienda.carrito.Carrito;
import com.tienda.clientes.Cliente;

public class FacturaCorporativo extends Factura{



    public FacturaCorporativo(Cliente cliente, Carrito carrito) {
        super(cliente, carrito) ;
    }
}
