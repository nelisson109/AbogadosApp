package com.example.abogados;

public class Abogado {
    private String id;
    private String nombre;
    private String especialidad;
    private String numeroTelefono;
    private String biografia;
    private String avatar;

    public Abogado(String id, String nombre, String especialidad, String numeroTelefono, String biografia, String avatar) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.numeroTelefono = numeroTelefono;
        this.biografia = biografia;
        this.avatar = avatar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
