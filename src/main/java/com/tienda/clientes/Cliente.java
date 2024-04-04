package com.tienda.clientes;

public class Cliente {
    private static int autoid = 0;
    private final int id;
    private String nombre;
    private String dni;
    private String email;
    private boolean consFinal;
    private boolean premium;
    private boolean corporativo;


    public Cliente(String nombre, String dni, boolean consFinal, boolean premium, boolean corporativo) {
        this.id = autoid;
        this.nombre = nombre;
        this.dni = dni;
        this.consFinal = consFinal;
        this.premium = premium;
        this.corporativo = corporativo;

        autoid++;
    }

    public Cliente(String nombre, String dni, String email) {
        this.id = autoid;
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;

        autoid++;
    }

    public boolean isConsFinal() {
        return consFinal;
    }

    public void setConsFinal(boolean consFinal) {
        this.consFinal = consFinal;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isCorporativo() {
        return corporativo;
    }

    public void setCorporativo(boolean corporativo) {
        this.corporativo = corporativo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("%d. %s - %s", this.id, this.dni, this.nombre);
    }
}
