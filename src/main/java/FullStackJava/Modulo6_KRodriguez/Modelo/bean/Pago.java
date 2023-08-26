package FullStackJava.Modulo6_KRodriguez.Modelo.bean;

public class Pago {
    private int id;
    private int clienteId;
    private int monto;
    private String fechaPago;

    //Constructor vacío.
    public Pago() {}

    //Constructor con parámetros.
    public Pago(int id, int clienteId, int monto, String fechaPago) {
        this.id = id;
        this.clienteId = clienteId;
        this.monto = monto;
        this.fechaPago = fechaPago;
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

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    //Método ToString
    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", clienteId=" + clienteId +
                ", monto=" + monto +
                ", fechaPago=" + fechaPago +
                '}';
    }
}

