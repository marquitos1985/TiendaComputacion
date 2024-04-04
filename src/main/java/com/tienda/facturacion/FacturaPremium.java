package com.tienda.facturacion;

import com.tienda.carrito.Carrito;
import com.tienda.clientes.Cliente;

public class FacturaPremium extends Factura{

    public FacturaPremium(Cliente cliente, Carrito carrito) {
        super(cliente, carrito) ;
    }
}
