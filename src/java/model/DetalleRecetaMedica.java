package model;
// Generated Nov 22, 2016 2:21:24 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * DetalleRecetaMedica generated by hbm2java
 */
public class DetalleRecetaMedica  implements java.io.Serializable {


     private DetalleRecetaMedicaId id;
     private Medicamento medicamento;
     private RecetaMedica recetaMedica;
     private BigDecimal cantidad;
     private String indicacion;

    public DetalleRecetaMedica() {
    }

    public DetalleRecetaMedica(DetalleRecetaMedicaId id, Medicamento medicamento, RecetaMedica recetaMedica, BigDecimal cantidad, String indicacion) {
       this.id = id;
       this.medicamento = medicamento;
       this.recetaMedica = recetaMedica;
       this.cantidad = cantidad;
       this.indicacion = indicacion;
    }
   
    public DetalleRecetaMedicaId getId() {
        return this.id;
    }
    
    public void setId(DetalleRecetaMedicaId id) {
        this.id = id;
    }
    public Medicamento getMedicamento() {
        return this.medicamento;
    }
    
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    public RecetaMedica getRecetaMedica() {
        return this.recetaMedica;
    }
    
    public void setRecetaMedica(RecetaMedica recetaMedica) {
        this.recetaMedica = recetaMedica;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public String getIndicacion() {
        return this.indicacion;
    }
    
    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }




}


