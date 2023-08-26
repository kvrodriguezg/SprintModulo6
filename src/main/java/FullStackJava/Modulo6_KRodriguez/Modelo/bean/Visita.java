package FullStackJava.Modulo6_KRodriguez.Modelo.bean;

public class Visita {

	private int id;
    private int clienteId;
    private String fechaVisita;
    private String detalle;
    private int profesionalId;

    //Constructor vacío
    public Visita() {
        
    }
    
    //Constructor con parámetros.
    public Visita(int id, int clienteId, String fechaVisita, String detalle, int profesionalId) {
		super();
		this.id = id;
		this.clienteId = clienteId;
		this.fechaVisita = fechaVisita;
		this.detalle = detalle;
		this.profesionalId = profesionalId;
	}

    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getProfesionalId() {
        return profesionalId;
    }

    public void setProfesionalId(int profesionalId) {
        this.profesionalId = profesionalId;
    }
}
