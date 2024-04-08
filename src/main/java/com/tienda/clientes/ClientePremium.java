package com.tienda.clientes;

public class ClientePremium extends Cliente{
    private float porcentajeDesc;

    public ClientePremium(String nombre, String dni) {
        super(nombre, dni);
        this.porcentajeDesc = 0;

    }
    public ClientePremium(String nombre, String dni, String email) {
        super(nombre, dni, email);
        this.porcentajeDesc = 0;
    }

    public float getPorcentajeDesc() {
        return porcentajeDesc;
    }

    public void setPorcentajeDesc(float porcentajeDesc) {
        this.porcentajeDesc = porcentajeDesc;
    }




}
