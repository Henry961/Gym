package com.project.gym.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "rutina")
public class RutinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_idrutina")
    private Long idRuta;

    @Column(name = "Nombrerutina")
    private String nombre;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "url")
    private String url;

    public Long getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Long idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
