package com.tienda.facturacion;

import com.tienda.carrito.Carrito;
import com.tienda.carrito.Item;
import com.tienda.clientes.Cliente;

import java.time.format.DateTimeFormatter;

public class FacturaPremium extends Factura{
    private float porcDesc;


    public FacturaPremium(Cliente cliente, Carrito carrito, float porcDesc) {
        super(cliente, carrito);
        this.porcDesc = porcDesc;
    }

    public float getPorcDesc() {
        return porcDesc;
    }

    public void setPorcDesc(float porcDesc) {
        this.porcDesc = porcDesc;
    }
    public double setTotal(){
        return super.getTotal()*porcDesc*(1+super.getIva());
    }
    public FacturaPremium(Cliente cliente, Carrito carrito) {
        super(cliente, carrito) ;
    }

    @Override
    public String mostrar(){
        super.mostrar();
    }
}
