package com.project.gym.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "instructor")
public class InstructorEntity {

    @Id
    @Column(name = "pk_idinstructor")
    private String idInstructor;

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

    public String getIdInstructor() {
        return idInstructor;
    }

    public void setIdInstructor(String idInstructor) {
        this.idInstructor = idInstructor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
