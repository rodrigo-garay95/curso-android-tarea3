package com.saludo.tareaandroidsemana3;

public class Mascota {
    private String nombre;
    private int mascota;
    private int puntos;

    public Mascota(String nombre, int mascota, int puntos) {
        this.nombre = nombre;
        this.mascota = mascota;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMascota() {
        return mascota;
    }

    public void setMascota(int mascota) {
        this.mascota = mascota;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
