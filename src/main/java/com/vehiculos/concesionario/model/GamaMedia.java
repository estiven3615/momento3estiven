 package com.vehiculos.concesionario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "gama_media")
public class GamaMedia {
    @Id
    int id;
    @Column(name = "marca", length = 100, nullable = false)
    String marca;
    @Column(name = "consumo", nullable = false)
    int Consumo;
    @Column(name = "transmision", length = 100, nullable = false)
    String transmiion;
    @Column(name = "precio", nullable = false)
    double precio;
    public GamaMedia(String marca, int consumo, String transmiion, double precio) {
        this.marca = marca;
        Consumo = consumo;
        this.transmiion = transmiion;
        this.precio = precio;
    }
    public GamaMedia() {
    }

    public GamaMedia(int id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public int getConsumo() {
        return Consumo;
    }
    public String getTransmiion() {
        return transmiion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setConsumo(int consumo) {
        Consumo = consumo;
    }
    public void setTransmiion(String transmiion) {
        this.transmiion = transmiion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public static void main(String[] args) {
        GamaMedia gamaMedia = new GamaMedia("Honda", 6, "Automática", 20000.0);
        System.out.println("Marca: " + gamaMedia.getMarca());
        System.out.println("Consumo: " + gamaMedia.getConsumo() + " L/100km");
        System.out.println("Transmisión: " + gamaMedia.getTransmiion());
        System.out.println("Precio: $" + gamaMedia.getPrecio());
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
   