package com.project.gym.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @Column(name = "pk_idcliente")
    private String idCliente;

    @Column(name = "fk_idtipocliente")
    private Integer tipoCliente;

    @Column(name = "Nombre")
    private String nombre;

    @Temporal(TemporalType.DATE)
    @Column(name = "Fechanac")
    private Date fechaNacimiento;

    @Column(name = "Genero")
    private String genero;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Correo")
    private String correo;

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Integer tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
