package model;
// Generated Nov 24, 2016 2:14:55 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * CitaMedica generated by hbm2java
 */
public class CitaMedica  implements java.io.Serializable {


     private BigDecimal codCitaMedica;
     private Paciente paciente;
     private Turno turno;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private char estadoPago;
     private char estado;
     private String cajero;

    public CitaMedica() {
    }

	
    public CitaMedica(BigDecimal codCitaMedica, Paciente paciente, Turno turno, Date fechaCreacion, Date fechaModificacion, char estadoPago, char estado) {
        this.codCitaMedica = codCitaMedica;
        this.paciente = paciente;
        this.turno = turno;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.estadoPago = estadoPago;
        this.estado = estado;
    }
    public CitaMedica(BigDecimal codCitaMedica, Paciente paciente, Turno turno, Date fechaCreacion, Date fechaModificacion, char estadoPago, char estado, String cajero) {
       this.codCitaMedica = codCitaMedica;
       this.paciente = paciente;
       this.turno = turno;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.estadoPago = estadoPago;
       this.estado = estado;
       this.cajero = cajero;
    }
   
    public BigDecimal getCodCitaMedica() {
        return this.codCitaMedica;
    }
    
    public void setCodCitaMedica(BigDecimal codCitaMedica) {
        this.codCitaMedica = codCitaMedica;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Turno getTurno() {
        return this.turno;
    }
    
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public char getEstadoPago() {
        return this.estadoPago;
    }
    
    public void setEstadoPago(char estadoPago) {
        this.estadoPago = estadoPago;
    }
    public char getEstado() {
        return this.estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
    public String getCajero() {
        return this.cajero;
    }
    
    public void setCajero(String cajero) {
        this.cajero = cajero;
    }




}


