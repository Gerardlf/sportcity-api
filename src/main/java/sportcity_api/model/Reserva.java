package sportcity_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reservas")
public class Reserva {

    //Clave primaria y autoincremento
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int pistaId;
    private String usuarioId;
    private String pistaNombre;
    private String fecha;
    private String hora;
    private String nombreCliente;
    private String telefonoCliente;
    private String comentario;
    private String deporte;

    //Constructor vacio para JPA
    public Reserva() {
    }

    public Reserva(Integer id, int pistaId, String usuarioId, String pistaNombre, String fecha, String hora, String nombreCliente, String telefonoCliente, String comentario, String deporte) {
        this.id = id;
        this.pistaId = pistaId;
        this.usuarioId = usuarioId;
        this.pistaNombre = pistaNombre;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.comentario = comentario;
        this.deporte = deporte;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPistaId() {
        return pistaId;
    }

    public void setPistaId(int pistaId) {
        this.pistaId = pistaId;
    }

    public String getPistaNombre() {
        return pistaNombre;
    }

    public void setPistaNombre(String pistaNombre) {
        this.pistaNombre = pistaNombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }
}
