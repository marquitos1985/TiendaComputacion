package com.tienda;

import com.tienda.carrito.Carrito;
import com.tienda.clientes.Cliente;
import com.tienda.facturacion.Factura;
import com.tienda.facturacion.FacturaConsFinal;

public class Main {

    public static void main(String[] args) {
        Tienda tienda = new Tienda(false);
        tienda.iniciar();

    }
}