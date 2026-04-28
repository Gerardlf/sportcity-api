package sportcity_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pistas")
public class Pista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String deporte;
    private double precioHora;
    private String descripcion;

    //Constructor vacio para JPA
    public Pista() {
    }

    public Pista(int id, String nombre, String deporte, double precioHora, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.deporte = deporte;
        this.precioHora = precioHora;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public String getDescripcion() {
        return descripcion;
    }


}
