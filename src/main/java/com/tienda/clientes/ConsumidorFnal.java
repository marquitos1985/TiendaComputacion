package com.tienda.clientes;

public class ConsumidorFnal extends Cliente{
    private float iva;

    public ConsumidorFnal(String nombre, String dni){
        super(nombre, dni);
        this.iva = 0.21f;
    }
    public ConsumidorFnal(String nombre, String dni, String email){
        super(nombre, dni, email);
        this.iva = 0.21f;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }


}
