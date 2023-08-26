package FullStackJava.Modulo6_KRodriguez.Modelo.bean;

public class Chequeo {
    private int id;
    private int visitaId;
    private String detalle;
    private String estado;

    //Constructor vacío
    public Chequeo() {      
    }

    //Constructor con parámetros
    public Chequeo(int id, int visitaId, String detalle, String estado) {
        this.id = id;
        this.visitaId = visitaId;
        this.detalle = detalle;
        this.estado = estado;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVisitaId() {
        return visitaId;
    }

    public void setVisitaId(int visitaId) {
        this.visitaId = visitaId;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Método ToString
    @Override
    public String toString() {
        return "Chequeo{" +
                "id=" + id +
                ", visitaId=" + visitaId +
                ", detalle='" + detalle + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

