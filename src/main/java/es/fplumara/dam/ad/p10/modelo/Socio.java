package es.fplumara.dam.ad.p10.modelo;

import java.math.BigDecimal;
import java.util.Date;

public class Socio {

    private int ID;
    private String nombre;
    private String plan;
    private BigDecimal cuota;
    private Date alta;
    private boolean activo;
    private String estado;

    public Socio(int ID, String nombre, String plan, BigDecimal cuota, Date alta, boolean activo, String estado) {
        this.ID = ID;
        this.nombre = nombre;
        this.plan = plan;
        this.cuota = cuota;
        this.alta = alta;
        this.activo = activo;
        this.estado = estado;
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

    public BigDecimal getCuota() {
        return cuota;
    }

    public void setCuota(BigDecimal cuota) {
        this.cuota = cuota;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
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
                ", activo=" + activo +
                ", estado='" + estado + '\'' +
                '}';
    }
}
