package es.fplumara.dam.ad.p10.modelo;

import java.util.Date;

public class Socio {

    private int ID;
    private String nombre;
    private String plan;
    private double cuota;
    private Date alta;
    private boolean estado;

    public Socio(boolean estado, Date alta, double cuota, String plan, String nombre, int ID) {
        this.estado = estado;
        this.alta = alta;
        this.cuota = cuota;
        this.plan = plan;
        this.nombre = nombre;
        this.ID = ID;
    }

    public Socio() {}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", plan='" + plan + '\'' +
                ", cuota=" + cuota +
                ", alta=" + alta +
                ", estado=" + estado +
                '}';
    }
}
